package lab1;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroJavaCourse extends Course {
    String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber, double credits, String prerequisites) {
        setCourseName(courseName);
        setCourseNumber(courseNumber);
        setCredits(credits);
        setPrerequisites(prerequisites);
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    @Override
    public String printCourse(){
        return "Course: " + getCourseName() + "\n" +
                "Course Number: " + getCourseNumber() + " - Credits: " + getCredits() + "\n" +
                "Prerequisite: " + getPrerequisites() + "\n";
    }
}
