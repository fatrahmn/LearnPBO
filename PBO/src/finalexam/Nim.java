package finalexam;

public class Nim <T extends Integer>{
    T[] Nim;

    public Nim(T[] nim) {
        this.Nim =nim;
    }

    public T[] getNim() {

        return Nim;
    }
}

