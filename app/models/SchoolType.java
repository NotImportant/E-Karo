package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import play.db.ebean.Model;

@Entity
@Table(name = "school_type")
public class SchoolType extends Model {

	@Id
	public int code;
	public String description;

}
