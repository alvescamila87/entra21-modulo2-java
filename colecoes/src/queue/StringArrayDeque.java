
package queue;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author Camila
 */
public class StringArrayDeque {
    
    public static void main(String[] args) {
        
        Deque<String> stringArrayDeque = new ArrayDeque<String>();
        
        stringArrayDeque.add("AA");
        stringArrayDeque.addFirst("BB");
        stringArrayDeque.addFirst("BC");
        stringArrayDeque.addFirst("BD");
        stringArrayDeque.addLast("CC");
        
        System.out.println(stringArrayDeque);
        
        // retorna e remove o primeiro elemento da Deque
        System.out.println(stringArrayDeque.pop());
        
        // retorna e remove o primeiro elemento da Deque
        System.out.println(stringArrayDeque.poll());
        
        // retorna e remove o primeiro elemento da Deque
        System.out.println(stringArrayDeque.pollFirst());
        
        System.out.println(stringArrayDeque.pollLast());
        
        System.out.println(stringArrayDeque);
        
    }
    
}
