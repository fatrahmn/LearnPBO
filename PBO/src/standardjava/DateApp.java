package standardjava;
import java.util.Date;

public class DateApp {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        long dateMilis = date.getTime();
        System.out.println(dateMilis);
    }
}
