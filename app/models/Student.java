package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

import play.data.validation.Constraints;
import play.db.ebean.Model;

/**
 * Project entity managed by Ebean firstName | lastName | middleName |
 * identificationNumber | schoolCode | guardianId
 */
@Entity 
@Table(name = "student")
@MappedSuperclass
public class Student extends Person {

	@Constraints.Required
	@Column(name = "institutionid")
	public int institutionId;

	@Constraints.Required
	@Column(name = "guardianid")
	public int guardianId;
	public int classyear;
	public int accountid;
	public static Model.Finder<Integer, Student> find = new Model.Finder<Integer, Student>(
			Integer.class, Student.class);


	public Permission getPermission() {
		return Permission.STUDENT;
	}

	public static Student create(Student student, String username) {
		return null;
	}

	public static void createAndInsert(String username, int institutionId2,
			int guardianId,
			String firstName,
 String lastName, int classyear2) {
		Student student = new Student();
		student.classyear = classyear2;
		student.institutionId = institutionId2;
		student.firstName = firstName;
		student.guardianId = guardianId;
		student.lastName = lastName;
		student.accountid = 2;
		student.id = User.find.where().eq("username", username).findUnique().id;
		student.save();

	}

}

