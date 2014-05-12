package models;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import play.db.ebean.Model;

@Entity
@Table(name = "userstats")
public class UserStatistics extends Model {
	@Id
	public String username;
	@Column(name = "lastlogin")
	public Timestamp lastLogin;

	public String status;
	public Timestamp lastlogout;

	public static Model.Finder<String, UserStatistics> find = new Model.Finder<String, UserStatistics>(
			String.class, UserStatistics.class);

	public static void recordLogin(String username) {
		UserStatistics userStats = UserStatistics.find.byId(username);
		if (userStats == null) {
			userStats = new UserStatistics();
			userStats.username = username;
		}
		userStats.lastLogin = new Timestamp(new Date().getTime());
		userStats.status = "Logged In";
		System.out.println("Saving login date for " + userStats.username
				+ " as " + userStats.lastLogin);
		userStats.save();
	}

	public static void recordLogout(String username) {
		UserStatistics userStats = UserStatistics.find.byId(username);
		if (userStats == null) {
			userStats = new UserStatistics();
			userStats.username = username;
		}
		userStats.lastlogout = new Timestamp(new Date().getTime());
		userStats.status = "Logged out";
		System.out.println("Saving logout date for " + userStats.username
				+ " as " + userStats.lastlogout);
		userStats.save();
	}

}
