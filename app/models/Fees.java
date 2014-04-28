package models;

import java.util.*;

import javax.persistence.*;

import play.db.ebean.*;

import com.avaje.ebean.*;

/**
 * Project entity managed by Ebean
 */
@Entity 
public class Fees extends Model{
	@Id
	Long id;
	
	public static Finder <Integer, Fees>find = new Model.Finder<Integer,Fees>(Integer.class, Fees.class);;

}
