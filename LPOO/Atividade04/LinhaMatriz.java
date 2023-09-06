import java.util.Scanner;

public class LinhaMatriz {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);

        int L = r.nextInt();
        char operation = r.next().charAt(0);

        double[][] M = new double[12][12];
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                M[i][j] = r.nextDouble();
            }
        }

        double result = 0.0;
        for (int j = 0; j < 12; j++) {
            result += M[L][j];
        }

        if (operation == 'M') {
            result /= 12.0;
        }

        System.out.printf("%.1f%n", result);
    }
}