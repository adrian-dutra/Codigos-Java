import java.util.Scanner;
public class Ex2 {
    public static void main(String[]args){

        double x, y, media, soma;
        Scanner r = new Scanner(System.in);
        
        x = r.nextDouble();
        y = r.nextDouble();
        soma = x + y;
        media = soma/2;

        if(media >= 6){
            System.out.println("Aprovado");
        }
        else{
            System.out.println("Reprovado");
        }
    }
}
