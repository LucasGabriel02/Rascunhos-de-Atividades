
package retangulo;


public class Externo {
    //Atributo
    private float baseExterna;
    private float alturaExterna;
    
    
    //Construtor
    public Externo(float baseExterna, float alturaExterna){
        float areaExterna = (baseExterna * alturaExterna);
    }

    public Externo() {
        throw new UnsupportedOperationException("."); 
    }

    
    
        
    //Metodos 
    public float areaExterna(){
        return (baseExterna * alturaExterna);
        
    }    
        
    }
    

