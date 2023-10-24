package midtrem;

public class Kendaraan {
    String warna;
    int tahun;
    boolean PesawatMemilikiSistemKeamananUdaraAtauTidak;

    public Kendaraan () {
        this.warna ="Merah";
        this.tahun =2019;
    }
    public Kendaraan (String warna, int tahun) {
        this.warna = warna;
        this.tahun = tahun;

    }

    public void tampilkan () {
        System.out.println("warna : " + warna);
        System.out.println("tahun : Tahun " + tahun);
        System.out.println("PesawatMemilikiSistemKeamananUdaraAtauTidak : " + isPesawatMemilikiSistemKeamananUdaraAtauTidak());
        if (warna == null) {
            System.out.println("warna kendaraan anda");
        }else {
            System.out.println("warna: " + warna);
        }
    }

    public void modelTerbaru (String warnaKeluaranTerbaru,int updateTahun) {
        if (warnaKeluaranTerbaru != warna || updateTahun != tahun){
            this.warna = warnaKeluaranTerbaru;
            this.tahun = updateTahun;
            System.out.println("Warna terbaru sudah diluncurkan");
        }else {
            System.out.println("Warna terbaru belum diluncurkan");
        }
    }

    public boolean isPesawatMemilikiSistemKeamananUdaraAtauTidak() {
        if (tahun > 0) {
            PesawatMemilikiSistemKeamananUdaraAtauTidak = true;
        } else {
            PesawatMemilikiSistemKeamananUdaraAtauTidak = false;
        }
        return PesawatMemilikiSistemKeamananUdaraAtauTidak;
    }

/*    public static void main(String[] args) {
        Kendaraan p = new Kendaraan("Merah", 2019);
        p.tampilkan();
        System.out.println();
        p.modelTerbaru("Biru", 2023);
        p.tampilkan();
        System.out.println();
        Pesawat k = new Pesawat("Putih", 2025, "Avgas dan aviation kerosine", 440, true);
        k.tampilkan();
        System.out.println();
        k.ubahNama("Boeing 777-200LR");
        k.tampilkan();
    }*/
}
