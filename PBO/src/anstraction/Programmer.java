package anstraction;

public class Programmer extends Employee implements Task {

    Programmer(int salary) {
        super(salary);
    }

    @Override
    void calculateSalary() {
        salary -= (salary * .25);
    }

    @Override
    public void typing() {
        System.out.println("Typing Java code in" + normalTypingSpeed +
                "words per second!");
    }

    @Override
    public void reporting() {
        System.out.println("Sir, I have finished my work for today.");
    }
}
