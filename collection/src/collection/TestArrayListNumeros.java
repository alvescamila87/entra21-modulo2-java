package collection;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class TestArrayListNumeros {
    
    public static void main(String[] args) {
        /*
        Crie uma classe TesteArrayListNumero que possui um método main.
        Dentro do main crie um ArrayList de Integer.
        Adicione 10 números informados pelo usuário.
        Se o usuário tiver digitado os números 10, 100 ou 1000 mostre uma mensagem informando que ele ganhou um bônus de R$ 50,00

        */

        Scanner entrada = new Scanner (System.in);
        ArrayList<Integer> listaNumeros = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.printf("Informe o %sº número: ", (i + 1));
            listaNumeros.add(entrada.nextInt());            
        }
        
        // modo 1
        //if(listaNumeros.contains(10) || listaNumeros.contains(100) || listaNumeros.contains(1000)){
        //    System.out.println("Você ganhou um bônus de R$50,00!");
        //}
        
        // modo 2 - operador ternário
        System.out.println((listaNumeros.contains(10) || listaNumeros.contains(100) || listaNumeros.contains(1000)) ? "Você ganhou bônus R$ 50,00" : "");
        
        System.out.println(listaNumeros);        
        entrada.close();
        
    }
    
}
