package models;

import javax.persistence.Column;
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
	@Column(name = "firstname")
	public String firstName;
	@Constraints.Required
	@Column(name = "lastname")
	public String lastName;
	public String gender;
}
