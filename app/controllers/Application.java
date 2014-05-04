package controllers;

import static play.data.Form.form;
import models.Guardian;
import views.html.*;
import models.User;
import play.Routes;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.login;
import views.html.signup;
public class Application extends Controller {
  
    // -- Authentication
    
    public static class Login {
        
		public String username;
        public String password;
        
        public String validate() {
			if (User.authenticate(username, password) == null) {
				return "Invalid username or password";
            }
            return null;
        }
        
    }
    
	public static class SignUp {
		public String username;
		public String password;
		public String password2;
		public String email;
		public String role;

		public String validate() {
			if (!User.authenticateRegistration(username, password, password2,
					email, role)) {
				return "Registration invalid. Try again.";
			}
			User.create(username, email, password, role);
			return null;
		}
	}

    /**
     * Login page.
     */
    public static Result login() {
        return ok(
            login.render(form(Login.class))
        );
    }

	/**
	 * Handle login form submission.
	 */
    public static Result authenticate() {
        Form<Login> loginForm = form(Login.class).bindFromRequest();
        if(loginForm.hasErrors()) {
            return badRequest(login.render(loginForm));
        } else {
			session("username", loginForm.get().username);
            return redirect(
                routes.Projects.index()
            );
        }
    }

	/**
	 * more Info page page.
	 */
	public static Result moreinfo() {
		return ok(moreinfo.render(null, form(models.Guardian.class)));
	}

	/**
	 * Add User info a user.
	 */
	public static Result moreInformation(String username) {
		User user = User.findByUsername(username);
		String role = user.role;
		if (role == "Guardian") {
			Form<Guardian> userForm = form(Guardian.class).bindFromRequest();
		if (userForm.hasErrors()) {
				return badRequest(moreinfo.render(username, userForm));
		} else {
				return ok(moreinfo.render(username, userForm));
			}

	
	}
return ok();
	}

	/**
	 * Registration page.
	 */
	public static Result signup() {
		return ok(signup.render(form(SignUp.class)));
	}

	/**
	 * Handle registration form submission.
	 */
	public static Result authenticateSignUp() {
		Form<SignUp> signupform = form(SignUp.class).bindFromRequest();
		if (signupform.hasErrors()) {
			return badRequest(signup.render(signupform));
		} else {
			session("username", signupform.get().username);
			return redirect(routes.Application.moreInformation(
signupform.get().username));
		}
	}
    /**
     * Logout and clean the session.
     */
    public static Result logout() {
        session().clear();
        flash("success", "You've been logged out");
        return redirect(
            routes.Application.login()
        );
    }
  
    // -- Javascript routing
    
    public static Result javascriptRoutes() {
        response().setContentType("text/javascript");
        return ok(
            Routes.javascriptRouter("jsRoutes",
            
                // Routes for Projects
                controllers.routes.javascript.Projects.add(), 
                controllers.routes.javascript.Projects.delete(), 
                controllers.routes.javascript.Projects.rename(),
                controllers.routes.javascript.Projects.addGroup(), 
                controllers.routes.javascript.Projects.deleteGroup(), 
                controllers.routes.javascript.Projects.renameGroup(),
                controllers.routes.javascript.Projects.addUser(), 
                controllers.routes.javascript.Projects.removeUser(), 
                
                // Routes for Tasks
                controllers.routes.javascript.Tasks.addFolder(), 
                controllers.routes.javascript.Tasks.renameFolder(), 
                controllers.routes.javascript.Tasks.deleteFolder(), 
                controllers.routes.javascript.Tasks.index(),
                controllers.routes.javascript.Tasks.add(), 
                controllers.routes.javascript.Tasks.update(), 
                controllers.routes.javascript.Tasks.delete()
                
            )
        );
    }

}
