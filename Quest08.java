//Aluno: Lucas Gabriel
//Sistemas para Internet P2
//TED 01

package quest08;

import java.util.Scanner;

public class Quest08 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int maiorV;
        int menorV;
        float media;
        int somatorio;
        System.out.println("Digite o Primeiro Valor");
        maiorV = scan.nextInt();
        System.out.println("Digite o Segundo Valor");
        menorV = scan.nextInt();
        
        media = (maiorV + menorV)/2;
        System.out.println("A media foi: "+media);
        
        somatorio = maiorV + menorV;
        System.out.println("O Somatorio Geral foi: "+somatorio);
        
        
        if (maiorV < menorV){
            System.out.println("O maior Número foi: "+menorV);
        }
        
        else{
            System.out.println("O Menor Foi"+maiorV);
        }
    } 
}
