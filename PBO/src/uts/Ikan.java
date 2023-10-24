package uts;

public class Ikan extends Hewan{
    String warnaIkan;
    double kecepatanBerenang;
    boolean LajuIkan;

    public Ikan(){
        this.warnaIkan = "";
        this.kecepatanBerenang = 0;
    }

    public Ikan(String nama, double berat, boolean fly, String warnaIkan, double kecepatanBerenang, boolean lajuIkan) {
        super(nama, berat, fly);
        this.warnaIkan = warnaIkan;
        this.kecepatanBerenang = kecepatanBerenang;


    }
    public int getJumlahKaki() {
        return 0;
    }

    @Override
    public void type() {
        System.out.println("Nama hewan ikan ini adalah " + nama + " tipe hewan " + canFly);
    }
    public void tampilkan(){
        System.out.println("Nama Hewan : " + nama);
        System.out.println("Berat : " + berat);
        System.out.println("Tipe : " + canFly);
        System.out.println("Warna Ikan : " + warnaIkan);
        System.out.println("Kecepatan Berenang : " + kecepatanBerenang);
    }




}
