package midtrem;

public class Pesawat extends Kendaraan {
    String bahanBakar;
    int kapasitasPenumpang;
    boolean memilikiKursiPijat;

    public Pesawat (String warna, int tahun, String bahanBakar, int kapasitasPenumpang,boolean memilikiKursiPijat){
        super(warna,tahun);
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    @Override
    public void tampilkan() {
        System.out.println("bahan bakar : " + bahanBakar);
        System.out.println("kapasitas penumpang : " + kapasitasPenumpang);

        if (bahanBakar != bahanBakar) {
            System.out.println("bukan bahan bakar");
        }else {
            System.out.println("bahan bakar: " + bahanBakar);
        }
    }

    public void tampilkan(String bahanBakar) {
        if (bahanBakar !=null) {
            System.out.println("bahan bakar : " + bahanBakar);
        }else {
            System.out.println("bahan bakar pesawat");
        }
    }

    public void ubahNama(String nama) {
        this.bahanBakar = bahanBakar;
    }

    public boolean isMemilikiKursiPijat () {
        if (kapasitasPenumpang > 0) {
            memilikiKursiPijat = true;
            System.out.println("anda terdaftar");
        }else {
            memilikiKursiPijat = false;
            System.out.println("anda tidak terdaftar");
        }
        return memilikiKursiPijat;
    }
}

