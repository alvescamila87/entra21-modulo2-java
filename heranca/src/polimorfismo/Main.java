
package polimorfismo;

/**
 *
 * @author Camila
 */
public class Main {
    
    public static void main(String[] args) {
        
        GeradorRelatorio relatorio = new GeradorRelatorio();        
              
        Funcionario f = new Funcionario();
        
        f.setNome("Camila");
        f.setSalario(1_000);  
        
        relatorio.adiciona(f);
        
        Professor p = new Professor();
        
        p.setNome("Antonio");
        p.setSalario(2_000);        
        
        relatorio.adiciona(p);
        
        Reitor r = new Reitor();
        
        r.setNome("Maria");
        r.setSalario(3000);
        
        relatorio.adiciona(r);
        
        
    }
    
}
