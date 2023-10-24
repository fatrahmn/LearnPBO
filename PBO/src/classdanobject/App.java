package classdanobject;

public class App {
    public static void main(String[] args) {
        // Creating object using class
        // Rumah Putu
        DenahRumah rumahPutu = new DenahRumah();
        // Rumah Putri
        DenahRumah rumahPutri = new DenahRumah();

        // Assigning value to object using fields
        // Rumah Putu
        rumahPutu.harga = 1000000000;
        // Rumah Putri
        rumahPutri.harga = 1200000000;

        //Accessing value using fields
        // Rumah Putu
        System.out.println(rumahPutu.harga);
        System.out.println(rumahPutu.luasTanah);
        // Rumah Putri
        System.out.println(rumahPutri.harga);
        System.out.println(rumahPutri.luasTanah);

        // Diskon Putu
        System.out.println(rumahPutu.hargaDiskon());
        // Diskon Putri
        System.out.println(rumahPutri.hargaDiskon(50));
        // Rumah Surtati
        DenahRumah rumahSurtati = new DenahRumah(1700000000,300);
        System.out.println(rumahSurtati.harga);
        System.out.println(rumahSurtati.luasTanah);


        Baju bajuFatur = new Baju("uniqlo", 'L', 200000);
        System.out.println(bajuFatur.brand);
        System.out.println(bajuFatur.size);
        System.out.println(bajuFatur.harga);
        System.out.println(bajuFatur.hargaDiskon(0));




    }
}
