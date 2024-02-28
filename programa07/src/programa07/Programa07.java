
package programa07;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Programa07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
       
        
        int num1, num2, resultadoSoma, resultadoSubtracao, resultadoMultiplicacao;
        
        System.out.println("Informe 1º  valor inteiro: ");
        num1 = entrada.nextInt();
        
        System.out.println("Informe 2º valor inteiro: ");
        num2 = entrada.nextInt();
        
        resultadoSoma = num1 + num2;
        resultadoSubtracao = num1 - num2;
        resultadoMultiplicacao = num1 * num2;
        
        System.out.println("A soma dos números: " + num1 + " e " + num2 + " é: " + resultadoSoma);
        System.out.println("A subtração dos números: " + num1 + " e " + num2 + " é: " + resultadoSubtracao);
        System.out.println("A multiplicação dos números: " + num1 + " e " + num2 + " é: " + resultadoMultiplicacao);
    }
    
}
