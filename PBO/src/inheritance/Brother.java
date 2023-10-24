package inheritance;

// Inherits form mother calss
public class Brother extends Mother{

    String hobby;
    Brother(String hobby) {
        this.hobby = hobby;

    }

    public void displayHobby() {
        System.out.println("i Love " + this.hobby);

    }

    Brother(int dateOfBirth) {

        super(dateOfBirth);
    }

    public void displayFullParentClan() {
        super.displayFullClan();
    }

}
