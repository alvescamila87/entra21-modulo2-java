package set;

import java.util.TreeSet;

/**
 *
 * @author Camila
 */
public class StringTreeSet {
    
    public static void main(String[] args) {
        
        TreeSet<String> stringTreeSet = new TreeSet<>();
        
        stringTreeSet.add("A");
        stringTreeSet.add("B");
        stringTreeSet.add("C");
        stringTreeSet.add("C");
        
        // Ordem do Set Ascendente(Ascending)
        System.out.println(stringTreeSet);
        
    }
    
}
