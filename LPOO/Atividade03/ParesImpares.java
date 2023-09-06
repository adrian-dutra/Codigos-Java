import java.io.IOException;
import java.util.Scanner;

public class ParesImpares {
 
    public static void main(String[] args) throws IOException {
    Scanner r = new Scanner(System.in);
    
    int[] n = new int[5];

    int pares, impar, posi, nega;
    pares = 0;
    impar = 0;
    posi = 0;
    nega = 0;

    for(int i = 0; i < 5; i++){
        n[i] = r.nextInt();
        if(n[i] % 2 == 0){
            pares++;
        }
        else{
            impar++;
        }

        if(n[i] > 0){
            posi++;
        }
        else if(n[i]< 0){
            nega++;
        }
    }
    
    System.out.println(pares + " valor(es) par(es)");
    System.out.println(impar + " valor(es) impar(es)");
    System.out.println(posi + " valor(es) positivo(s)");
    System.out.println(nega + " valor(es) negativo(s)");


    }
}