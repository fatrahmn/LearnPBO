package Joki;

public class Father {
    // no-argument constructor
    private String hobby;
    private int age;
    private boolean isActive;



    // parameterized constructor
    public Father(String hobby, int age, boolean isActive) {
        this.hobby = hobby;
        this.age = age;
        this.isActive = isActive;
    }


    public String getHobby() {
        return hobby;
    }

    public int getAge () {
        return age;
    }

    public boolean isActive() {
        return isActive;
    }

    public void displayInfo() {
        System.out.println("Hobby: " + hobby);
        System.out.println("Age: " + age);
        System.out.println("Active: " + isActive);
    }

}
