package standardjava;
import java.util.Scanner;
public class ScannerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Guess my age : ");
        int answerAge = scanner.nextInt();

        if (answerAge > 20) {
            System.out.println("Im not that old");
        }else {
            System.out.println("You are right! im  " + answerAge + " year old");
        }
    }
}
