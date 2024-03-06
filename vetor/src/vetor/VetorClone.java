
package vetor;

/**
 *
 * @author Camila
 */
public class VetorClone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] vetorOriginal = new int[5];
        
        
        for (int i = 0; i < vetorOriginal.length; i++) {
            vetorOriginal[i]  = i;
            System.out.print(vetorOriginal[i] + " ");
        }
        System.out.println(" ");
        
        int[] vetorClone = vetorOriginal.clone();

        for (int i = 0; i < vetorClone.length; i++) {
            System.out.print(vetorClone[i] + " ");
        }
        System.out.println(" ");
        
    }
    
}
