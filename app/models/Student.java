package models;

import javax.persistence.Entity;
import javax.persistence.Table;

import play.data.validation.Constraints;
import play.db.ebean.Model;

/**
 * Project entity managed by Ebean firstName | lastName | middleName |
 * identificationNumber | schoolCode | guardianId
 */
@Entity 
@Table(name = "student")
public class Student extends Person {

	@Constraints.Required
	public int institutionId;

	@Constraints.Required
	public int guardianId;

	public static Model.Finder<Integer, Student> find = new Model.Finder<Integer, Student>(
			Integer.class, Student.class);


	public Permission getPermission() {
		return Permission.STUDENT;
	}

}

