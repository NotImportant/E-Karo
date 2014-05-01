package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.data.validation.Constraints;
import play.db.ebean.Model;

@Entity
public class SchoolCode {

	@Id
	public Long id; // generated

	@Constraints.Required
	public String schoolType; // kindergarten, primary, Univ

	@Constraints.Required
	public String status; // public / private

	public SchoolCode(String schoolType, String status) {
		this.schoolType = schoolType;
		this.status = status;
	}

	public static Model.Finder<Long, SchoolCode> find = new Model.Finder<Long, SchoolCode>(
			Long.class, SchoolCode.class);

	public static List<SchoolCode> findByStatus(String status) {
		return SchoolCode.find.where().eq("status", status).findList();
	}

}
