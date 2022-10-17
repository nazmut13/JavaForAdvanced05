package homework07;

public class Director extends Manager {


    public Director(String name, int numberOfSubordinates) {
        super(name, numberOfSubordinates);
    }



    @Override
    public int getSalary() {
        if ( getNumberOfSubordinates() > 0) {
            return (int) (super.getBaseSalary() * ((1.0 * getNumberOfSubordinates()) / 100 * 9));
        } else {
            return getBaseSalary();
        }
    }
}
