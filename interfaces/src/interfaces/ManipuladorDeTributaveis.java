
package interfaces;

/**
 *
 * @author Camila
 */
public class ManipuladorDeTributaveis {
    
    double total;
    
    void calculcarImpostos(Tributavel[] bens){
        for (Tributavel bem : bens) {
            this.total += bem.getValorImposto();
        }
    }
    
}
