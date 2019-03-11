package lab4;

/**
 * This class simulates a simple type of reporting service that produces
 * output. That's it's Single Responsibility. Notice how easy it would be
 * to change the code in the outputReport method to use a JOptionPane for
 * GUI output instead of using the current console output. And notice that
 * making this change would not cause problems with any other classes.
 * Very flexible!
 * 
 * @author      Jim Lombardo, WCTC Instructor
 * @version     1.02
 */
public class EmployeeReportService {
    private String report = "";
    
    public void addData(String data) {
        report += data;
    }
    
    public void outputReport() {
        System.out.println(report);
    }
    
    public void clearReport() {
        report = "";
    }

}
