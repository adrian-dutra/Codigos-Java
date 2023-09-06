import java.io.IOException;
import java.util.Scanner;

public class Intervalo2 {
 
    public static void main(String[] args) throws IOException {
    Scanner r = new Scanner(System.in);
    
    int n, in, out;
    n = r.nextInt();
    int[] val = new int[n];
    in = 0;
    out = 0;

    for(int i = 0; i < n; i++){
        val[i] = r.nextInt();

        for(int j = 10; j < 20; j++){
            if(val[i] == j){
                in++;
            }
        }
    }

    out = n - in;

    System.out.println(in + " in");
    System.out.println(out + " out");
    
    }
}