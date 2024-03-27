
package collection;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Camila
 */
public class ArraylistAula03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Double> notas = new ArrayList<>();
        ArrayList<Double> medias = new ArrayList<>(Arrays.asList(4.5, 6.5, 10.0));
        
        System.out.println("Tamanho notas: " + notas.size() + " Tamanho de médias: " + medias.size());
        
        // inserindo elementos
        notas.add(10.0);
        System.out.println(notas);
        notas.add(0, 5.5);
        System.out.println(notas);
        notas.add(2, 7.5);
        System.out.println(notas);
        notas.add(3, 9.5);
        System.out.println(notas);
        
        // remover elementos
        notas.remove(1);
        System.out.println(notas);
        
        // verifica se contém elemento na lista:
        boolean contemNota = notas.contains(5.5);
        System.out.println("Contém nota: " + contemNota);
        
        // for convencional
        System.out.println("-> For convencional: ");
        for (int i = 0; i < notas.size(); i++) {
            System.out.printf("indice %s = %s \n", i, notas.get(i));
        }
        
        // for loop
        System.out.println("-> For loop: ");
        for(Double nota : notas) {
            System.out.println(nota);
        }
        
        // for each
        System.out.println("-> For each: ");
        notas.forEach(System.out::println);
        
                
    }
    
}
