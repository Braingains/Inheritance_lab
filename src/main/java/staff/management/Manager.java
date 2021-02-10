package staff.management;

import staff.Employee;

public class Manager extends Employee {

    private String deptName;


    public Manager(String name, String nin, Double salary, String deptName) {
        super(name, nin, salary);
        this.deptName = deptName;
        }


    public String getDeptName() {
        return this.deptName;
    }


    }


