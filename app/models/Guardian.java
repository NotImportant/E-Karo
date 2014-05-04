package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import play.data.validation.Constraints;
import play.db.ebean.Model;

/**
 * Project entity managed by Ebean firstName | lastName | middleName |
 * phoneNumber | guardianId | email
 */
@Entity 
@Table(name = "guardian")
public class Guardian extends Model implements Person {

	@Id
	public int guardianId;
	public String email;
	@Constraints.Required
	public String firstName;
	@Constraints.Required
	public String lastName;
	public String middleName;
	public String phoneNumber;
    public static Model.Finder<Long,Guardian> find = new Model.Finder<Long,Guardian>(Long.class, Guardian.class);

	@Override
	public Permission getPermission() {
		return Permission.GUARDIAN;
	}

}
