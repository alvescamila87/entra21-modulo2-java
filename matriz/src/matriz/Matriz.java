
package matriz;

/**
 *
 * @author Camila
 */
public class Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz;
        
        matriz = new int[3][3];
        
        matriz[0][2] = 5;
        
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz.length; coluna++) {
                matriz[linha][coluna] = linha + coluna;
                System.out.print(matriz[linha][coluna] + " ");
            }
            System.out.println(" ");
        }
    }
    
}
