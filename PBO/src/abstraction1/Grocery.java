package abstraction1;

public class Grocery extends Product implements LoadItem{
    private String quantityFromStore;
    Grocery(String name, int price) {
        super(name, price);
    }

    @Override
    void getProductInfo() {
        System.out.println("Name\t\t: "+ this.name + "\nPackaging\t: "+ this.quantityFromStore);
    }

    public void setQuantityFromStore(String quantityFromStore){
        this.quantityFromStore = quantityFromStore;
    }

    //LoadItem
    @Override
    public void starLoad(int time) {
        System.out.println("Load Started on "+ starTime + " PM");
    }

    @Override
    public void stopLoad(int time) {
        System.out.println("Load Stopped on "+ (starTime - 1)+ " PM");

    }
}
