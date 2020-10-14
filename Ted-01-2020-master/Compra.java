package jogoprinc;

public class Compra extends JogoPrinc{
    
    private String jogo;
    private String tempo;
     
    //Metodos

    public Compra(String jogo, String tempo) {
        this.jogo = jogo;
        this.tempo = tempo;
    }
    
    //Get & Set

    public String getJogo() {
        return jogo;
    }

    public void setJogo(String jogo) {
        this.jogo = jogo;
    }

    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }
       
    
}
