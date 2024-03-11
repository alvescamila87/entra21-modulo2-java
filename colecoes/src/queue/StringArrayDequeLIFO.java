
package queue;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author Camila
 */
public class StringArrayDequeLIFO {
    
    public static void main(String[] args) {
        
        Deque<String> stringArrayDequeLIFO = new ArrayDeque<String>();
        
        stringArrayDequeLIFO.addFirst("AA");
        stringArrayDequeLIFO.addFirst("BB");
        stringArrayDequeLIFO.addFirst("BA");
        stringArrayDequeLIFO.addFirst("BC");
        
        System.out.println(stringArrayDequeLIFO);
        
        int tamanhoOriginal = stringArrayDequeLIFO.size();
        
        for (int i = 0; i < tamanhoOriginal; i++) {
            System.out.println(stringArrayDequeLIFO.pollFirst());
        }
        
        System.out.println(stringArrayDequeLIFO);        
    }
    
}
