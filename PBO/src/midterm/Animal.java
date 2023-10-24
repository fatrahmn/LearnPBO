package midterm;

public class Animal {
    protected String name;
    protected int age;
    protected boolean isWild;

    public Animal() {}

    public Animal(String name, int age, boolean isWild) {
        this.name = name;
        this.age = age;
        this.isWild = isWild;
    }

    public void eat() {
        System.out.println("Binatang itu sedang makan");
    }


    public boolean isDangerous() {
        if (isWild) {
            System.out.println(name + " adalah hewan liar");
            return true;
        } else {
            System.out.println(name + " adalah hewan peliharaan");
            return false;
        }
    }
}

