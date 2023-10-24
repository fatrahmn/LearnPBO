import java.util.Scanner;

public class RegresiKuadrat {
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
        float sumXX = 0;
        float sumXXX = 0;
        float sumXXXX = 0;
        float sumXY = 0;
        float sumXXY = 0;

        for (int i = 0; i < n; i++) {
            float xi = x[i];
            float xiSquare = xi * xi;

            sumX += xi;
            sumY += y[i];
            sumXX += xiSquare;
            sumXXX += xi * xiSquare;
            sumXXXX += xiSquare * xiSquare;
            sumXY += xi * y[i];
            sumXXY += xiSquare * y[i];
        }

        float det = n * (sumXX * sumXXXX - sumXXX * sumXXX) - sumX * (sumX * sumXXXX - sumXX * sumXXXX) + sumXX * (sumX * sumXXX - sumXX * sumXX);
        float detA = (sumY * (sumXX * sumXXXX - sumXXX * sumXXX) - sumX * (sumXXY * sumXXXX - sumXXX * sumXXY)) - sumXY * (n * sumXXXX - sumXXX * sumX);
        float detB = n * (sumXXY * sumXX - sumXXX * sumXY) - sumX * (sumY * sumXX - sumXY * sumX);
        float detC = n * (sumXX * sumXY - sumXXY * sumX) - sumX * (sumXX * sumY - sumXY * sumX);

        float a = detA / det;
        float b = detB / det;
        float c = detC / det;

        System.out.println(det);
        System.out.println(sumY);
        System.out.println(sumX);
        System.out.println(sumXX);
        System.out.println(sumXXX);
        System.out.println(sumXXXX);
        System.out.println(sumXY);
        System.out.println(sumXXY);


    }
}
