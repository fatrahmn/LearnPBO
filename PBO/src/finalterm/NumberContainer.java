package finalterm;

public class NumberContainer<T extends Integer> {
    private T number;

    public NumberContainer(T number) {
        this.number = number;
    }

    public T getNumber() {
        return number;
    }
}
