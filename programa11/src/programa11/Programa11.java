
package programa11;

import java.util.Scanner;
import javax.sound.midi.Soundbank;

/**
 *
 * @author Camila
 */
public class Programa11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int opcao;
        
        System.out.println("Informe um número de 1 a 7: ");
        opcao = entrada.nextInt();
        
        switch(opcao) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;                
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado-feira");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
    
}
