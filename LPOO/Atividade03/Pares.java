import java.io.IOException;
import java.util.Scanner;

public class Pares {
 
    public static void main(String[] args) throws IOException {
    Scanner r = new Scanner(System.in);
    
    int[] n = new int[5];

    int pares;
    pares = 0;

    for(int i = 0; i < 5; i++){
        n[i] = r.nextInt();

        if(n[i] % 2 == 0){
            pares++;
        }
    }

    System.out.println(pares + " valores pares");
    
    }
}