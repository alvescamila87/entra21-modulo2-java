
package classes;

/**
 *
 * @author Camila
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Carro uno = new Carro();
        uno.cor = "preto";
        uno.qtdPortas = 2;
        
        uno.acelerar();
        
        uno.frear();
        
        Carro fusca = new Carro();
        
        fusca.cor = "branco";
        fusca.qtdPortas = 2;
    }
    
}
