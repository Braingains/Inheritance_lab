package staff.management;

import staff.management.Manager;
public class Director extends Manager {

    private Double budget;

    public Director(String name, String nin, Double salary, String deptName, Double budget) {
        super(name, nin, salary, deptName);
        this.budget = budget;
    }

    public Double getBudget() {
        return this.budget;
    }
}
