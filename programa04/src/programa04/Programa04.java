
package programa04;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Programa04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int num1, num2, resultado;
        
        System.out.println("Informe o primeiro número: ");
        num1 = entrada.nextInt();
        
        System.out.println("Informe o segundo número: ");
        num2 = entrada.nextInt();
        
        resultado = num1 + num2;
        
        System.out.println("O resultado é: " + resultado);
    }
    
}
