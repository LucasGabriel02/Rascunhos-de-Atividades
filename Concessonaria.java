package app;
import javax.swing.JOptionPane;
import visao.Carro;
import visao.Endereco;
import visao.Marca;
import visao.Proprietario;



public class Concessonaria {
    
    public static void main(String[] args){
        String Proprietario = null;
        Proprietario proprietario = new Proprietario("Lucas Gabriel", 987654, 4321);
        
        Endereco endereco = new Endereco(Proprietario);
        
        Marca marca = new Marca(2018, 24334);
        
        Carro carro = new Carro("Voyage", "Cinza", 2018, marca, 32443, Proprietario, 320, 4, false, 6, true, 10);
        
        //System.out.println(carro.toString());
        JOptionPane.showMessageDialog(null,"O Resultado:  ("+carro.toString+") ");
    }


    }
    

