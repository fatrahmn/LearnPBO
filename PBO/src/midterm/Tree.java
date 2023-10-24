package midterm;

public class Tree extends Plant{
    protected String barkTexture;

    public Tree(String name, int height, boolean isGreen, String barkTexture) {
        super(name, height, isGreen);
        this.barkTexture = barkTexture;
    }

    public void grow(int years) {
        System.out.println(name + " tumbuh " + years + " tahun dan sekarang " + (height + years) + " meter");
    }
}
