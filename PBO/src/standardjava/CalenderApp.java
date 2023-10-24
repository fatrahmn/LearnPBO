package standardjava;
import java.util.Calendar;

public class CalenderApp {
    public static void main(String[] args) {
        Calendar calender = Calendar.getInstance();
        System.out.println(calender.get(Calendar.DATE));
        System.out.println(calender.get(Calendar.MONTH));
        System.out.println(calender.get(Calendar.YEAR));

        int date = 2;
        int mount = 4;
        int year = 2003;
        Calendar dateOfBirth = Calendar.getInstance();
        dateOfBirth.set(Calendar.DATE, date);
        dateOfBirth.set(Calendar.MONTH, mount);
        dateOfBirth.set(Calendar.YEAR, year);
        System.out.println(dateOfBirth);
    }
}
