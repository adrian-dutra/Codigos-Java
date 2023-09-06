import java.io.IOException;
import java.util.Scanner;

public class CalculoSimples {
    public static void main(String[] args) throws IOException {
        
        double soma, valor;
        int cod, Npecas;

        Scanner r = new Scanner(System.in);

        soma = 0;

        for(int i = 0; i < 2; i++){
            cod = r.nextInt();
            Npecas = r.nextInt();
            valor = r.nextDouble();

            soma += (valor*Npecas);
        }
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", soma);

    }

}
