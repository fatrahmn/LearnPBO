package finalterm;

public class Cat extends Animal{
     String furColor;
     boolean hasTail;


    public Cat(String furColor, boolean hasTail, String name, boolean isMamal) {
        super(name, isMamal);
        this.furColor = furColor;
        this.hasTail = hasTail;
    }


    @Override
    public void displayUmur(String nama) {
        super.displayUmur(nama);
        System.out.println("Umur Kucing : " + nama);
    }

    public void furColor(String furColor) {
        this.furColor = furColor;
        System.out.println("Warna Kucing : "+ this.furColor);
    }

    public void furColor() {
        this.furColor = "Oren";
        System.out.println("Warna Kucing : "+ this.furColor);
    }



    @Override
    public void abstractMethod() {
        System.out.println("Kucing ini sangat lucu");
    }

    public static class CatInfo {
        public static void displayInfo() {
            System.out.println("Ini Adalah Kucing");
        }
    }

    @Override
    public void display() {
        System.out.println("p");
    }


    public void display(String furColor) {
        this.furColor = furColor;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public boolean isHasTail() {
        return hasTail;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }
}
