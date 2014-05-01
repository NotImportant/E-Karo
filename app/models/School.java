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
public class School extends Model {
	@Id
	public Long id;
	
	@OneToOne
	public SchoolCode schoolCode;
	
	@Constraints.Required
	public String name;
    
    public static Model.Finder<Long,School> find = new Model.Finder<Long,School>(Long.class, School.class);

	/**
	 * Retrieve all schools.
	 */
	public static List<School> findAll() {
		return find.all();
	}

	/**
	 * Retrieve all schools by schoolCode
	 */
	public static List<School> findAllBySchoolCode(SchoolCode schoolCode) {
		return find.where().eq("schoolCode", schoolCode).findList();
	}

	/**
	 * Retrieve a School by name.
	 */
	public static School findByName(String name) {
		return find.where().eq("name", name).findUnique();
	}

	@Override
	public String toString() {
		return "School(" + name + ")";
	}

}
