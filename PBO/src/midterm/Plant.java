package midterm;

public class Plant {
    protected String name;
    protected int height;
    protected boolean isGreen;

    public Plant(String name, int height, boolean isGreen) {
        this.name = name;
        this.height = height;
        this.isGreen = isGreen;
    }

    public void photosynthesis() {
        if (isGreen) {
            System.out.println(name + " sedang melakukan fotosintesis");
        } else {
            System.out.println(name + " tidak hijau dan tidak dapat melakukan fotosintesis");
        }
    }
}
