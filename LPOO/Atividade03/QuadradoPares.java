import java.io.IOException;
import java.util.Scanner;

public class QuadradoPares{
 
    public static void main(String[] args) throws IOException {
    Scanner r = new Scanner(System.in);
    
    int n, resul;

    n = r.nextInt();
    resul = 0;
    for(int i = 1; i <= n; i++){
        if(i%2 == 0 ){
            resul = i*i;
            System.out.println(i + "^2 = " + resul);
        }
    }
    
    }
}
