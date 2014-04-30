package models;

import javax.persistence.Entity;

import play.db.ebean.Model;

/**
 * Project entity managed by Ebean
 */
@Entity 
public class Student extends Model implements Person {

	@Override
	public Permission getPermission() {
		return Permission.STUDENT;
	}

}

