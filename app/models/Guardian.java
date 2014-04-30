package models;

import javax.persistence.Entity;

import play.db.ebean.Model;

/**
 * Project entity managed by Ebean
 */
@Entity 
public class Guardian extends Model implements Person {

    public static Model.Finder<Long,Guardian> find = new Model.Finder<Long,Guardian>(Long.class, Guardian.class);

	@Override
	public Permission getPermission() {
		return Permission.GUARDIAN;
	}

}
