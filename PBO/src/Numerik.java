import java.util.Scanner;

public class Numerik {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah data latih: ");
        int n = scanner.nextInt();

        float[] x = new float[n];
        float[] y = new float[n];

        System.out.println("Masukkan data latih:");
        for (int i = 0; i < n; i++) {
            System.out.print("x[" + (i + 1) + "]: ");
            x[i] = scanner.nextFloat();

            System.out.print("y[" + (i + 1) + "]: ");
            y[i] = scanner.nextFloat();
        }

        float sumX = 0;
        float sumY = 0;
        float sumXY = 0;
        float sumXX = 0;

        for (int i = 0; i < n; i++) {
            sumX += x[i];
            sumY += y[i];
            sumXY += x[i] * y[i];
            sumXX += x[i] * x[i];
        }

        float det = n * sumXX - sumX * sumX;
        float detA = sumXY * n - sumX * sumY;
        float detB = sumXX * sumY - sumX * sumXY;

        float a = detA / det;
        float b = detB / det;

        System.out.println("Persamaan linier: y = " + b + "x + " + a);
        System.out.println(det);
        System.out.println(detA);
        System.out.println(detB);
    }
}
