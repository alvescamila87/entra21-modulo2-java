package aula01;

import java.util.Scanner;

public class EstruturaDecisao_If_Else {

    public static void main(String[] args) {

        // Estruturas de decisão

        // IF + ELSE

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a sua idade: ");

        int idade = entrada.nextInt();

        if (idade >= 18) {
            System.out.println("Pode dirigir");
        } else {
            System.out.println("Não pode dirigir!");
        }

    }
}
