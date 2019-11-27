package teste;
import visao.Professor;
import visao.Funcionario;
import visao.Coordenador;
import visao.Contador;

public class Teste {

    public static void main(String[] args) {
        
        Funcionario func = new Funcionario("Lucas", "12454546", "Masculino", 0, "Sim");
        Professor prof = new Professor("Gabriel", "44646498798", "Masculino", 0, "sim");
        Coordenador coord = new Coordenador("Sousa", "564654684789", "Masculino", 0, "sim");
        Contador cont = new Contador("Maciel", "564654", "Masculino", 0, "Sim");
        
        
        System.out.println(func);
        System.out.println(prof);
        System.out.println(coord);
        System.out.println(cont);
        
        
    
    }
    
}
