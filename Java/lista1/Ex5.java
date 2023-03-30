import java.util.Scanner;
public class Ex5 {
    public static void main(String[]args){
        int  n, soma;
        Scanner r = new Scanner(System.in);
        n = r.nextInt();
        soma = 0;
    for(int i = 1; i <= 1000; i++){
        if(i % n == 0){
            soma += i;
        }
    }
    System.out.println(soma);
    }
}
