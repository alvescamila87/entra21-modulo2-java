
package programa14vetor;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class MediaAlunos {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        double[] notas = new double[3];
        
        
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Informe a " + (i + 1) + "ª nota do aluno: ");
            notas[i] = entrada.nextDouble();
            
        }
        
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }
        
    }
    
}
