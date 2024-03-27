package collection;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class TestArrayListString {
    
    public static void main(String[] args) {
        /*
        Crie uma classe TesteArrayListString que possui um método main.
        Dentro do main crie um ArrayList de String (lista1).
        Adicione 10 Strings informadas pelo usuário.
        Percorra a lista verificando se o usuário digitou alguma String com menos de 3 caracteres. 
        Em caso positivo, adicione essa String em outra lista que você vai criar (lista2).
        Utilizando o método removeAll, remova todos os elementos dessa segunda lista (lista2) da lista principal (lista1).
        No final imprima a quantidade de Strings da lista  e seus elementos
        */
        
        Scanner entrada = new Scanner (System.in);
        
        ArrayList<String> listaPalavras1 = new ArrayList<>();
        ArrayList<String> listaPalavras2 = new ArrayList<>();
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Informe a " + (i + 1) + "º palavra: ");
            listaPalavras1.add(entrada.next());
        }
        
        listaPalavras1.forEach(palavra -> {
            if(palavra.length() < 3) {
                listaPalavras2.add(palavra);
            }
        });
        
        listaPalavras1.removeAll(listaPalavras2);
        
        System.out.println("Tamanho lista de palavras 1: " + listaPalavras1.size() + " elementos: " + listaPalavras1);
        System.out.println("Tamanho lista de palavras 2: " + listaPalavras2.size() + " elementos: " + listaPalavras2);
        
        
    }
    
}
