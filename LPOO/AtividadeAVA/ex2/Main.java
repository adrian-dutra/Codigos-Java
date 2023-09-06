package ex2;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner r = new Scanner (System.in);
        String nome = r.nextLine();
        int idade = r.nextInt();
        Pessoa pessoa1 = new Pessoa(nome, idade);
        System.out.println(pessoa1);
        pessoa1.setIdade(r.nextInt());
        System.out.println(pessoa1);

    }
}