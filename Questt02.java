//Aluno: Lucas Gabriel
//Sistemas para Internet P2
//TED 01

package questt02;

import java.util.Scanner;

public class Questt02 {

   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float valorKg;
        float quantdadeDoKg;
        float valorParaPagar;
        System.out.println("Qual o valor do Kg do Produto a ser Comprado: ");
        valorKg = scan.nextFloat();
        System.out.println("Qual a Quantidade do Kg a ser Comprado: ");
        quantdadeDoKg = scan.nextFloat();
        System.out.println("Qual o valor a ser Pago: ");
        valorParaPagar = scan.nextFloat();
        valorParaPagar = valorKg * quantdadeDoKg;
    }
    
}


