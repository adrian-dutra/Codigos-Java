import java.io.IOException;
import java.util.Scanner;

public class Preenchimento {
    public static void main(String[] args)throws IOException{
    
    Scanner r = new Scanner(System.in);
    
    double x;
    x = r.nextDouble();
    double[] vet = new double[100];
    vet[0] = x;
    for(int i = 1; i < 100; i++){
        vet[i] = vet[i-1]/2;
    }
    
    for(int i = 0; i < 100; i++){
        System.out.printf("N[%d] = %.4f%n", i, vet[i]);;
    }

    }
}
