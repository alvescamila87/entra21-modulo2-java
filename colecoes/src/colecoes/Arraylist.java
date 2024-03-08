
package colecoes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Camila
 */
public class Arraylist {
    
    public static void main(String[] args) {
    
        // List => ArrayList (mais genérica)
        List<String> listaNomes = new ArrayList<>();
        
        listaNomes.add("Camila");
        System.out.println(listaNomes.contains("Camila"));
        
        // ArrayList => ArrayList (mais específica)
        ArrayList<String> listaNomesArray = new ArrayList<>();
        
        listaNomesArray.add("Patricia");
        listaNomesArray.add("Karoline");
        System.out.println(listaNomesArray.isEmpty());
        System.out.println(listaNomesArray.contains("Camila"));
        
    
    }
   
    
}
