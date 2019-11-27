//Aluno: Lucas Gabriel
//Sistemas para Internet P2
//TED 01

package quest07;
import java.util.Scanner;

public class Quest07 {

   
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        float nota1;
        float nota2;
        float nota3;
        float media;
        
        System.out.println("Digite Sua Primeira Nota: ");
        nota1 = scan.nextFloat();
        System.out.println("Digite Sua Segunda Nota: ");
        nota2 = scan.nextFloat();
        System.out.println("Digite Sua Terceira Nota: ");
        nota3 = scan.nextFloat();
        media = (nota1 + nota2 + nota3)/3;
        System.out.println("Sua Media Foi: " + media);
        media = scan.nextFloat();
        
        
        
        
      
        if (media >=7){
            System.out.println("Parabéns! Você foi Aprovado! "+ media);
        }
        
        else if (media <=2.6 && media <=6.9){
            System.out.println("Você Está em Recuperação!"+ media);
        }
        
        else{
            System.out.println("Você Foi Reprovado"+ media);
        }
        
      
        
        
    }
    
}
