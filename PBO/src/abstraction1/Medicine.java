package abstraction1;

public class Medicine extends Product implements LoadItem {
    private String brand;
    Medicine(String name, int price) {
        super(name, price);
    }

    @Override
    void getProductInfo() {
        System.out.println("Name\t\t: " + this.name + "\nBrand\t\t: " + this.brand);
    }

    public void setBrend(String brand) {
        this.brand = brand;
    }

    //LoadItem
    @Override
    public void starLoad(int time) {
        System.out.println("Load Started on " + starTime);
    }

    @Override
    public void stopLoad(int time) {
        System.out.println("Load Stopped on "+ (starTime - 3));
    }
}
