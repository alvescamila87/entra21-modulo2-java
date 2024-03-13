
package projetobanco;

/**
 *
 * @author Camila
 */
public class Projetobanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*Conta c1 = new Conta();
        Conta c2 = new Conta();
        
        c1.nomeTitular = "Camila";
        c1.numConta = 1;
        
        c2.nomeTitular = "Isabel";
        c2.numConta = 2;
        
        System.out.println(c1.nomeTitular);
        
        System.out.println(c1.getSaldo());
        
        c1.depositar(50);
        System.out.println("Após depósito: " + c1.getSaldo());
        */
        
        /* 
        if(c1.transferir(c2, 40)) {
            System.out.println("Transferência realizada");
        } else {
            System.out.println("Não realizada");
        }
        
        System.out.println("Saldo de C1: " + c1.getSaldo());
        System.out.println("Saldo de C2: " + c2.getSaldo());
        */
        
        /*c1.sacar(22);
        System.out.println("Saldo após o saque: " + c1.getSaldo());*/
        
        Conta c1 = new ContaPoupanca();
        Conta c2 = new ContaPagamentos();
        
        c1.nomeTitular = "Camila";
        c1.numConta = 1;
        
        c2.nomeTitular = "Patricia";
        c2.numConta = 2;
        
        c1.depositar(50);
        c2.depositar(50);
        
        System.out.println("Saldo c1: " + c1.getSaldo());
        System.out.println("Saldo c2: " + c2.getSaldo());
        
        c1.sacar(10);
        c2.sacar(10);
        
        System.out.println("Saldo após saque c1: " + c1.getSaldo());
        System.out.println("Saldo após saque c2: " + c2.getSaldo());
               
        
    }

    
    
}

class Conta {
    String nomeTitular;
    int numConta;
    private double saldo;
    protected double taxaSaque = 1.0;
    
    public boolean depositar(double valor) {
        this.saldo += valor;
        return true;
    }
    
    public boolean sacar(double valor) {
        if(valor + this.taxaSaque <= this.saldo) {
            // permite o saque
            this.saldo = this.saldo - valor - this.taxaSaque;
            return true;
        } else {
            //não permite o saque
            return false;
        }
    }
    
    public double getSaldo() {
        return this.saldo;
    }
    
    public boolean transferir(Conta contaDestino, double valor) {
        if(this.sacar(valor)) {
            contaDestino.depositar(valor);
            return true;
        } else {
            return false;
        }
    }
    
}

class ContaPagamentos extends Conta {   
    
    public boolean sacar(double valor) {
        
        super.taxaSaque = 2.0;
        
        return super.sacar(valor);
    }
}

class ContaPoupanca extends Conta {
    
    public boolean sacar(double valor) {
        
        super.taxaSaque = 0.50;
        
        return super.sacar(valor);
        
    }
    
}
