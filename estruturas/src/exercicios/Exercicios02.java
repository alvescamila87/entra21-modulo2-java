
package exercicios;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Exercicios02 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        String codigo;      
        double preco, maiorPreco=0, soma=0;
        
        for (int i = 0; i < 3; i++) {
            
            System.out.println("Informe o código do " + (i + 1) + "º produto: ");
            codigo = entrada.next();
            
            System.out.println("Informe o preço do " + (i + 1) + "º produto: ");
            preco = entrada.nextDouble();

            if(preco > maiorPreco) {
                maiorPreco = preco;
            }
            
            soma += preco;
            
        }
        
        System.out.println("Média de preço dos produtos: " + soma / 3);
        System.out.println("Maior preõ: " + maiorPreco);
        
    }
    
}
