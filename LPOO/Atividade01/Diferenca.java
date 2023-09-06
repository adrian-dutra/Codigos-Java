import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        int DIFERENCA, a, b, c, d;
        Scanner r = new Scanner(System.in);
        
        a = r.nextInt();
        b = r.nextInt();
        c = r.nextInt();
        d = r.nextInt();
        
        DIFERENCA = (a* b - c * d);
        
        System.out.println("DIFERENCA = " + DIFERENCA);
    }
 
}