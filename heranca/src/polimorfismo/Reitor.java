
package polimorfismo;

/**
 *
 * @author Camila
 */
public class Reitor extends Funcionario {
    
    private int horasCoordenacao;
    
    public int getHorasCoordenacao(){
        return this.horasCoordenacao;
    }
    
    public void setHorasCoordenacao(int horas) {
        this.horasCoordenacao = horas;
    }
    
    @Override
    public double getGastos(){
        return this.getSalario() + this.horasCoordenacao * 50;
    }
    
    @Override
    public String getInfo(){
        String infoBasico = super.getInfo();
        String informacao = infoBasico + " horas de coordenacao " + this.horasCoordenacao;
        return informacao;
    }
}
