//Aluno: Lucas Gabriel
//Sistemas para Internet P2
//TED 01
package quest04;
import java.util.Scanner;

public class Quest04 {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        float valorC;
        float valorD;
        float valorE;
        System.out.println("Digite o Primeiro Lado do Triângulo");
        valorC = scan.nextFloat();
        System.out.println("Digite o Segundo Lado do Triângulo");
        valorD = scan.nextFloat();
        System.out.println("Digite o Terceiro Lado do Triângulo");
        valorE = scan.nextFloat();
        
        if ((valorC < valorD + valorE)&&(valorD < valorC + valorE)&&(valorE < valorC + valorD)){
            
        }
        
        if (valorC == valorD && valorC == valorE && valorE == valorD){
            System.out.println("Triângulo Equilatero");
        }
        
        else if ((valorC == valorD)&&(valorC == valorE)&&(valorE == valorD)){
            
            System.out.println("Triângulo Isosceles");  
    }
        else{
            System.out.println("Triângulo Escaleno");
        }
        
    
        
        
    }
    
}
