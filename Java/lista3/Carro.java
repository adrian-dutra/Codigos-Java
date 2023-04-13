package lista3;

public class Carro {
    
    private String modelo;
    private int nPortas, nPassageiros;
    private float velocidade;
    private boolean estaLigado;

    public Carro(String mod, int nP, int nPas){

        this.modelo = mod;
        this.nPortas = nP;
        this.nPassageiros = nPas;
    }

    public void ligaCarro(){
                  
        estaLigado = true;
    }
    
    public void acelerar(double novaV) {
    	
    	if(estaLigado == true) {
    		velocidade += novaV;
    	}
    }

    public void frear(){
    	
    	velocidade = 0;
    }
    
    public String devolveInformacoes(){
    	
    	return String.format("Carro de modelo %s com %d passageiros", modelo, nPassageiros);
    	
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public int getnPortas(){
        return nPortas;
    }

    public void setnPortas(int nPortas){
        this.nPortas = nPortas;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    public int getnPassageiros() {
        return nPassageiros;
    }

    public void setnPassageiros(int nPassageiros) {
        this.nPassageiros = nPassageiros;
    }

    public void setEstaLigado(boolean estaLigado) {
        this.estaLigado = estaLigado;
    }
}