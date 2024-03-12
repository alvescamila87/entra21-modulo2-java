
package testes;

/**
 *
 * @author Camila
 */
public class ArrayMethod {

    /**
     * @param args the command line arguments
     */
    public static int preencherVetor(int[] numeros) {
        int num = numeros[0]; //5
        for (int i = 1; i < numeros.length; i++) {
            if(numeros[i] > 5) {
                num = numeros[i]; // 6, 8
            }
            return num; // 4, 1, -1
        }
        return num;

    }

    public static void main(String[] args) {
        int[] num = {5, 6, 8, 4, 1 -1};
        int[] numeros;

        System.out.println(preencherVetor(num));
    }
}
