
package sistemavotacao;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class SistemaVotacao1 {

    /**
     * @param args the command line arguments
     * 
     * Problema: Sistema de votação simples
     * O sistema exibirá na tela um menu com 4 opções de voto (4 candidatos), uma opção para mostrar o resultado e outra para sair da votação.​
     * Após inserir um voto, o sistema exibe novamente o menu para que novos votos possam ser inseridos;​
     * O sistema contará quantos votos cada candidato recebeu;​
     * Ao entrar na opção de mostrar o resultado, o sistema mostrará quantos votos cada candidato recebeu e quem foi o vencedor.        
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int opcaoMenu=0, candidato1=0, candidato2=0, candidato3=0, candidato4=0, totalVotos, candidatoVencedor;
        
        // menu do sistema de votação
        while(opcaoMenu != 6) {
            System.out.println("""
                               -------- MENU --------
                               [1] Votar na MARIA
                               [2] Votar no DOM MANUEL
                               [3] Votar na PEDRO
                               [4] Votar na PRINCESA ISABEL
                               [5] Resultado da votação
                               [6] Sair
                               ----------------------
                               """);
            System.out.print("Digite uma opção do menu: ");
            opcaoMenu = entrada.nextInt();
            
         // processamento do sistema
            switch(opcaoMenu) {
                case 1:
                    System.out.println("Voto na candidata MARIA contabilizado com sucesso!");
                    candidato1++;
                    break;
                case 2:
                    System.out.println("Voto no candidato DOM MANUEL contabilizado com sucesso!");
                    candidato2++;
                    break;
                case 3:
                    System.out.println("Voto no candidato PEDRO contabilizado com sucesso!");
                    candidato3++;
                    break;
                case 4:
                    System.out.println("Voto na candidata PRINCESA ISABEL contabilizado com sucesso!");
                    candidato4++;
                    break;
                case 5:
                    System.out.println("RESULTADO DA VOTAÇÃO");
                    
                    totalVotos = candidato1 + candidato2 + candidato3 + candidato4;
                    System.out.println("Total de votos: " + totalVotos);
                    
                    if(candidato1 > candidato2 && candidato1 > candidato3 && candidato1 > candidato4) {
                        candidatoVencedor = candidato1;
                        System.out.println("Candidato 1 é vencedor! Com: " + candidatoVencedor + " voto(s)!");
                    } else if (candidato2 > candidato3 && candidato2 > candidato4){
                        candidatoVencedor = candidato2;
                        System.out.println("Candidato 2 é vencedor! Com: " + candidatoVencedor + " voto(s)!");
                    } else if (candidato3 > candidato4){
                        candidatoVencedor = candidato3;
                        System.out.println("Candidato 3 é vencedor! Com: " + candidatoVencedor + " voto(s)!");
                    } else {
                        candidatoVencedor = candidato4;
                        System.out.println("Candidato 4 é vencedor! Com: " + candidatoVencedor + " voto(s)!");
                    }
                    break;
                case 6:
                    System.out.println("FIM DO PROGRAMA!");
                    System.out.println("Volte sempre!");
                    break;
                default: System.out.println("Opção inválida de menu, tente novamente!");
            }
        }
    }
    
}
