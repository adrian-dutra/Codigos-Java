import java.util.Scanner;

public class ex1{
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);


    int[] vet = new int [10];

   

    for(int i = 0; i < 10; i++){
        vet[i] = r.nextInt();
    }

    for(int i = 0; i < 10; i++){
        if(vet[i] > -1 && vet[i]%3 == 0){
            vet[i] = -3;
        }
    }

    for(int i = 0; i < 10; i++){
        System.out.printf("X[%d] = %d\n", i, vet[i]);
    }
    
    }
}