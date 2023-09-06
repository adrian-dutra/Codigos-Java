package ex3;
import java.util.Scanner;
abstract class Poligno {
    private String nome;
    private int nLados;


    public Poligno(String nome, int lados){
        this.nome = nome;
        this.nLados = lados;
    }

    public int getNLados() {
        return nLados;
    }
    public void setNLados(int lados) {
        this.nLados = lados;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


}

public class Quadrado extends Poligno{
    private double lados;

    public Quadrado(double lados, String nome, int nLados){
        super(nome, nLados);
        this.lados = lados;
    }

    public double getLados() {
        return lados;
    }
    public void setLados(double lados) {
        this.lados = lados;
    }

    public double calcularArea(){
        return lados * lados;
    }

    public String toString(){
        return getNome() + " tem "+ getNLados() + " lados e área= " + calcularArea();
    }

    public static void main(String[] args){
        Scanner r = new Scanner (System.in);
        String nome = r.nextLine();
        int nLados = r.nextInt();
        double lados = r.nextDouble();
        Quadrado quadrado = new Quadrado(lados, nome, nLados);
        System.out.println(quadrado.toString());
        quadrado.setLados(r.nextDouble());
        System.out.println(quadrado.toString());

    }
}
