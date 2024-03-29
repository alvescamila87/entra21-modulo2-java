
package interfaces;

/**
 *
 * @author Camila
 */
public class Conta {

    String nomeTitular;
    private double saldo;
    
    double getSaldo() {
        return this.saldo;
    }
    
    void setSaldo(double valor) {
        this.saldo = valor;
    }
    
    boolean sacar(double valor){
        if(this.saldo < valor) {
            System.out.println("Saldo insuficiente!");
            return false;
        }
        this.saldo -= valor;
        return true;
    } 
        
    boolean depositar(double valor){
        // atividade 1
        this.saldo += valor;
        return true;
    }
    
    boolean transferir(Conta contaDestino, double valor) {
        // atividade 2
        if(this.sacar(valor)) {
            contaDestino.depositar(valor);
            return true;
        } else {
            return false;
        }
    }
}
