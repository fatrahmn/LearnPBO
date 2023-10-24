package anstraction;

abstract class Employee {
    int salary;
    Employee(int salary) {
        this.salary = salary;
    }
    public int getSalary() {
        return this.salary;
    }

    abstract void calculateSalary();
}
