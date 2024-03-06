
package programa12;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Programa12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Sexo(H ou M): ");
        String sexo;
        sexo = entrada.next();
        sexo = sexo.toLowerCase();
        
        System.out.println("Idade: ");
        int idade = entrada.nextInt();
        
        System.out.println("Sexo: " + sexo + " e a Idade: " + idade);
        
        if(sexo.equals("m") && idade >= 62 || sexo.equals("h") && idade >= 65) {
            System.out.println("O usuário pode se aposentar");
        } else {
            System.out.println("O usuário ainda NÃO pode se aposentar");
        }
        
       
    }
    
}
