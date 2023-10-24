package standardjava;

public class NumberApp {
    public static void main(String[] args) {
        int herAge = 17;
        Integer hisAge = 18;
        System.out.println(hisAge.equals(herAge));

        Double grade = 9.4;
        System.out.println(grade.compareTo(9.44));

        Number decimal = 7.4;
        Number nondecimal = 7;
        System.out.println(decimal.equals(nondecimal));
    }
}
