package aula01;

import java.util.Scanner;

public class EstruturaDecisao_Switch_Case {

    public static void main(String[] args) {

        // Estruturas de decisão

        // Switch case

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe um valor entre 1 e 3: ");

        int opcao = entrada.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("UM");
                break;
            case 2:
                System.out.println("DOIS");
                break;
            case 3:
                System.out.println("TRÊS");
                break;
            default:
                System.out.println("Opção inválida!");
        }

    }
}
