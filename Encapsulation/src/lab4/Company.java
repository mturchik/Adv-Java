package lab4;

import java.util.ArrayList;

public class Company {
    private ArrayList<Employee> employees;
    private ArrayList<HumanResourceRep> humanResourceReps;

    public Company() {

    }



    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public ArrayList<HumanResourceRep> getHumanResourceReps() {
        return humanResourceReps;
    }

    public void setHumanResourceReps(ArrayList<HumanResourceRep> humanResourceReps) {
        this.humanResourceReps = humanResourceReps;
    }
}
