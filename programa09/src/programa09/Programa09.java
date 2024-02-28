
package programa09;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Programa09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner entrada = new Scanner (System.in);
        
        int num1, num2;
        
        System.out.println("Informe primeiro número inteiro: ");
        num1 = entrada.nextInt();
        
        System.out.println("Informe o segundo valor inteiro: ");
        num2 = entrada.nextInt();
        
        if (num1 > num2) {
            System.out.println("O primeiro número informado é maior que o segundo.");
        } else if (num1 < num2) {
            System.out.println("O segundo número informado é maior que o primeiro.");
        } else {
            System.out.println("Os números informados são iguais");
        }
        
    
    }
    
}
