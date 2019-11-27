
package tedretangulo01;

import javax.swing.JOptionPane;

import retangulo.Externo;   
import retanguloIterno.Interno;
import retangulototal.Moldura;

public class TedRetangulo01 {

   
    public static void main(String args[]) {
        Externo retangext = new Externo();
        Interno interretan = new Interno();
        Moldura total = new Moldura();
        

        //Retangulo Externo
        float baseExterno;
        float alturaExterna;
        float areaExterna;
        String baseE, alturaE;
        
        //Retangulo Interno
        float baseInterna;
        float alturaInterna;
        float areaInterna;
        String baseI, alturaI;
        
        // Uma Variavel total para fazer o calculo total
        
        float areatotal;
        
        // Calculo Externo Retangulo a Ser Digitado
        baseE = JOptionPane.showInputDialog(null,"Digite a Base Externa do Retângulo: ");
        alturaE = JOptionPane.showInputDialog(null,"Digite a Altura do Retângulo: ");
        
        // Calculo Interno do Retangulo a Ser Digitado
         
        baseI = JOptionPane.showInputDialog(null,"Digite a Base Interna do Retângulo: ");
        alturaI = JOptionPane.showInputDialog(null,"Digite a Altura Interna do Retângulo: ");
        
        
        JOptionPane.showMessageDialog(null, "A area da Moldura é ("+Moldura+")");
        
        
        
        
    }
    
}
