
package heranca;

/**
 *
 * @author Camila
 */
public class ContaCorrente extends Conta {
    
    private double limite;
    
    public double getLimite() {
        return this.limite;
    }
    
    public void setLimite(double valor) {
        this.limite = valor;
    }
    
    public double getSaldoComLimite() {
        return this.saldo + this.limite;
    }
    
    @Override
    double getSaldo(){
        return this.getSaldoComLimite();
    } 
    
}
