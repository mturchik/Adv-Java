package lab3;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * In this lab focus on CLASS Encapsulation and  the Single Responsibility 
 * Principle (SRP) and fix/add code as necessary.
 * 
 * Pay special attention to the following issues:
 *    1. It is not the job of this class or any of the methods in this class
 *       to do output. So you must remove the System.out.println statements.
 *       But we still need output. What to do? Delegate that work to a new
 *       object that IS responsible for output. Create a report service class
 *       and have the employee object talk to that object to perform the output.
 *       Using a separate class inside another like this is a form of class
 *       encapsulation -- hiding a class within another class.
 *       Notice how you can easily change the way output is done, going from
 *       console output to JOptionPane output if desired without the Employee
 *       object knowing about the change. Flexible!
 * 
 *    2. When doing method validation we have a similar problem. It is not the
 *       job of this class or any of its methods to do output. But error
 *       messages aren't a reporting issue. Error messages can be produced
 *       from invalid data in any program, whether or not those programs have
 *       reporting services. So we need a different approach. The right thing
 *       to do is to create an exception that notifies the user that a 
 *       validation error has happened. An example of this is provided in the
 *       setFirstName() method. Mimic this behavior in other setter methods.
 *       Note: a thorough discussion of Exceptions and how to use them is
 *       a future topic of this course. But those details are beyond the
 *       scope of this lesson.
 * 
 * Review the tips in the document "EncapCheckList.pdf" if needed.
 *
 * @author      Jim Lombardo, WCTC Instructor
 * @version     1.02
 */
public class Employee {
    private String firstName;
    private String lastName;
    private String ssn;
    private boolean metWithHr;
    private boolean metDeptStaff;
    private boolean reviewedDeptPolicies;
    private boolean movedIn;
    private String cubeId;
    private Date orientationDate;
    private OutputService output;

    public Employee(String firstName, String lastName, String ssn) {
        // Using setter method guarantees validation will be performed
        // Ignore the warning messages for now. Will be explained later
        setFirstName(firstName);
        setLastName(lastName);
        setSsn(ssn);
        output = new OutputService();
    }
    
    /* 
        This should be private because it is useful only to this class and then,
        only as a helper method to other methods. This is method hiding - a type 
        of encapsulation where we put frequently used code in one place for for
        easy editing later if necessary.
    */
    private String getFormattedDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
        return sdf.format(orientationDate);
    }
    
    /*
        This method is public because it must be available to other classes in
        this project. Notice that it controls the order in which the helper methods
        are called. Order isn't always an issue, but here it obviously is, which
        may be an important requirement.
    */
    public void doFirstTimeOrientation(String cubeId) {
        orientationDate = new Date();
        meetWithHrForBenefitAndSalryInfo();
        meetDepartmentStaff();
        reviewDeptPolicies();
        moveIntoCubicle(cubeId);
    }

    // The following methods may be public or private, depending on whether
    // they need to be called from other classes independently.

    // Assume this must be performed first, and assume that an employee
    // would only do this once, upon being hired. If that were true, this
    // method should not be public. It should only be available to this class
    // and should only be called as part of the larger task of:
    private void meetWithHrForBenefitAndSalryInfo() {
        metWithHr = true;
        output.simpleOutput(firstName + " " + lastName + " met with Hr on "
            + getFormattedDate());
    }

    // Assume this must be performed first, and assume that an employee
    // would only do this once, upon being hired. If that were true, this
    // method should not be public. It should only be available to this class
    // and should only be called as part of the larger task of:
    // doFirtTimeOrientation()
    private void meetDepartmentStaff() {
        metDeptStaff = true;
        output.simpleOutput(firstName + " " + lastName + " met with Dept. Staff on "
            + getFormattedDate());
    }

    // Assume this must be performed third. And assume that because department
    // policies may change that this method may need to be called 
    // independently from other classes.
    public void reviewDeptPolicies() {
        reviewedDeptPolicies = true;
        output.simpleOutput(firstName + " " + lastName + " reviewed Dept policies on "
            + getFormattedDate());
    }

    // Assume this must be performed 4th. And assume that because employees
    // sometimes change office locations that this method may need to be called 
    // independently from other classes.
    public void moveIntoCubicle(String cubeId) {
        this.cubeId = cubeId;
        this.movedIn = true;
        output.simpleOutput(firstName + " " + lastName + " moved into cubicle "
                + cubeId + " on " + getFormattedDate());
    }

    public String getFirstName() {
        return firstName;
    }

    // setter methods give the developer the power to control what data is
    // allowed through validation. Throwing ane exception is the best
    // practice when validation fails. Don't do a System.out.println()
    // to display an error message -- not the job of this class!
    public void setFirstName(String firstName) {
        if(firstName == null || firstName.isEmpty()) {
            throw new IllegalArgumentException("first name is required");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(lastName == null || lastName.isEmpty()) {
            throw new IllegalArgumentException("last name is required");
        }
        this.lastName = lastName;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        if(ssn == null || ssn.length() < 9 || ssn.length() > 11) {
            throw new IllegalArgumentException("ssn is required and must be "
                    + "between 9 and 11 characters (if hyphens are used)");
        }
        this.ssn = ssn;
    }

    public boolean isMetWithHr() {
        return metWithHr;
    }

    // boolean parameters need no validation
    public void setMetWithHr(boolean metWithHr) {
        this.metWithHr = metWithHr;
    }

    public boolean isMetDeptStaff() {
        return metDeptStaff;
    }

    public void setMetDeptStaff(boolean metDeptStaff) {
        this.metDeptStaff = metDeptStaff;
    }

    public boolean isReviewedDeptPolicies() {
        return reviewedDeptPolicies;
    }

    public void setReviewedDeptPolicies(boolean reviewedDeptPolicies) {
        this.reviewedDeptPolicies = reviewedDeptPolicies;
    }

    public boolean isMovedIn() {
        return movedIn;
    }

    public void setMovedIn(boolean movedIn) {
        this.movedIn = movedIn;
    }

    public String getCubeId() {
        return cubeId;
    }
    
    public void setCubeId(String cubeId) {
        if(cubeId == null || cubeId.isEmpty()) {
            throw new IllegalArgumentException("cube id is required");
        }
        this.cubeId = cubeId;
    }

    public Date getOrientationDate() {
        return orientationDate;
    }

    public void setOrientationDate(Date orientationDate) {
        if(orientationDate == null) {
            throw new IllegalArgumentException("orientationDate is required");
        }
        this.orientationDate = orientationDate;
    }
}
