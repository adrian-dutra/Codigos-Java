/*public class Aluno{

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

public class Turma{
    
    Aluno[] listaAlunos;
    String disciplina;
    int anoVigente;

    Turma(int nAlunos, int anoVigente, String disciplina, String[] nomes, String[] rgas, double[] medias){

        this.listaAlunos = new Aluno[nAlunos];
        this.anoVigente = anoVigente;
        String[] disciplinas = new String[1];

        disciplinas [0] = disciplina;
        this.disciplina = disciplinas[0];

        for(int i = 0; i < nAlunos; i++){
            double[] media = new double[1];
            media[0] = medias[i];
            this.listaAlunos[i] = new Aluno(nomes[i], rgas[i], anoVigente, disciplinas, media);

        }
    }

    void melhorMedia(){
        double maior = 0;
        int posicaoDoMaior = 0;
        for(int i = 0; i < listaAlunos.length; i++){
            if(listaAlunos[i].medias[0] > maior){

                maior = listaAlunos[i].medias[0];
                posicaoDoMaior += i;

            }
        }

        System.out.println(listaAlunos[posicaoDoMaior].nome);

    }
}
*/