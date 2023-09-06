import java.io.IOException;
import java.util.Scanner;

public class SomaImpares{
 
    public static void main(String[] args) throws IOException {
    Scanner r = new Scanner(System.in);
    
    int x, y, cont, maior, menor;

    x = r.nextInt();
    y = r.nextInt();
    maior = 0;
    menor = 0;
    if(x>y){
        maior = x;
        menor = y;
    }else{
        maior = y;
        menor = x;
    }
    cont = 0;
    for(int i = menor+1; i < maior; i++){
        if(i%2 != 0 ){
            cont += i;
        }
    }
    System.out.println(cont);
    }
}
