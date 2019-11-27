package visao;


public class Funcionario {
    
    private String nome;
    private String matricula;
    private String sexo;
    private int dataNascimento;
    private String recebeSalario;
    
    
    
    //Metodos

    public Funcionario(String nome, String matricula, String sexo, int dataNascimento, String recebeSalario) {
        this.nome = nome;
        this.matricula = matricula;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.recebeSalario = recebeSalario;
    }
    //ToString
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", matricula=" + matricula + ", sexo=" + sexo + ", dataNascimento=" + dataNascimento + ", recebeSalario=" + recebeSalario + '}';
    }
    
    //Get
    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getSexo() {
        return sexo;
    }

    public int getDataNascimento() {
        return dataNascimento;
    }

    public String getRecebeSalario() {
        return recebeSalario;
    }
     
    //Set

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setDataNascimento(int dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setRecebeSalario(String recebeSalario) {
        this.recebeSalario = recebeSalario;
    }
    
       
}
