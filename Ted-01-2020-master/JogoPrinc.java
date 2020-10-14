package jogoprinc;

import visao1.JogoTabuleiro;
import visao2.JogoDigital;
import visao2.Jogo2D;
import visao2.JogoRA;
import visao2.JogoRV;
import visao2.Jogo3D;
import jogoprinc.Compra;
import app.Funcionaro;
import app2.Cliente;

public class JogoPrinc {

    public static void main(String[] args) {
              
        JogoDigital jogoDig = new JogoDigital( "2015", "maria");
        
        JogoTabuleiro jogoTab = new JogoTabuleiro("RPG","andereco");
        
        Jogo2D jogo2 = new Jogo2D("2", "Ps4");
        
        JogoRA jogoRa = new JogoRA("2","Limitado");
        
        JogoRV jogoRv = new JogoRV("Protetor", "estereoscopia");
        
        Jogo3D jogo3 = new Jogo3D("Xbox", "Padrao");
        
        Compra comp = new Compra("Mario Make", "30 minutos");
        
        Funcionaro func = new Funcionaro("1234", "Lucas", "Brasil");
        
        Cliente clien = new Cliente("1223", "Gabriel");
        
        System.out.println(jogoDig);
        System.out.println(jogoTab);
        System.out.println(jogo2);
        System.out.println(jogoRa);
        System.out.println(jogoRv);
        System.out.println(jogo3);
        System.out.println(comp);
        System.out.println(func);
        System.out.println(clien);

        
        
        
        
        
    }
    
}
