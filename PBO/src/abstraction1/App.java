package abstraction1;

public class App {
    public static void main(String[] args) {
        //Product rice = new Product();
        Medicine obatBatuk = new Medicine("Komix ", 2000);
        obatBatuk.setBrend("Konimex");
        System.out.println(obatBatuk.name + obatBatuk.price);
        Grocery santanSekantong = new Grocery("Santan ", 1000);
        santanSekantong.setQuantityFromStore("Kantong Plastik");
        System.out.println(santanSekantong.name + santanSekantong.price);
        santanSekantong.getProductInfo();
        obatBatuk.getProductInfo();


    }
}
