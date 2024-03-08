
package exercicios;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Exercicio01 {
    
    public static void main(String[] args) {
        
        int num1, num2, num3;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Digite um número inteiro: ");
        num1 = entrada.nextInt();
        
        do {
            System.out.println("Digite um 2º número inteiro: ");
            num2 = entrada.nextInt();            
            System.out.println(num1 == num2 ? "Digite um número diferente!" : "");
        } while(num1 == num2);
        
        do {
            System.out.println("Digite um 3º número inteiro: ");
            num3 = entrada.nextInt();            
            System.out.println(num3 == num1 || num3 == num2 ? "Digite um número diferente!" : "");
        } while (num3 == num1 || num3 == num2);
        
        if(num1 > num2 && num1 > num3) {
            System.out.println("o maior número é " + num1);
        } else if (num2 > num3) {
            System.out.println("O maior número é " + num2);
        } else {
            System.out.println("O maior número é " + num3);
        }
        
    }
    
}
