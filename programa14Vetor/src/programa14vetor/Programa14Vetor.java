package programa14vetor;

/**
 *
 * @author Camila
 */
public class Programa14Vetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //1º forma:
        int[] vetor;
        vetor = new int[3];
        
        //2º forma:
        int[] vetorInteiros = {0, 1, 2};
        
        vetorInteiros[0] = 5;
        vetorInteiros[2] = 0;
                
        for (int i = 0; i < vetorInteiros.length; i++) {
            System.out.println(vetorInteiros[i]);
        }
        
        
    }
    
}
