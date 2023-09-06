import java.util.Scanner;


public class AreaSuperior {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char operation = scanner.next().charAt(0);

        double[][] M = new double[12][12];
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                M[i][j] = scanner.nextDouble();
            }
        }

        double result = 0.0;
        int count = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 11 - i; j++) {
                result += M[i][j];
                count++;
            }
        }

        if (operation == 'M') {
            result /= count;
        }

        System.out.printf("%.1f%n", result);
    }
}