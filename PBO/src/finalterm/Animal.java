package finalterm;

public abstract class Animal extends Jenis implements Load{
    private String name;
    private int umur;
    private boolean isMammal;

    public Animal(String name, boolean isMammal) {
        super();
        this.name = name;
        this.isMammal = isMammal;
    }


    public abstract void abstractMethod();

    public void display() {
        System.out.println("Nama Hewan\t: " + this.name);
        System.out.println("Mamalia\t: " + this.isMammal);
    }

    public void displayUmur(String nama) {
        this.name = nama;
        String umur = "";
        for (int i = 1; i <= 3; i++) {
            if (i == 1) {
                umur = "Anak-Anak";
            } else if (i == 2) {
                umur = "Remaja";
            } else if (i == 3) {
                umur = "Dewasa";
            }
            System.out.println(i + ". " + umur);
        }
    }

    public Number lahir() {
        int anak  = 3;
        int bulan = 12;
        int totalKelahiran = anak * bulan;
        return totalKelahiran;
    }

    public void setNama(String nama) {
        this.name = nama;
    }

    public String getNama() {
        return name;
    }

    public void setMamal(Boolean isMammal) {
        this.isMammal = isMammal;
    }

    public Boolean getMamal() {
        return isMammal;
    }

    @Override
    public void starEat(int time) {
        System.out.println(name +" Mulai Makan "+ starTime + " PM");
    }

    @Override
    public void stopEat(int time) {
        System.out.println(name + " Selesai Makan "+ (starTime - 1)+ " PM");

    }

    @Override
    void setEkor(Number ekor) {

    }
}
