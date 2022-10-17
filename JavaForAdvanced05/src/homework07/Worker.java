package homework07;

public class Worker extends Employee {
    public Worker(String name) {
        super(name);
    }

    @Override
    public int getSalary() {
        return getBaseSalary();
    }
}
