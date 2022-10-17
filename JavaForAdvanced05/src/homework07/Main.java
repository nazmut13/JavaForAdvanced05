package homework07;

public class Main {
    public static void main(String[] args) {
        Worker john = new Worker( "John");
        Manager bob = new Manager ("Bob", 30);
        Director alisa = new Director( "Alisa", 500);
        System.out.println(john.getSalary());
        System.out.println(bob.getSalary());
        System.out.println(alisa.getSalary());

    }


}
