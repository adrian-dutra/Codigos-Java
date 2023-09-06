import java.util.Scanner;

public class MatrizQuadrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        while (N != 0) {
            int[][] matriz = new int[N][N];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    matriz[i][j] = Math.min(Math.min(i + 1, j + 1), Math.min(N - i, N - j));
                }
            }

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (j == 0) {
                        System.out.printf("%3d", matriz[i][j]);
                    } else {
                        System.out.printf(" %3d", matriz[i][j]);
                    }
                }
                System.out.println();
            }

            System.out.println();

            N = scanner.nextInt();
        }
    }
}