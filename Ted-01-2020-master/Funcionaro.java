package app;

public class Funcionaro {
    
    private String idFuncionario;
    private String nomeFuncionario;
    private String filial;
     
    //Metodos

    public Funcionaro(String idFuncionario, String nomeFuncionario, String filial) {
        this.idFuncionario = idFuncionario;
        this.nomeFuncionario = nomeFuncionario;
        this.filial = filial;
    }
    
    //ToString

    @Override
    public String toString() {
        return "Funcionaro{" + "idFuncionario=" + idFuncionario + ", nomeFuncionario=" + nomeFuncionario + ", filial=" + filial + '}';
    }
    
    // Get & Set

    public String getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(String idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getFilial() {
        return filial;
    }

    public void setFilial(String filial) {
        this.filial = filial;
    }
    

}
