package models;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Treasurer extends Person {

	public Permission getPermission() {
		return Permission.TREASURER;
	}

}
