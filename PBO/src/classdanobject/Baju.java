package classdanobject;

public class Baju {
    //Declaring field
    String brand;
    char size;
    int harga;

    Baju(String brand, char size, int harga){
        this.brand = brand;
        this.size = size;
        this.harga = harga;
    }

    float hargaDiskon(int diskon){
        if(harga > 100000) {
            diskon = 10;
        }
        return harga -(harga * diskon / 100);
    }



    }



