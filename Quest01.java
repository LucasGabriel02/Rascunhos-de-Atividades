//Aluno: Lucas Gabriel
//Sistemas para Internet P2
//TED 01
package quest01;
import java.util.Scanner;

public class Quest01 {

   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        float valorPagar;
        float preco;
        float troco;
        
        System.out.println("Qual foi o Valor Pago: ");
        valorPagar = scan.nextFloat();
        System.out.println("Qual é o Preço do Produto");
        preco = scan.nextFloat();
        troco = valorPagar - preco;
        System.out.println("Você Recebeu $: "+troco);
        
        
        
    }   
}
