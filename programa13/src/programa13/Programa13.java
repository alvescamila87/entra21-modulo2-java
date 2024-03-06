
package programa13;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Programa13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Informe um numero inteiro: ");
        int numero = entrada.nextInt();
        
        System.out.println("Tabuada de: " + numero);
        for (int x = 1; x <= 100; x++) {
            System.out.printf("%s x %s = %s \n", numero, x, (x * numero));
        }
        
    }
    
}
