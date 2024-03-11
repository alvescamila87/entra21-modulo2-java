
package queue;

import java.awt.BorderLayout;
import java.util.Deque;
import java.util.LinkedList;

/**
 *
 * @author Camila
 */
public class StringDeque {
    
    public static void main(String[] args) {
        
        Deque<String> stringDeque = new LinkedList<String>();
        
        // adiciona elemento ao final da deque
        stringDeque.add("Elemento 1 (tail)");
        
        // adiciona elemento no inicio da deque
        stringDeque.addFirst("Elemento 2 (Head)");
        
        // adiciona elemento ao final da deque
        stringDeque.addLast("Element 3 (tail)");
        
        // adiciona elemento no inicio da deque
        stringDeque.push("Elemento 4 (head)");
        
        // adiciona elemento ao final da deque
        stringDeque.offer("Element 5 (tail)");
        
        // adiciona elemento no inicio da deque
        stringDeque.offerFirst("Element 6 (head)");
        
        System.out.println(stringDeque + "\n");
        
        // podemos remover o primeiro ou o último elemento também
        stringDeque.removeFirst();
        stringDeque.removeLast();
        
        System.out.println("Deque after removing " + "first and last: \n" + stringDeque);
    }
    
}
