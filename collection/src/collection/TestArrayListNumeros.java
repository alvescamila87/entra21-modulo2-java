package collection;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class TestArrayListNumeros {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner (System.in);
        ArrayList<Integer> listaNumeros = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.printf("Informe o %sº número: ", (i + 1));
            listaNumeros.add(entrada.nextInt());
        }
        
        System.out.println(listaNumeros);
        
        entrada.close();
        
    }
    
}
