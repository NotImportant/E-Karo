package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;

import com.avaje.ebean.*;

/**
 * Project entity managed by Ebean
 */
@Entity 
public class Student extends Model {

    private static final long serialVersionUID = 1L;

	@Id
	public Long id;
	
    public int admissionNumber;
    
    public String firstName;
    
    public String lastName;
    
    public String school;
    
    @OneToOne
    public Fees fees;
    
    @ManyToMany
    public List<Guardian> guardians = new ArrayList<Guardian>();
    
    public Student(int admissionNumber, String firstName, String lastName, Guardian guardian, String school,  Fees fees) {
        this.admissionNumber = admissionNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.school = school;
        this.fees = fees;
        guardians.add(guardian);
    }
    
    // -- Queries
    
    public static Model.Finder<Long,Student> find = new Model.Finder<Long,Student>(Long.class, Student.class);
    
    /**
     * Delete student from school
     */
    public static void deleteInFolder(String school) {
        Ebean.createSqlUpdate(
            "delete from student where school = :school"
        ).setParameter("school", school).execute();
    }
    
    /**
     * Create a new project.
     */
    public static Student create(int admissionNumber, String firstName, String lastName, String school) {
        Student project = new Student(admissionNumber, firstName, lastName, null, school, Fees.find.ref(admissionNumber));
        project.save();
        project.saveManyToManyAssociations("members");
        return project;
    }
    
    /**
     * Change Student name
     */
    public static String rename(Long studentId, String newFirstName, String newLastName) {
        Student student = find.ref(studentId);
        student.firstName = newFirstName;
        student.lastName = newLastName;
        student.update();
        return newFirstName+" "+newLastName;
    }
    
    
    /**
     * Add a guardian for this student
     */
    public static void addGuardian(Long student, Long guardian) {
        Student p = Student.find.setId(student).fetch("students", "email").findUnique();
        p.guardians.add(
        		Guardian.find.ref(guardian)
        );
        p.saveManyToManyAssociations("members");
    }
   
    public String toString() {
        return "Student(" + id + ") with " + (guardians == null ? "null" : guardians.size()) + " guardians";
    }

}

