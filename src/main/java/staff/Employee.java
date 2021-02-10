package staff;

public abstract class Employee {
    private String name;
    private String nin;
    private Double salary;

    //Constructor
    public Employee(String name, String nin, Double salary) {
        this.name = name;
        this.nin = nin;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public String getNin() {
        return this.nin;
    }

    public Double getSalary() {
        return this.salary;
    }

    public void raiseSalary(Double raise) {
        this.salary += salary * raise;
        //raise/100 + 1 gives percentage to multiply salary by
    }

    public void payBonus() {
        this.salary += salary * 0.01;
    }

}
