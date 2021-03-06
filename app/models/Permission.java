package models;

import java.util.List;

import com.google.common.collect.Lists;

public enum Permission {

	ADMIN("Admin", 255), TREASURER("Treasurer", 128), GUARDIAN("Guardian", 64), STUDENT(
			"Student", 32), INTERESTED_PARTY("Interested Party", 16), NONE(
			"Undefined", 0);

	private int value;
	private String role;
	public static List<String> roles = Lists.newArrayList("Admin", "Student",
			"Guardian", "Institution", "Treasurer", "Other");
	Permission(String role, int value) {
		this.value = value;
		this.role = role;
	}

	public String getRole() {
		return role;
	}

	public int getValue() {
		return value;
	}

	public static boolean hasPermission(int permissionValue,
			Permission permission) {
		if (((permissionValue & permission.getValue()) == permission.getValue() && permissionValue == permission
				.getValue())) {
			return true;
		}
		return false;
	}

}
