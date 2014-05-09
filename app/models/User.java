package models;

import java.util.List;

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
@Table(name = "account")
public class User extends Model {

    private static final long serialVersionUID = 1L;

	@Id
    @Constraints.Required
    @Formats.NonEmpty
	public String username;

	@Constraints.Required
	public String email;
    
    @Constraints.Required
    public String password;
    
	public String role;

    // -- Queries
    
    public static Model.Finder<String,User> find = new Model.Finder<String,User>(String.class, User.class);
    
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
		return find.where().eq("username", username).findUnique();
	}
    
    /**
     * Authenticate a User.
     */
	public static User authenticate(String username, String password) {
		return find.where().eq("username", username).eq("password", password)
				.findUnique();
    }
    
	public static User authenticateRegistration(String username) {
		return find.where().eq("username", username).findUnique();
	}

	/**
	 * Create a task
	 */
	public static User create(String username, String email, String password,
			String role) {
		User newUser = new User();
		newUser.email = email;
		newUser.username = username;
		newUser.password = password;
		newUser.role = role;
		newUser.save();
		return newUser;
	}
    // --
    
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

}

