import java.util.Scanner;

public class DiagonalSecundario {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);

    
        char operation = r.next().charAt(0);

        double[][] M = new double[12][12];
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                M[i][j] = r.nextDouble();
                
            }
        }

        int count = 0;
        double result = 0.0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11 - i; j++){
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
