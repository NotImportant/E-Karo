package models;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Admin extends Person {

	public Permission getPermission() {
		return Permission.ADMIN;
	}
}
