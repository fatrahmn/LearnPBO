package uts;

public class Burung extends Hewan{
    String warnaBurung;
    double lebarSayap;
    boolean terbang;

    public Burung(){
        this.warnaBurung = warnaBurung;
        this.lebarSayap = lebarSayap;
        this.terbang = terbang;
    }

    public Burung(String nama, double berat, boolean fly, String warnaBurung, double lebarSayap, boolean bersiul) {
        super(nama, berat, fly);
        this.warnaBurung = warnaBurung;
        this.lebarSayap = lebarSayap;
        this.terbang = bersiul;
    }




    public void tampilkan(){
        System.out.println("Nama Hewan : " + nama);
        System.out.println("Berat : " + berat);
        System.out.println("Tipe : " + canFly);
        System.out.println("Warna Burung : " + warnaBurung);
        System.out.println("Lebar Sayap : " + lebarSayap);
        System.out.println("Bersiul : " + isTerbang());
    }

    @Override
    public void type() {
        System.out.println("Nama burung ini adalah " + nama + " tipe hewan " + canFly);
    }

    public boolean isTerbang () {
        if (lebarSayap > 4) {
            terbang = true;
            System.out.println("Bisa Terbang");
        }else {
            terbang = false;
            System.out.println("Tidak Bisa Terbang");
        }
        return terbang;
    }

}

