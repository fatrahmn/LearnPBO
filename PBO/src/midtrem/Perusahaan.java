package midtrem;

public class Perusahaan {
    String jabatan;
    int gaji;
    boolean apakahBekerja;

    //no-argumen constructor
    public Perusahaan() {
        this.jabatan = "stafa";
        this.gaji = 0;
    }

    // parameterized constructor
    public Perusahaan(String jabatan, int gaji) {
        this.jabatan = jabatan;
        this.gaji = gaji;
    }


    public void tampilkan() {
        System.out.println("jabatan: " + jabatan);
        System.out.println("gaji: Rp " + gaji);
        System.out.println("apakah bekerja: " + isBekerja());
        if(jabatan == null) {
            System.out.println("isi dulu jabatan");
        }else {
            System.out.println("jabatan: " + jabatan);
        }
    }


    public void naikJabatan(String jabatanYangBaru,int updateGaji) {
        if (jabatanYangBaru != jabatan || updateGaji !=gaji){
            this.jabatan = jabatanYangBaru;
            this.gaji = updateGaji;
            System.out.println("Jabatan anda telah naik");
        }else {
            System.out.println("Jabatan anda belum naik");
        }
    }

    public boolean isBekerja() {
        if (gaji > 0) {
            apakahBekerja = true;
        } else {
            apakahBekerja = false;
        }
        return apakahBekerja;
    }

/*    public static void main(String[] args) {
        Perusahaan p = new Perusahaan("Pengangguran", 0);
        p.tampilkan();
        System.out.println();
        p.naikJabatan("bos",0);
        p.tampilkan();
        System.out.println();
        Karyawan k= new Karyawan("bos",2000,"Baekhyun",0,true);
        k.tampilkan();
        System.out.println();
        k.ubahNama(" ");
        k.tampilkan();


    }*/
}
