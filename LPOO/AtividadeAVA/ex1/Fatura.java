package ex1;
import java.util.Scanner;
public class Fatura {
    private String descricao;
    private int qtd;
    private double preco;

    public Fatura(String descricao, int qtd, double preco){
        this.descricao = descricao;
        this.qtd = qtd;
        this.preco = preco;
    }

    public double getPrecoTotal() {
        return (preco * qtd);
    }

    public String toString() {
        return qtd + " " + descricao + " a R$ " + preco + " = R$ " + getPrecoTotal();
    }
    
    public static void main(String[] args){
        Scanner r = new Scanner (System.in);
        String descricao = r.nextLine();
        int qtd = r.nextInt();
        double preco = r.nextDouble();
        Fatura fatura1 = new Fatura(descricao, qtd, preco);
        double total = fatura1.getPrecoTotal();
        
        System.out.printf(fatura1.toString());
    }
}
