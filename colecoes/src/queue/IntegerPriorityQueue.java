
package queue;

import java.util.PriorityQueue;

/**
 *
 * @author Camila
 */
public class IntegerPriorityQueue {
    
    public static void main(String[] args) {
        
        PriorityQueue<Integer> integerQueue = new PriorityQueue<>();
        
        integerQueue.add(9);
        integerQueue.add(2);
        integerQueue.add(5);
        
        int first = integerQueue.poll();
        int second = integerQueue.poll();
        int third = integerQueue.poll();
        
        System.out.println("First: " + first);
        System.out.println("Second: " + second);
        System.out.println("Third: " + third);
        
        System.out.println(integerQueue);
                
        
    }
    
}
