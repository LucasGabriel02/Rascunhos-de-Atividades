package visao2;

public class Jogo2D extends JogoDigital{
    
    private int dispositivo;
    private String controle;
     
    //Construtor Herança
    
    public Jogo2D(String anoCriacao, String produtora) {
        super(anoCriacao, produtora);
    }
    
    //Metodos

    public Jogo2D(int dispositivo, String controle, String anoCriacao, String produtora) {
        super(anoCriacao, produtora);
        this.dispositivo = dispositivo;
        this.controle = controle;
    }
    

    public int getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(int dispositivo) {
        this.dispositivo = dispositivo;
    }

    public String getControle() {
        return controle;
    }

    public void setControle(String controle) {
        this.controle = controle;
    }
 
    
}
