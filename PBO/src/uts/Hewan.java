package uts;

public class Hewan {
    String nama;
    double berat;
    boolean canFly;

    public Hewan(){
        this.nama = "";
        this.berat = 0;
    }

    public Hewan(String nama, double berat, boolean canFly){
        this.nama = nama;
        this.berat = berat;
        this.canFly = canFly;
    }

    Hewan(double berat){
        this.berat = berat;
    }


    public void pernyataan(){
        System.out.println("Hewan ini adalah : ");
    }

    public void tampilkan(){
        System.out.println("Nama Hewan : " + nama);
        System.out.println("Berat : " + berat);
        System.out.println("Tipe : " + canFly);
    }

    public void makan() {
        System.out.println(nama + " makan");
    }

    public int getJumlahKaki() {
        return 0;
    }

    public void type() {
        if (canFly) {
            System.out.println(nama + " Terbang.");
        } else if (!canFly && nama.equals("Fish")) {
            System.out.println(nama + " Berenang.");
        } else {
            System.out.println(nama + " Berjalan.");
        }
    }





}
