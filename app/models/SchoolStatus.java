package models;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import play.db.ebean.Model;

@Entity
@Table(name = "school_status")
public class SchoolStatus extends Model {
	@Id
	public int id;
	public String description;
	
	public static Finder<Integer, SchoolStatus> find = new Finder<Integer, SchoolStatus>(
			Integer.class, SchoolStatus.class);
}
