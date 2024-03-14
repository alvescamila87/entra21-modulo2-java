
package sistemavotacao;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class SistemaVotacao2 {
    
    public static void main(String[] args) {
       Scanner dig = new Scanner (System.in); 
        int opcao=0; //variÃ¡vel para armazenar a opÃ§Ã£o desejada
        int c1=0, c2=0, c3=0, c4=0; //variÃ¡veis para contagem de votos de cada candidato
        
        do{
            System.out.println("Sistema de VotaÃ§Ã£o");
            System.out.println();
            System.out.println("[1] - Candidato A");
            System.out.println("[2] - Candidato B");
            System.out.println("[3] - Candidato C");
            System.out.println("[4] - Candidato D");
            System.out.println("[9] - Sair");
            System.out.println();
            System.out.println("Digite o nÃºmero do candidato em que deseja votar: ");
            opcao = dig.nextInt();
            
            if(opcao==1){
                c1++;
            }else if (opcao==2){
                c2++;
            }else if (opcao==3){
                c3++; 
            }else if (opcao==4){
                c4++;
            }
            
        }while (opcao!=9);
        
            System.out.println("Votos do Candidato A: " + c1);
            System.out.println("Votos do Candidato B: " + c2);
            System.out.println("Votos do Candidato C: " + c3);
            System.out.println("Votos do Candidato D: " + c4);
            
            if (c1>c2 && c1>c3 && c1>c4){ //candidato 1 vencedor
                System.out.println();
                System.out.println("Candidato A venceu!");
            }else if (c2>c1 && c2>c3 && c2>c4){
                System.out.println();
                System.out.println("Candidato B venceu!");                
            }else if (c3>c1 && c3>c2 && c3>c4){
                System.out.println();
                System.out.println("Candidato C venceu!");                
            }else if (c4>c1 && c4>c2 && c4>c3){
                System.out.println();
                System.out.println("Candidato D venceu!");                
            }else{
                System.out.println();
                System.out.println("Houve empate! EleiÃ§Ã£o sem vencedores");                
            }
        
    }
}
