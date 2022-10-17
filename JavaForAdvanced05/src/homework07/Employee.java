package homework07;


public abstract class Employee {
    private int baseSalary;
    private String name;
    private int salary;

    public Employee(String name) {
        this.baseSalary = baseSalary;
        this.name = name;

    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }
}
