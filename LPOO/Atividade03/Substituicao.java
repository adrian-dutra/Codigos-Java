import java.util.Scanner;

public class Substituicao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] x = new int[10];

        for (int i = 0; i < 10; i++) {
            x[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (x[i] <= 0) {
                x[i] = 1;
            }
            System.out.println("X[" + i + "] = " + x[i]);
        }
    }
}