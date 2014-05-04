package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import play.data.validation.Constraints;
import play.db.ebean.Model;

/**
 * Project entity managed by Ebean firstName | lastName | middleName |
 * identificationNumber | schoolCode | guardianId
 */
@Entity 
@Table(name = "student")
public class Student extends Model implements Person {

	@Id
	public int identificationNumber;
	@Constraints.Required
	public String firstName;
	@Constraints.Required
	public String lastName;
	public String middleName;
	@Constraints.Required
	public int schoolCode;
	public int guardianId;

	public static Model.Finder<Integer, Student> find = new Model.Finder<Integer, Student>(
			Integer.class, Student.class);

	@Override
	public Permission getPermission() {
		return Permission.STUDENT;
	}

}

