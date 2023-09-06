import java.io.IOException;
import java.util.Scanner;

public class Resto2{
 
    public static void main(String[] args) throws IOException {
    Scanner r = new Scanner(System.in);
    
    int n;

    n = r.nextInt();
    
    for(int i = 0; i < 10000; i++){
        if(i%n == 2 ){
           System.out.println(i);
        }
    }
    
    }
}