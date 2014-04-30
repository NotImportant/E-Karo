package models;

public class Treasurer implements Person {

	@Override
	public Permission getPermission() {
		return Permission.TREASURER;
	}

}
