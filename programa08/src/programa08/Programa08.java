
package programa08;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Programa08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        double nota;
        
        System.out.println("Digite a nota: ");
        nota = entrada.nextDouble();
        
        if(nota >= 7) {
            System.out.println("Aluno aprovado");
        } else if (nota >=5) {
            System.out.println("Aluno em recuperação");
        } else {
            System.out.println("Aluno reprovado");
        }
    }
}
