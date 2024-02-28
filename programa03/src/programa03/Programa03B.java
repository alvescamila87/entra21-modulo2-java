
package programa03;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Programa03B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Informe o seu nome: ");
        String nome = entrada.next();
        
        System.out.println("Olá, " + nome + "! Tudo bem?");
    }
    
}
