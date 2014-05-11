package models;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import play.data.format.Formats;
import play.data.validation.Constraints;
import play.db.ebean.Model;

/**
 * User entity managed by Ebean
 */
@Entity
@Table(name = "ekarouser")
public class User extends Model {

	private static final long serialVersionUID = 1L;

	@Id
	public int id;

	@Constraints.Required
	@Formats.NonEmpty
	public String username;

	@Constraints.Required
	public String email;

	@Constraints.Required
	public String password;

	@Column(name = "user_type")
	public char role;

	@Column(name = "in_d")
	public Timestamp registrationDate;

	@Column(name = "out_d")
	public Timestamp removeDate;

	@Column(name = "upd_d")
	public Timestamp updateDate;

	// -- Queries

	public static Model.Finder<Integer, User> find = new Model.Finder<Integer, User>(
			Integer.class, User.class);

	/**
	 * Retrieve all users.
	 */
	public static List<User> findAll() {
		return find.all();
	}

	/**
	 * Retrieve a User from email.
	 */
	public static User findByEmail(String email) {
		return find.where().eq("email", email).findUnique();
	}

	/**
	 * Retrieve a User from username.
	 */
	public static User findByUsername(String username) {
		return getValidUser(username);
	}

	public static List<User> findManyByUsername(String username) {
		return find.where().eq("username", username).findList();
	}

	/**
	 * Authenticate a User.
	 */
	public static User authenticate(String username, String password) {
		return find.where().eq("username", username).eq("password", password)
				.eq("removeDate", DateConstants.INFINITY.businessDate)
				.findUnique();
	}

	public static User authenticateRegistration(String username) {
		return find.where().eq("username", username).findUnique();
	}

	/**
	 * Create a user
	 */
	public static User createOrUpdate(String username, String email,
			String password, String role, boolean isNew) {
		User newUser = new User();
		newUser.email = email;
		newUser.username = username;
		newUser.password = password;
		newUser.role = role.toUpperCase().charAt(0);
		newUser.id = User.find.nextId();
		newUser.updateDate = DateConstants.NOW.businessDate;
		if (isNew) {
			newUser.registrationDate = DateConstants.NOW.businessDate;
		}
		newUser.removeDate = DateConstants.INFINITY.businessDate;
		return newUser;
	}

	public static User createAndInsert(String username, String email,
			String password, String role) {
		User user = createOrUpdate(username, email, password, role, true);
		user.save();
		return user;
	}

	public static User getValidUser(String username) {
		return find.where().eq("username", username)
				.eq("removeDate", DateConstants.INFINITY.businessDate)
				.findUnique();
	}

	public static String changePassword(String username, String oldPassword,
			String newPassword1, String newPassword2) {

		User userToUpdate = getValidUser(username);

		System.out.print(userToUpdate.username + " " + userToUpdate.email + " "
				+ userToUpdate.password + " ");
		if (oldPassword.equals(userToUpdate.password)
				&& newPassword1.equals(newPassword2)) {

			userToUpdate.removeDate = DateConstants.NOW.businessDate;
			userToUpdate.save();
			User user = createOrUpdate(username, userToUpdate.email,
					newPassword1, String.valueOf(userToUpdate.role), false);
			user.registrationDate = userToUpdate.registrationDate;
			user.save();
			return null;
		} else {
			return "Cannot change Password. Please try again.";
		}
	}

	@Override
	public String toString() {
		return "User(" + email + ")";
	}

	public static boolean authenticateRegistration(String username,
			String password, String password2, String email, String role) {

		return password2.equals(password)
				&& find.where().eq("username", username)
						.eq("password", password).findList().size() == 0
				&& password.length() > 6 && email.contains("@");
	}

	public static void updateUser(User user, String password, String email) {
		User newUser = user;
		if (email != null) {
			newUser.email = email;
		}
		if (password != null) {
			newUser.password = password;
		}
		newUser.save();
	}

}
