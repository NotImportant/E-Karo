package models;

import javax.persistence.Id;

import play.data.validation.Constraints;
import play.db.ebean.Model;

public class Person extends Model {
	@Id
	@Constraints.Required
	public int id;
	@Constraints.Required
	public String firstName;
	@Constraints.Required
	public String lastName;
	public String gender;
}
