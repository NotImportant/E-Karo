package models;

public class Admin extends Person {

	public Permission getPermission() {
		return Permission.ADMIN;
	}
}
