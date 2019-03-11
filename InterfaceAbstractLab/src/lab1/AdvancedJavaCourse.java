package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class AdvancedJavaCourse extends Course {
    String prerequisites;

    public AdvancedJavaCourse(String courseName, String courseNumber, double credits, String prerequisites) {
        setCourseName(courseName);
        setCourseNumber(courseNumber);
        setCredits(credits);
        setPrerequisites(prerequisites);
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }

    @Override
    public String printCourse(){
        return "Course: " + getCourseName() + "\n" +
                "Course Number: " + getCourseNumber() + " - Credits: " + getCredits() + "\n" +
                "Prerequisite: " + getPrerequisites() + "\n";
    }

}
