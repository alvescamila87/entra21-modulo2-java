
package funcoes;

/**
 *
 * @author Camila
 */
public class FuncaoMutiplicacao {
    
    public static void main(String[] args) {
        int resultado = multiplicaValores(5,4);
        System.out.println("O resultado é: " + resultado);
    }
    
    public static int multiplicaValores(int num1, int num2) {
        int resultado = num1 * num2;
        return resultado;
    }
    
}
