
package set;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Camila
 */
public class StringSortedSet {
    
    public static void main(String[] args) {
        
        SortedSet<String> stringSortedSet = new TreeSet<>();
        
        stringSortedSet.add("A");
        stringSortedSet.add("B");
        stringSortedSet.add("B");
        stringSortedSet.add("C");
        stringSortedSet.add("C");
        
        stringSortedSet.forEach(System.out::println);
        
        System.out.println(stringSortedSet.contains("C"));
        System.out.println(stringSortedSet.first());
        System.out.println(stringSortedSet.last()); 
                
    }
    
}
