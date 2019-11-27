
package visao;

public class Coordenador extends Professor{
    
    private String respTurma;

    
    //Construtor Herança

    public Coordenador(String nome, String matricula, String sexo, int dataNascimento, String recebeSalario) {
        super(nome, matricula, sexo, dataNascimento, recebeSalario);
    }
    
    
    
    //Get

    public String getRespTurma() {
        return respTurma;
    }
    
    //Set

    public void setRespTurma(String respTurma) {
        this.respTurma = respTurma;
    }
    
    
    

    }


    
    
    
    
    



