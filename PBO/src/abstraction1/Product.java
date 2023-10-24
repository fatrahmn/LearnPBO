package abstraction1;

abstract class Product {

    String name;
    int price;

    Product(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String getName(){

        return this.name;
    }

    abstract void getProductInfo();

}
