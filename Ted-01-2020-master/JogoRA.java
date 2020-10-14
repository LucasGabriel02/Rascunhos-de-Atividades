package visao2;

public class JogoRA extends JogoDigital{
    
    private int dispositivo;
    private String marcador;
    
    //Construtor Herança

    public JogoRA(String anoCriacao, String produtora) {
        super(anoCriacao, produtora);
    }

    public JogoRA(int dispositivo, String marcador, String anoCriacao, String produtora) {
        super(anoCriacao, produtora);
        this.dispositivo = dispositivo;
        this.marcador = marcador;
    }
    
    //Get & Set

    public int getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(int dispositivo) {
        this.dispositivo = dispositivo;
    }

    public String getControle() {
        return marcador;
    }

    public void setControle(String controle) {
        this.marcador = controle;
    }
   
}
