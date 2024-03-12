
package testes;

/**
 *
 * @author Camila
 */
public class FuncaoRecursiva {
    
    public static int calcular(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        
        return n * calcular(n - 1);
    }
    
    
    public static void main(String[] args) {
        int resultado = calcular(5);
        System.out.println(resultado);
    }
    
}
