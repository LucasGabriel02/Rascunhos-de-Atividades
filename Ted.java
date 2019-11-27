
package visao;

import javax.swing.JOptionPane;
import externo.RetanguloExterno;
import interno.RetanguloInterno;
import aplicacao.Moldura;


public class Ted {

    
    public static void main(String[] args) {
        
        RetanguloExterno extern = new RetanguloExterno();
        RetanguloInterno intern = new RetanguloInterno();
        Moldura mold = new Moldura();
        
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
        
	    
	JOptionPane.showMessageDialog(null, "A area da Moldura é ("+Moldura+")")
    }
    
}
