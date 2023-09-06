import java.util.Scanner;

public class ex2 {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);

        int[][] mat = new int[6][6];

        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++){
                mat[i][j] = r.nextInt();
            }
        }

        int soma = 0;

        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++){
                if(mat[i] == mat[j]){
                    soma += mat[i][j];
                }
            }
        }

        System.out.println(soma);
    }
}
