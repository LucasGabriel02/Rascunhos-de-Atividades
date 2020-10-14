package visao1;

import jogoprinc.JogoPrinc;


public class JogoTabuleiro extends JogoPrinc{
    
    private String estilo;
    private String andereco;
    
    
    public JogoTabuleiro (String estilo, String andereco){
        this.estilo = estilo;
        this.andereco = estilo;
    }
    
    //Get & Set
    public String getEstilo(){
        return estilo;
    }
    
    public String getAndereco(){
        return andereco;
    }
    
    public void setEstilo(String estilo){
        this.estilo = estilo;
    }
    
    public void setAndereco(String andereco){
        this.andereco = andereco;
    }
    
  
}
