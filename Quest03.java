
//Aluno: Lucas Gabriel
//Sistemas para Internet P2
//TED 01
package quest03;
import java.util.Scanner;

public class Quest03 {

 
    public static void main(String[] args) {
        //Questao3
        int numero;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um Númro para Saber se é Par ou Ímpar! ");
        int resultado=sc.nextInt();
        
        numero=resultado;
        
        if (numero %2 ==0){
            System.out.println("O Número é Par! ");        
        }
        else{
            System.out.println("O Número é Impar! "); 
        }

    }
    
}
