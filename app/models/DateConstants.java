package models;

import java.sql.Timestamp;

public enum DateConstants {

	INFINITY("9999-12-31 23:59:00"), NOW;
	public Timestamp businessDate;

	private DateConstants() {
		businessDate = new Timestamp(new java.util.Date().getTime());
	}
	DateConstants(String date) {
		businessDate = Timestamp.valueOf(date);
	}
}
