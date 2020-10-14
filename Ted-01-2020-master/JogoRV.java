package visao2;

public class JogoRV extends JogoDigital{
    
    private String tipoCapacete;
    private String estereoscopia;
    
    //Construtor Herança
    
    public JogoRV(String anoCriacao, String produtora) {
        super(anoCriacao, produtora);
    }
    
    //Metodos

    public JogoRV(String tipoCapacete, String estereoscopia, String anoCriacao, String produtora) {
        super(anoCriacao, produtora);
        this.tipoCapacete = tipoCapacete;
        this.estereoscopia = estereoscopia;
    }

    //Get & Set

    public String getTipoCapacete() {
        return tipoCapacete;
    }

    public void setTipoCapacete(String tipoCapacete) {
        this.tipoCapacete = tipoCapacete;
    }

    public String getEstereoscopia() {
        return estereoscopia;
    }

    public void setEstereoscopia(String estereoscopia) {
        this.estereoscopia = estereoscopia;
    }
    
    
    
}
