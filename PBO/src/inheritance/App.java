package inheritance;

public class App {
    public static void main(String[] args) {

        Brother iskandar = new Brother("Gaming");
        iskandar.displayHobby();
        System.out.println(iskandar.clan);
        iskandar.displayFullClan();

        Brother nando = new Brother(19);
        System.out.println(nando.dateOfBirth + " April");
        nando.displayFullParentClan();

        Father jokowi = new Father(1000000);
        System.out.println("Dapat warisan "+ jokowi.harta + "Jt");



    }
}
