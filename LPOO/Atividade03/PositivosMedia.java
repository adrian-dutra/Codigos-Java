import java.io.IOException;
import java.util.Scanner;

public class PositivosMedia {
 
    public static void main(String[] args) throws IOException {
    Scanner r = new Scanner(System.in);
    
    double[] n = new double[6];
    double soma, media;
    int posi;
    posi = 0;
    soma = 0;
    
    for(int i = 0; i < 6; i++){
        n[i] = r.nextDouble();
        if(n[i] > 0){
            soma += n[i];
            posi++;
        }
    }
    
    media = soma/posi;
    
    System.out.println(posi + " valores positivos");
    System.out.printf("%.1f%n", media);
    
    }
}