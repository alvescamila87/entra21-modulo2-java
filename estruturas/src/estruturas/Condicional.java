
package estruturas;

/**
 *
 * @author Camila
 */
public class Condicional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int option = 3, option1 = 1;
        
        switch(option) {
            case 1:
                System.out.println("Número 1");
                switch(option1) {
                    case 1: 
                        System.out.println("Sub-menu 1");
                        break;
                    case 2:
                        System.out.println("Sub-menu 2");
                        break;
                    default: System.out.println("Opção inválida");
                }
                break;
            case 2:
                System.out.println("Número 2");
                break;
            case 3:
                System.out.println("Número 3");
                break;
            default: System.out.println("Opção inválida");
                
        }
    }
    
}
