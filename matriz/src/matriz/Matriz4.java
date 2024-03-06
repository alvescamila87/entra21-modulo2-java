package matriz;

/**
 *
 * @author Camila
 */
public class Matriz4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int[5][4];
        
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                matriz[linha][coluna] = linha + coluna;
            }
            
        }
        
        int[][] matrizClonada = matriz.clone();
        
        // impressão
        System.out.println("");
        System.out.println("Matriz original");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "");
            }
            System.out.println("");
        }
        
        // impressão
        System.out.println("");
        System.out.println("Matriz clonada");
        for (int i = 0; i < matrizClonada.length; i++) {
            for (int j = 0; j < matrizClonada[i].length; j++) {
                System.out.print(matrizClonada[i][j] + "");
            }
            System.out.println("");
        }
    }
    
}
