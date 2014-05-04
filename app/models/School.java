package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import play.db.ebean.Model;

/**
 * Project entity managed by Ebean schoolCode | name | type | status
 */
@Entity 
@Table(name = "school")
public class School extends Model {
	@Id
	public int schoolCode;
	public String name;
	public int type;
	public int status;
	
	public static Finder<Integer, School> find = new Finder<Integer, School>(
			Integer.class, School.class);
	
	@Override
	public String toString() {
		return "School(" + name + ")";
	}

}
