package midterm;

public class Cat extends Animal{
    protected String furColor;

    public Cat(String name, int age, boolean isWild, String furColor) {
        super(name, age, isWild);
        this.furColor = furColor;
    }

    @Override
    public void eat() {
        System.out.println(name + " makan ikan");
    }
}
