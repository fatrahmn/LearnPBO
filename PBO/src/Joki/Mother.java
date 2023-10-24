package Joki;

public class Mother {

    private String city;
    private int population;
    private boolean isCapital;

    // parameterized constructor
    public Mother(String city, int population) {
        this.city = city;
        this.population = population;
        this.isCapital = false;
    }

    public Mother(String city, int population, boolean isCapital) {
        this.city = city;
        this.population = population;
        this.isCapital = isCapital;
    }

    public String getCity() {
        return city;
    }

    public int getPopulation() {
        return population;
    }

    public boolean isCapital() {
        return isCapital;
    }

    public void displayInfo() {
        System.out.println("City: " + city);
        System.out.println("Population: " + population);
        System.out.println("Capital: " + isCapital);
    }
}
