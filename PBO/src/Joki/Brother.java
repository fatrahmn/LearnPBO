package Joki;

public class Brother extends Father{

    public Brother(String hobby, int age, boolean isActive) {
        super(hobby, age, isActive);
    }

    @Override
    public void displayInfo() {
        System.out.println("Info:");
        super.displayInfo();
    }
}
