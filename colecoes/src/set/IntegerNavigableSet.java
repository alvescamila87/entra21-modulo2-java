
package set;

import java.util.NavigableSet;
import java.util.TreeSet;

/**
 *
 * @author Camila
 */
public class IntegerNavigableSet {
    public static void main(String[] args) {
        
        
        NavigableSet<Integer> integerNavigableSet = new TreeSet<>();
        
        integerNavigableSet.add(0);
        integerNavigableSet.add(1);
        integerNavigableSet.add(2);
        integerNavigableSet.add(3);
        
        System.out.println(integerNavigableSet);
        
        // criando um set na ordem reversa do integerNavigableSet
        NavigableSet<Integer> reverseIntegerNavigableSet = integerNavigableSet.descendingSet();
        
        // print the normal and reverse views
        System.out.println("Ordem ascendente: " + integerNavigableSet);
        System.out.println("Ordem descendente: " + reverseIntegerNavigableSet);
    }
    
}
