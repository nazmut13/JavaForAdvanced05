package homework07;


public class Manager extends Employee {
    private int numberOfSubordinates;

    public Manager(String name, int numberOfSubordinates) {
        super(name);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public int getSalary() {
        if (numberOfSubordinates > 0) {
            return (int) (super.getBaseSalary() * ((1.0 * numberOfSubordinates) / 100 * 3));
        } else {
            return getBaseSalary();
        }
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }
}
