
package collection;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Camila
 */
public class ArraylistExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              
        ArrayList<Float> medias = new ArrayList<>();             
        ArrayList<Double> notas = new ArrayList<>(Arrays.asList(5.5,6.5,10.0));
        
        System.out.println(notas);
        
        // FOR CONVENCIONAL    
        System.out.println("FOR-CONVENCIONAL");
        for (int i = 0; i < notas.size(); i++) {
            System.out.println("Nota: " + notas.get(i));
            
        }
        
        // FOR LOOP
        System.out.println("FOR-LOOP");
        for(Double nota : notas) {
            System.out.println(nota);
        }
        
        // FOR EACH
        System.out.println("FOR-EACH");
        notas.forEach(System.out::println);
                
    }
    
}
