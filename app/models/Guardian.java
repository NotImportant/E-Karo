package models;

import java.util.*;

import javax.persistence.*;

import play.db.ebean.*;

import com.avaje.ebean.*;

/**
 * Project entity managed by Ebean
 */
@Entity 
public class Guardian extends Model {

    public static Model.Finder<Long,Guardian> find = new Model.Finder<Long,Guardian>(Long.class, Guardian.class);

}
