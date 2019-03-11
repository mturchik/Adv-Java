package lab2;

import javax.swing.*;

public interface ICourse {

    public String getCourseName();

    public void setCourseName(String courseName);

    public String getCourseNumber();

    public void setCourseNumber(String courseNumber);

    public double getCredits();

    public void setCredits(double credits);

    public String getPrerequisites();

    public void setPrerequisites(String prerequisites);

    public String printCourse();
}
