
package programa03;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Programa03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner valor = new Scanner (System.in);
        
        System.out.print("Informe um número inteiro: ");
        
        int numero;
        
        numero  = valor.nextInt();
        
        System.out.println("Número informado: " + numero);
    }
    
}
