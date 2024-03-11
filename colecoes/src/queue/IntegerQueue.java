package queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Camila
 */
public class IntegerQueue {
    
    public static void main(String[] args) {
        
        Queue<Integer> integerQueue = new LinkedList<>();
        
        // adiciona elementos de 0 a 4 na fila
        for (int i = 0; i < 5; i++) {            
            integerQueue.add(i);              
        }
        System.out.println("Elements of queue " + integerQueue);
        
        // removendo o primeiro intem da fila        
        int removedItem = integerQueue.remove();
        System.out.println("Element removed " + removedItem);
        System.out.println("Elements of queue " + integerQueue);
        
        // visualizando o primeiro elemento da fila
        int head = integerQueue.peek();
        System.out.println("First element " + head);
        
        // item adicionado ao fim da lista
        integerQueue.add(7);
        System.out.println(integerQueue);
        
    }
    
}
