package anstraction;

public class AbstractionApp {
    public static void main(String[] args) {
        Employee myEmployee = new Employee(7) {
            @Override
            void calculateSalary() {

            }
        };

        Programmer myProgrammer = new Programmer(5000000);
        System.out.println(myProgrammer.getSalary());

        myProgrammer.calculateSalary();
        System.out.println(myProgrammer.getSalary());
    }
}
