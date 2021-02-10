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

    public void setName(String name) {
        if (name != null){
        this.name = name;
    }
    }

    public String getNin() {
        return this.nin;
    }

    public Double getSalary() {
        return this.salary;
    }

    public void raiseSalary(Double raise) {
        if (raise > 0) {
        this.salary += salary * raise;
        //raise/100 + 1 gives percentage to multiply salary by
        }
    }
    public Double payBonus() {
       return this.salary += salary * 0.01;
    }

}
