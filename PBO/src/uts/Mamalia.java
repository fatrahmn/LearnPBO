package uts;

public class Mamalia extends Hewan{
    String warnaBulu;
    double kecepatan;
    boolean laju;


    public Mamalia (String warnaBulu, double kecepatan, boolean laju){
        this.warnaBulu = warnaBulu;
        this.kecepatan = kecepatan;
        this.laju = laju;
    }

    public void makan() {
        System.out.println("The bird named " + nama + " is eating seeds.");
    }

    public void tampilkan(){
        System.out.println("Nama Hewan : " + nama);
        System.out.println("Berat : " + berat);
        System.out.println("Tipe : " + canFly);
        System.out.println("Warna Bulu Hewan : " + warnaBulu);
        System.out.println("Kecepatan : " + kecepatan);
        System.out.println("Laju : " + isLaju());
    }


    @Override
    public void type() {
        System.out.println("Nama hewan ini adalah " + nama + " tipr hewan" + canFly);
    }

    public boolean isLaju () {
        if (kecepatan > 7) {
            laju = true;
            System.out.println("Lajuuu!!!!");
        }else {
            laju = false;
            System.out.println("Pelan");
        }
        return laju;
    }




}
