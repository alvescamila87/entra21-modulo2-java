
package devjavat1;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class DevJavaT1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // tipo de dado: primitivo
        // inteiros
        byte valor;
        short numero;
        int contador;
        long id;
        
        // números reais
        float media;
        double salario;
        
        // verdadeiro | falso
        boolean valid;
        
        // caracter
        char sexo;
        
        // tipo de dado: objeto
        
        String nomeCompleto = "Camila";
        
        // wrapper: tipo de dado objeto que representa o tipo de dado primitivo
        
        Integer nota;
        Double mediaCalc;
        Long idProduct;
        
        System.out.println("Hello world! Hi, " + nomeCompleto + "!");
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.print("Digite o seu nome: ");
        
        String nome = entrada.nextLine();
        
        System.out.println("Nome: " + nome);
        entrada.close();
        
        System.out.println(!(10!=10) && (50 <= 10 || 5 == 5));               
        
        
    }
    
}
