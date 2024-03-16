
package interfaces;

/**
 *
 * @author Camila
 */
public class ContaCorrente extends Conta implements Tributavel {
    
    private double limite;
    
    public double getLimite() {
        return this.limite;
    }
    
    public void setLimite(double valor) {
        this.limite = valor;
    }
    
    /*
    public double getSaldoComLimite() {
        return this.getSaldo() + this.limite;
    }
    */
    
    @Override
    double getSaldo(){
        return this.limite + super.getSaldo();
    }
    
    public double getValorImposto(){
        return super.getSaldo() * 0.01;
    }
    
}
