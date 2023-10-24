package finalexam;

public class Mahasiswa extends Dosen{
    String namaMahasiswa, alamatMahasiswa;
    int umurMahasiswa;

    public Mahasiswa (String namaDosen, int umurDosen, String namaMahasiswa, int umurMahasiswa){
        super(namaDosen, umurDosen);
            this.namaMahasiswa =  namaMahasiswa;
        this.umurMahasiswa =  umurMahasiswa;
    }

    @Override
    public void keterangan() {
        super.keterangan();
        System.out.println("Nama Mahasiswa \t: " + this.namaMahasiswa);
        System.out.println("Alamat Mahasiswa\t" + this.alamatMahasiswa);
    }

    public void alamat(String alamat) {
        this.alamatMahasiswa = alamat;
        System.out.println("Alamat Mahasiswa\t: " + alamat);
    }

    public void alamat() {
        this.alamatMahasiswa = "Jl. Adis Sucipto, Gg. M. Yunus";
        System.out.println("Alamat Mahasiswa\t: " + this.alamatMahasiswa);
    }

    @Override
    public void setUmur(int umurDosen) {
        super.setUmur(umurDosen);
    }

    @Override
    public void getNama(String NamaDosen) {
        super.getNama(NamaDosen);
    }

    public static class alamat {
        public void keteranganAlamat() {
            System.out.println("Jl. Adisucipto, Gg. M.Yunus");
        }
    }
}


