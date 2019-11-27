package visao;

public class Professor extends Funcionario {

    private int numAula;
    private int leciona;

    
    //Construtor Herança
    public Professor(String nome, String matricula, String sexo, int dataNascimento, String recebeSalario) {
        super(nome, matricula, sexo, dataNascimento, recebeSalario);
    }

    
    //Metodos
    public Professor(int numAula, int leciona, String nome, String matricula, String sexo, int dataNascimento, String recebeSalario) {
        super(nome, matricula, sexo, dataNascimento, recebeSalario);
        this.numAula = numAula;
        this.leciona = leciona;
    }
    
    
    //Get
    public int getNumAula() {
        return numAula;
    }

    public int getLeciona() {
        return leciona;
    }
    
    //Set

    public void setNumAula(int numAula) {
        this.numAula = numAula;
    }

    public void setLeciona(int leciona) {
        this.leciona = leciona;
    }
    
    

}
