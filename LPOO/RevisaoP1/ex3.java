import java.util.Scanner;

public class ex3 {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);

        String cor = r.next();
        int numPassageiros = r.nextInt();
        String marca = r.next();
        String modelo = r.next();

        Carro carro1 = new Carro(cor, numPassageiros, marca, modelo);
        System.out.println(carro1);
        carro1.setModelo(r.next());
        System.out.println(carro1);

        carro1.acelerar();
        carro1.frear();
    }
}

abstract class Veiculo{
    private String cor;
    private int numPassageiros;

    public Veiculo(String cor, int numPassageiros){
        this.cor = cor;
        this.numPassageiros = numPassageiros;

    }

    public void acelerar(String acelera) {

    	acelera = "acelerou";
    }

    public void frear(String acelera){
    	
        acelera = "freou";
    }

    public String toString(){
        return "cor" + this.cor + "numPassageiros" + this.numPassageiros;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumPassageiros() {
        return numPassageiros;
    }
    public void setNumPassageiros(int numPassageiros) {
        this.numPassageiros = numPassageiros;
    }
}

class Carro extends Veiculo{
    private String marca, modelo;

    public Carro(String cor, int numPassageiros, String marca, String modelo){
        super(cor, numPassageiros);
        this.marca = marca;
        this.modelo = modelo;
    }


    public void acelerar(){
        System.out.println("O " + this.marca + " " + this.modelo + " acelerou"); 
    }

    public void frear(){
        System.out.println("O " + this.marca + " " + this.modelo + " freou"); 
    }

    public String toString(){
        return "Carro " + this.marca + " " + this.modelo + " " + getCor() + " numPassageiros " + getNumPassageiros();
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
