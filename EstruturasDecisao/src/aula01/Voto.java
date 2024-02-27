package aula01;

import java.util.Scanner;

public class Voto {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a idade do eleitor: ");

        int idadeEleitor = entrada.nextInt();

        if(idadeEleitor < 16) {
            System.out.println("Não pode votar!");
        } else if (idadeEleitor >= 18 && idadeEleitor <= 70 ) {
            System.out.println("Obrigatório votar");
        } else {
            System.out.println("Voto opcional");
        }

    }
}
