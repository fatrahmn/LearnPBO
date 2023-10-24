package finalexam;

public class Dosen extends Usia implements mengajar{
    private String namaDosen;
    private int umurDosen;

    public Dosen(String namaDosen, int umurDosen){
        this.namaDosen = "Muhammadi Iwan";
        this.umurDosen = 26;
    }

    public void keterangan() {
        System.out.println("Nama Dosen\t: " + this.namaDosen);
        System.out.println("Umur Dosen\t: " + this.umurDosen);
    }

    public Number gajiDosen(){
        int gajiperbulan = 10000000;
        int bulan = 12;
        int totaPertahun = gajiperbulan * bulan;
        return totaPertahun;
    }


    public void keteranganUmur(int umurDosen) {
        this.umurDosen = umurDosen;
        String umur = "";
        for (int i = 25; i <= 50; i++) {
            if (i == 25-35) {
                umur = "Dosen Muda";
            } else if (i == 35-40) {
                umur = "Dosen Senior";
            } else if (i == 40-50) {
                umur = "Dosen Tua";
            }
            System.out.println(i + ". " + umur);
        }

    }

    public void getNama(String NamaDosen) {
        System.out.println(namaDosen + "Jam Mengajar : "+ jamMengajar);

    }

    public void setUmur(int umurDosen){

    }


    @Override
    public int getNama() {
        return 0;
    }
}



