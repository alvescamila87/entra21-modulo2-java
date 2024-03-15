
package polimorfismo;

/**
 *
 * @author Camila
 */
public class Professor extends Funcionario {
    
    private int horasAula;
    
    @Override
    public double getGastos(){
        return this.getSalario() + this.horasAula * 10;
    }
    
    public int getHorasAula(){
        return this.horasAula;
    }
    
    public void setHorasAula(int horasAula) {
        this.horasAula = horasAula;
    }
    
    @Override
    public String getInfo(){
        String infoBasica = super.getInfo();
        String informacao = infoBasica + " horas de aula: " + this.horasAula;
        return informacao;
    }
    
}
