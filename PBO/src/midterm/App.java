package midterm;

public class App {
    public static void main(String[] args) {

    Cat myCat = new Cat("Tom", 3, false, "coklat");
myCat.eat(); // Tom is eating fish
myCat.isDangerous(); // Tom is a domestic animal

    Tree myTree = new Tree("Pohon ek", 5, true, "rough");
myTree.photosynthesis(); // Oak is performing photosynthesis
myTree.grow(10); // Oak grows 10 years and is now 15 meters tall
    }
}
