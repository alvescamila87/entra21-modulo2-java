
package conta;

/**
 *
 * @author Camila
 */
public class Main {
    
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        
        conta1.nomeTitular = "Camila";
        conta1.saldo = 100.0;
        
        System.out.println("O cliente " + conta1.nomeTitular + " possui R$" + conta1.saldo + " de saldo na conta.");
        
        conta1.sacar(50);
        
        System.out.println("Saldo: " + conta1.getSaldo());
        
        conta1.depositar(75);
        System.out.println("Saldo: " + conta1.getSaldo());
        
        Conta conta2 = new Conta();
        conta2.saldo = 0.0;
        
        conta1.transferir(conta2, 80);
        System.out.println("Saldo conta1: " + conta1.getSaldo());
        System.out.println("Saldo conta2: " + conta2.getSaldo());
    }
    
}
