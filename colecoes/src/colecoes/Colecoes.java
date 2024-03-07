
package colecoes;

import java.util.ArrayList;
import java.util.Collection;
import javax.xml.transform.Source;

/**
 *
 * @author Camila
 */
public class Colecoes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Collection<String> listaNumeros = new ArrayList<>();
        
        listaNumeros.add("1");
        listaNumeros.add("2");
        listaNumeros.add("3");
        
        listaNumeros.forEach(numero -> System.out.println(numero));
        
        // nova forma
        listaNumeros.addAll(new ArrayList<String>());   
        
        System.out.println(listaNumeros.contains("1"));
        System.out.println(listaNumeros.size());
        System.out.println(listaNumeros.isEmpty());
        System.out.println(listaNumeros.remove("1"));
        
        listaNumeros.removeAll(new ArrayList<String>());
        listaNumeros.removeIf(s -> s.isBlank());
        listaNumeros.iterator();
        listaNumeros.spliterator();
        listaNumeros.clear();
        
        listaNumeros.forEach(numero -> System.out.println(numero));
    
    }
    
    
            
    
}
