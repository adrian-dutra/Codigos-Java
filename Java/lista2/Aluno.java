/*public class Aluno {

    String[] disciplinas;
    String nome, RGA;
    double[] medias;
    int anoIngresso; 


    Aluno(String nome1, String RGA1, int anoIngresso1){

        this.nome = nome1;
        this.RGA = RGA1;
        this.anoIngresso = anoIngresso1;

    }

    Aluno(String nome1, String RGA1, int anoIngresso1, String[] disciplinas1, double[] medias1){

        this.nome = nome1;
        this.RGA = RGA1;
        this.anoIngresso = anoIngresso1;
        this.disciplinas = disciplinas1;
        this.medias = medias1;

    }

    int tempoCurso;
    int tempoDeCurso(int ano){
        tempoCurso = ano - anoIngresso;
        return tempoCurso;
    }

    double devolveCoeficienteRendimento(){
        
        double coeficiente,coeficienteRendimento;
        coeficiente = 0;
        for(int i = 0; i < medias.length;i++){
            coeficiente += medias[i];
        }
        coeficienteRendimento = coeficiente/medias.length;
        return coeficienteRendimento;
    }

    void imprimeNome(){
        System.out.println(nome);
    }

    Boolean comparaAluno(Aluno B){
        if(B.RGA == this.RGA){
            return true;
        }
        else{
            return false;
        }

    }
    
}
*/