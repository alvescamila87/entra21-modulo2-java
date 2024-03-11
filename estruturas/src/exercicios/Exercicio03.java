
package exercicios;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Exercicio04 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        String codigo;        
        int anoNascimento, anoIngresso, idade, tempoEmpresa, anoCorrente=2024;
        
        while(true) {
            System.out.println("Código do funcionário: ");
            codigo = entrada.next();
            
            System.out.println("Ano de nascimento: ");
            anoNascimento = entrada.nextInt();
            
            System.out.println("Ano de ingresso na empresa: ");
            anoIngresso = entrada.nextInt();
            
            idade = anoCorrente - anoNascimento;
            tempoEmpresa = anoCorrente - anoIngresso;
            
            System.out.println("Idade do funcionário: " + idade);
            System.out.println("Tempo de trabalho: " + tempoEmpresa);
            System.out.println(idade >= 65 || tempoEmpresa >= 30 || (idade >= 60 && tempoEmpresa >= 25) ? "Requerer aposentadoria" : "Direito não adquirido");
            
            if(idade >= 65 || tempoEmpresa >= 30 || (idade >= 60 && tempoEmpresa >= 25)) {}  
                       
        }
    }
    
}
