package encapsulation;

import encapsulation.product.*;


public class App {
    public static void main(String[] args) {
        Store indomaret = new Store();
        indomaret.setName( "Indomaret Ayani");
        System.out.println(indomaret.getName());

        Product minyakGoreng = new Product();
        minyakGoreng.setAvailable(true);
        Warehouse gudangAyam = new Warehouse();
        gudangAyam.setFull(false);

        encapsulation.user.Teller mbMarni = new encapsulation.user.Teller();
        mbMarni.setWorking(true);
    }
}
