import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int qnt = s.nextInt();
        double valorHora = s.nextDouble();
        
        double salario;
        
        salario = qnt * valorHora;
        

        System.out.println("NUMBER = " + num);
        System.out.printf("SALARY = U$ %.2f\n", salario);  
    }
 
}