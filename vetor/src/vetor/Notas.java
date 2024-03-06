
package vetor;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Notas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int[] notas = new int[3];
        int soma = 0;
        double media = 0;
        
        for (int i = 0; i < notas.length; i++) {            
            System.out.println("Digite uma nota: ");                    
            notas[i] = entrada.nextInt();
        }
        
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
            soma = soma + notas[i];
        }
        
        media = soma / 3;
        System.out.println("Média: " + media);
        
        
        
        
        
    }
    
}
