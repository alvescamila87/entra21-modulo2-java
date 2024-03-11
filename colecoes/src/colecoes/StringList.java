
package colecoes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Camila
 */
public class StringList {
    
    public static void main(String[] args) {
        
        
        List<String> stringList = new ArrayList<>();
        
        stringList.add("e");
        stringList.add("z");
        stringList.add("a");
        stringList.add("x");
        stringList.add("c");
        stringList.add("p");
        
        //método que nos pemite realizar um ordenação por meio
        //da Classe Comparator
        stringList.sort(Comparator.naturalOrder());
        
        stringList.forEach(System.out::println);       
        
        System.out.println(stringList);
        
        //podemos acessar os itens por meio de um index
        System.out.println(stringList.get(2));
        System.out.println(stringList.set(2, "pet"));
        System.out.println(stringList.remove(0));
        System.out.println(stringList.size());
    }
    
}
