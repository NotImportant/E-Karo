package models;

public class Admin implements Person {

	@Override
	public Permission getPermission() {
		return Permission.ADMIN;
	}
}
