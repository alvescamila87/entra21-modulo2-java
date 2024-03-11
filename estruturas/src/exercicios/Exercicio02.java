
package exercicios;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Exercicio02 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        String nome;
        
        int quantidadeAlunos;
        float notas, soma = 0;
        
        System.out.println("Informe a quantidade de alunos: ");
        quantidadeAlunos = entrada.nextInt();
        
        for (int i = 0; i < quantidadeAlunos; i++) {
            
            System.out.println("Informe o nome do aluno: ");
            nome = entrada.next();
            
            for (int j = 0; j < 3; j++) {
                
                System.out.println("Informe a " + (j + 1) + "ª nota do aluno: ");
                notas = entrada.nextFloat();
                soma += notas;
            }
                        
            System.out.println("Média do aluno: " + nome);
            System.out.println(soma/3 >= 7 ? "APROVADO" : "REPROVADO");
                        
        }
        entrada.close();
        
    }
    
}
