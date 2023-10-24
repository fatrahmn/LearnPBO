package midtrem;

public class Karyawan extends Perusahaan {
    String nama;
    int nim;
    boolean aktif;

    public Karyawan(String jabatan, int gaji,String nama,int nim,boolean aktif){
        super(jabatan,gaji);
        this.nama = nama;
        this.nim = nim;
        this.aktif = aktif;
    }

    @Override
    public void tampilkan() {
        System.out.println("nama : " + nama);
        System.out.println("nim : " + nim);
        System.out.println("status : " + isAktif());
        System.out.println("jabatan : "+jabatan);
        System.out.println("gaji : "+gaji);

    }
    public void ubahNama(String nama) {
        this.nama=nama;
    }


    public boolean isAktif () {
        if (nim > 0) {
            aktif = true;
            System.out.println("anda terdaftar");
        }else {
            aktif = false;
            System.out.println("anda tidak terdaftar");
        }
        return aktif;
    }
}
