package models;

import java.util.*;

import javax.persistence.*;

import play.db.ebean.*;

import com.avaje.ebean.*;

/**
 * Project entity managed by Ebean
 */
@Entity 
public class School extends Model {
	@Id
	Long id;
	Long schoolCode;
	String schoolType; //primary, secondary, University
	String name;
	
    @ManyToMany
    public List<Student> students = new ArrayList<Student>();
    
    public School(Long schoolCode, String schoolType, String name, Student student)
    {
    	this.schoolCode = schoolCode;
    	this.schoolType = schoolType;
    	this.name = name;
    	this.students.add(student);
    }
    public static Model.Finder<Long,School> find = new Model.Finder<Long,School>(Long.class, School.class);

}
