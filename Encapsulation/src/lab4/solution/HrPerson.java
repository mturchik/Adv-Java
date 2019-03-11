
package lab4.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * This class simulates an HR person that does the actual hiring and commands
 * Employees to go through orientation.
 * 
 * @author      Jim Lombardo, WCTC Instructor
 * @version     1.03
 */
public class HrPerson {
    private List<Employee> employees;


    public HrPerson() {
        employees = new ArrayList();
    }
    
    public void hireEmployee(String firstName, String lastName, String ssn) {
        Employee e = new Employee(firstName,lastName,ssn);
        employees.add(e);
        orientEmployee(e);
    }
    
    // HRManager delegates work to employee
    public void orientEmployee(Employee e) {
        e.doFirstTimeOrientation("B101");
    }

    public void outputReport(String ssn) {
        Employee e = null;
        
        // find employee in list
        for(Employee emp : employees) {
            if(emp.getSsn().equals(ssn)) {
                e = emp;
                break;
            } else {
                // if not found end method prematurely
                return;
            }
        }

        // if found run report
        if(e.isMetWithHr() && e.isMetDeptStaff()
           && e.isReviewedDeptPolicies() && e.isMovedIn()) {
            
            e.getReportService().outputReport();
            
        }
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
    
    public static void main(String[] args) {
        HrPerson hr = new HrPerson();
        hr.hireEmployee("John", "Doe", "333-33-3333");
        System.out.println(hr.getEmployees());
//        for(Employee emp : hr.getEmployees()) {
//            System.out.println(emp);
//        }
    }
}
