
package interfaces;

/**
 *
 * @author Camila
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tributavel t = new ContaInvestimento();
        
        ContaCorrente cc = new ContaCorrente();
        cc.setSaldo(100);
        
        ContaInvestimento ci = new ContaInvestimento();
        ci.setSaldo(100);
        
        ManipuladorDeTributaveis mdt = new ManipuladorDeTributaveis();
        
        Tributavel[] bensTributaveis = new Tributavel[2];
        bensTributaveis[0] = cc;
        bensTributaveis[1] = ci;
        
        mdt.calculcarImpostos(bensTributaveis);
        
        System.out.println("Total de tributos a serem pagos pelas contas R$: " + mdt.total);
    }
    
}
