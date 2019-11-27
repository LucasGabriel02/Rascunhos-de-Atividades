
package retanguloIterno;


public class Interno {
    
    //Atributo
    private float baseInterna;
    private float alturaInterna;
    
    //Construtor
    
    public Interno (float baseInterna, float alturaInterna){
        float areaInterna = (baseInterna * alturaInterna);
        
        //this.baseInterna = n;
        //this.alturaInterna = s;
    }
    public Interno() {
        throw new UnsupportedOperationException("");
    }    
    //Metodos
    
    public float Interno(){
        return (baseInterna * alturaInterna);
        
    }   
}
