package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import play.data.validation.Constraints;
import play.db.ebean.Model;

@Entity
@Table(name = "person")
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
