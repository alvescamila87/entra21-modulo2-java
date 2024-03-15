
package heranca;

/**
 *
 * @author Camila
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();
        
        cc.nomeTitular = "Camila";
        cp.nomeTitular = "Isabel";
        
        cc.setLimite(100);
        
        cc.saldo = 1_000;
        cp.saldo = 2_000;
        
        System.out.println(cc.getSaldo());
        System.out.println(cc.getLimite());
        System.out.println(cc.getSaldoComLimite());
        
        System.out.println(cp.getSaldo());
        
        Conta conta = cc;
        conta.sacar(15);
        System.out.println(conta.getSaldo());
        System.out.println(cc.getSaldo());
    }
    
}
