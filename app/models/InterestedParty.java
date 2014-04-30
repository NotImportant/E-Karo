package models;

public class InterestedParty implements Person {
	@Override
	public Permission getPermission() {
		return Permission.INTERESTED_PARTY;
	}
}
