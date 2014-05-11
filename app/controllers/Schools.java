package controllers;

import static play.data.Form.form;

import java.util.ArrayList;

import models.Task;
import models.User;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import views.html.tasks.folder;
import views.html.tasks.item;

/**
 * Manage tasks related operations.
 */
@Security.Authenticated(Secured.class)
public class Schools extends Controller {

	/**
	 * Display the dashboard.
	 */
	public static Result index() {
		int id = User.findByUsername(request().username()).id;
		return ok();
	}
  
	// -- Tasks

	/**
	 * Create a task in this project.
	 */
	public static Result add(Long project, String folder) {
		if (Secured.isMemberOf(project)) {
			Form<Task> taskForm = form(Task.class).bindFromRequest();
			if (taskForm.hasErrors()) {
				return badRequest();
			} else {
				return ok(item.render(
						Task.create(taskForm.get(), project, folder), true));
			}
		} else {
			return forbidden();
		}
	}

	/**
	 * Update a task
	 */
	public static Result update(Long task) {
		if (Secured.isOwnerOf(task)) {
			Task.markAsDone(task,
					Boolean.valueOf(form().bindFromRequest().get("done")));
			return ok();
		} else {
			return forbidden();
		}
	}

	/**
	 * Delete a task
	 */
	public static Result delete(Long task) {
		if (Secured.isOwnerOf(task)) {
			Task.find.ref(task).delete();
			return ok();
		} else {
			return forbidden();
		}
	}

	// -- Task folders

	/**
	 * Add a new folder.
	 */
	public static Result addFolder() {
		return ok(folder.render("New folder", new ArrayList<Task>()));
	}

	/**
	 * Delete a full tasks folder.
	 */
	public static Result deleteFolder(Long project, String folder) {
		if (Secured.isMemberOf(project)) {
			Task.deleteInFolder(project, folder);
			return ok();
		} else {
			return forbidden();
		}
	}

	/**
	 * Rename a tasks folder.
	 */
	public static Result renameFolder(Long project, String folder) {
		if (Secured.isMemberOf(project)) {
			return ok(Task.renameFolder(project, folder, form()
					.bindFromRequest().get("name")));
		} else {
			return forbidden();
		}
	}

}

