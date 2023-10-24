package Joki;

public class Sister extends Mother{

    public Sister(String city, int population) {
        super(city, population);
    }


    public void displayInfo(String additionalInfo) {
        System.out.println("Info:");
        super.displayInfo();
        System.out.println("Additional Info: " + additionalInfo);
    }

}
