import java.util.Scanner;

public class MenorPosicao{
    public static void main(String[] args){

        Scanner r = new Scanner(System.in);

        int n, menor, posi;
        
        n = r.nextInt();

        int[] vet = new int[n];

        for(int i = 0; i < n; i++){
            vet[i] = r.nextInt();
        }

        menor = vet[0];
        posi = 0;
        for(int i = 0; i < n; i++){
            if(vet[i] < menor){
                menor = vet[i];
                posi = i;
            }
        }

        System.out.println("Menor valor: " + menor);
        System.out.println("Posicao: " + posi);

    }
}