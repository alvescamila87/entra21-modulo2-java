
package programa10string;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Programa10String {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        String nome;
        
        System.out.println("Digite um nome: ");
        nome = entrada.nextLine();
        
        if(nome.toLowerCase().equals("camila") || nome.toUpperCase().equals("CAMILA")) {
            System.out.println("O nome é Camila!");
        } else {
            System.out.println("O nome não é Camila");
        }
    }
    
}
