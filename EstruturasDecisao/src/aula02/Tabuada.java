package aula02;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {

        // Estruturas de repetição

        // While

        Scanner entrada = new Scanner(System.in);

        System.out.print("Qual tabuada você quer (1 a 10): ");

        int x = entrada.nextInt();
        int y = 1;

        if(x > 0 && x <= 10) {
            System.out.println("Tabuada de " + x + ": ");

            while (y <= 10) {
                System.out.printf("%s * %s = %s \n", x, y, (y * x));
                y++;
            }

        } else {
            System.out.println("Valor inválido!");
        }




    }
}
