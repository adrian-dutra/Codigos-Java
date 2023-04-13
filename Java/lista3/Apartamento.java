
public class Apartamento {
    
    private int nMoradores, nQuartos;
    private double espaco, valorAluguel;

    public Apartamento(int nQuart, double esp, double valorAlg){

        this.nQuartos = nQuart;
        this.espaco = esp;
        this.valorAluguel = valorAlg;
    }

    public Apartamento(int nQuart, int nMor, double esp, double valorAlg){

        this.nMoradores = nMor;
        this.nQuartos = nQuart;
        this.espaco = esp;
        this.valorAluguel = valorAlg;
    }

    public double dividirAluguel(){

        return valorAluguel/nMoradores;
    }

    public double valorporm2(){

        return valorAluguel/espaco;
    }

    public boolean aumentarMoradores(){
        if(nMoradores < nQuartos){
            nMoradores++;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean diminuirMoradores(){

        if(nMoradores > 0){
            nMoradores = nMoradores - 1;
            return true;
        }
        else{
            return false;
        }
    }

    public double getEspaco() {
        return espaco;
    }

    public void setEspaco(double espaco) {
        this.espaco = espaco;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public int getnMoradores() {
        return nMoradores;
    }

    public void setnMoradores(int nMoradores) {
        this.nMoradores = nMoradores;
    }

    public int getnQuartos() {
        return nQuartos;
    }

    public void setnQuartos(int nQuartos) {
        this.nQuartos = nQuartos;
    }
}