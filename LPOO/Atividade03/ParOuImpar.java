import java.io.IOException;
import java.util.Scanner;

public class ParOuImpar {
 
    public static void main(String[] args) throws IOException {
    Scanner r = new Scanner(System.in);

    int n = r.nextInt();
    int[] val = new int[n];
        
    for(int i = 0; i < n; i++){
        val[i] = r.nextInt();
    }
    for(int i = 0; i < n; i++){
        if(val[i] % 2 == 0 && val[i] > 0){
            System.out.println("EVEN POSITIVE");
        }
        else if(val[i] % 2 != 0 && val[i] > 0){
            System.out.println("ODD POSITIVE");
        }
        else if(val[i] % 2 == 0 && val[i] < 0){
            System.out.println("EVEN NEGATIVE");
        }
        else if(val[i] % 2 != 0 && val[i] < 0){
            System.out.println("ODD NEGATIVE");
        }
        else{
            System.out.println("NULL");
        }
    }
    }
}