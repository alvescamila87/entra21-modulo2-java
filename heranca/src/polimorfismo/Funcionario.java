
package polimorfismo;

/**
 *
 * @author Camila
 */
public class Funcionario {
    
    private String nome;
    private double salario;
    
    public double getGastos(){
        return this.salario;
    }
    
    public String getInfo() {
        return "Nome: " + this.nome + " com salário de R$" + this.salario;
    }
    
    public double getSalario() {
        return this.salario;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setSalario(double valor) {
        this.salario = valor;
    }
    
}
