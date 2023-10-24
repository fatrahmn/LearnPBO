package finalexam;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        ArrayList<Mahasiswa> ump= new ArrayList<>();

        ump.add(new Mahasiswa("", 0, "Fatur Rahman", 20));
        ump.add(new Mahasiswa("", 0, "Rahman", 20));
        ump.add(new Mahasiswa("", 0, "Fatur Rahman", 20));

        for (Mahasiswa mahasiswa: ump) {
    mahasiswa.keterangan();
        }

    }
}
