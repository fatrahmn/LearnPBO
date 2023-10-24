package inheritance;

public class Mother extends Grandfather{

    String clan = "Simanjuntak";
    int dateOfBirth;

    public void displayFullClan() {
        System.out.println(clan + "manulung");

    }

    Mother () {
        System.out.println("A baby was born form his/her mother");
    }

    Mother (int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }



}
