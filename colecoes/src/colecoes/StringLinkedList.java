
package colecoes;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Camila
 */
public class StringLinkedList {
    
    public static void main(String[] args) {
        
        List<String> stringLinkedList = new LinkedList<>();
        
        stringLinkedList.add("Camila");
        stringLinkedList.add("Patricia");
        stringLinkedList.add("Karoline");
        
        System.out.println(stringLinkedList.contains("Karoline"));
        
        // pegando o último item da lista
        System.out.println(stringLinkedList.get(stringLinkedList.size()-1));
             
    }
    
}
