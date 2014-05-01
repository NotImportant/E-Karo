package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import play.data.validation.Constraints;
import play.db.ebean.Model;

/**
 * Project entity managed by Ebean
 */
@Entity 
public class Student extends Model implements Person {

	@Id
	public Long id;

	@Constraints.Required
	public int admissionNumber;

	@Constraints.Required
	public String firstName;

	@Constraints.Required
	public String lastName;

	@OneToOne
	public School school;

	public static Model.Finder<Integer, Student> find = new Model.Finder<Integer, Student>(
			Integer.class, Student.class);

	public static List<Student> findAll() {
		return find.all();
	}

	public static List<Student> findAllInSchool(School school) {
		return find.where().eq("school", school).findList();
	}

	public static List<Student> findByName(String firstName, String lastName) {
		if (firstName == null && lastName == null) {
			return findAll();
		} else if (firstName == null && lastName != null) {
			return find.where().eq("lastName", lastName).findList();
		} else if (firstName != null && lastName == null) {
			return find.where().eq("lastName", lastName).findList();
		} else {
			return find.where().eq("firstName", firstName).where()
					.eq("lastName", lastName).findList();
		}
	}
	public static Student create(String firstName, String lastName,
			int admissionNumber, String schoolName) {
		Student student = new Student();
		student.school = School.findByName(schoolName);
		student.firstName = firstName;
		student.lastName = lastName;
		student.admissionNumber = admissionNumber;
		student.save();
		return student;
	}

	@Override
	public Permission getPermission() {
		return Permission.STUDENT;
	}

}

