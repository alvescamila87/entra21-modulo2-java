
package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;


/**
 *
 * @author Camila
 */
public class Lista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Deque<String> listaNomes = new ArrayDeque<>();
        listaNomes.addFirst("Camila");
        listaNomes.add("Patricia");
        listaNomes.add("Isabel");
        listaNomes.add("Karoline");
        listaNomes.addLast("Paulo");       
        
    
        System.out.println(listaNomes);
    }
    
    
            
    
}
