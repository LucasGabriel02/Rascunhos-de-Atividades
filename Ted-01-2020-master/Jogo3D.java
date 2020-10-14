package visao2;

public class Jogo3D extends JogoDigital{
       
    private String console;
    private String tipoControle;
       
    //Construtor Herança
    
    public Jogo3D(String anoCriacao, String produtora) {
        super(anoCriacao, produtora);
    }
    
    //Metodos

    public Jogo3D(String console, String tipoControle, String anoCriacao, String produtora) {
        super(anoCriacao, produtora);
        this.console = console;
        this.tipoControle = tipoControle;
    }  
    
    //Get & Set

    public String getConsole() {
        return console;
    }

    public void setConsole(String console) {
        this.console = console;
    }

    public String getTipoControle() {
        return tipoControle;
    }

    public void setTipoControle(String tipoControle) {
        this.tipoControle = tipoControle;
    }
    
}
