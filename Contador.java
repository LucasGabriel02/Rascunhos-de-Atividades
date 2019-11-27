
package visao;


public class Contador extends Funcionario{
    
    private String inscricaoContabilidade;

    //Construtor da Herança
    public Contador(String nome, String matricula, String sexo, int dataNascimento, String recebeSalario) {
        super(nome, matricula, sexo, dataNascimento, recebeSalario);
    }
    
    //Metodos
    public Contador(String inscricaoContabilidade, String nome, String matricula, String sexo, int dataNascimento, String recebeSalario) {
        super(nome, matricula, sexo, dataNascimento, recebeSalario);
        this.inscricaoContabilidade = inscricaoContabilidade;
    }
    
    //get
    public String getInscricaoContabilidade() {
        return inscricaoContabilidade;
    }
    
    //Set

    public void setInscricaoContabilidade(String inscricaoContabilidade) {
        this.inscricaoContabilidade = inscricaoContabilidade;
    }
    
    
    
    
    
    
}
