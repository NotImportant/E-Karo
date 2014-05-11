package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import play.data.format.Formats;
import play.data.validation.Constraints;
import play.db.ebean.Model;

/**
 * Project entity managed by Ebean schoolCode | name | type | status
 */
@Entity 
@Table(name = "institution")
public class Institution extends Model {
	@Id
	@Constraints.Required
	@Formats.NonEmpty
	public int id;
	@Constraints.Required
	@Formats.NonEmpty
	public String name;
	public String level;
	public String category;
	public String address;
	
	public static Finder<Integer, Institution> find = new Finder<Integer, Institution>(
			Integer.class, Institution.class);
	
	public static List<Student> getAllStudents(int institutionId) {
		return Student.find.where().eq("institutionId", institutionId)
				.findList();
	}

	@Override
	public String toString() {
		return "Institution(" + name + ")";
	}

}
