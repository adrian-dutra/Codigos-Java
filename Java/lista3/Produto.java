public class Produto {
    
    private String nome;
    private double valor, peso;
    private int quantidade;

    public Produto(String nNome, double nValor, double nPeso){

        this.nome = nNome;
        this.valor = nValor;
        this.peso = nPeso;
    }

    public Produto(String nNome, double nValor, double nPeso, int quant){

        this.nome = nNome;
        this.valor = nValor;
        this.peso = nPeso;
        this.quantidade = quant;
    }

    public double devolveValorAgregado(){

        return valor*quantidade;
    }
    
    public double devolvePesoAgregado(){

        return peso*quantidade;
    }

    public double converteEmDolares(double cotacaoUSD){

        return valor*cotacaoUSD;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
