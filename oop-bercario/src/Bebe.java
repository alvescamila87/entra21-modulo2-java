import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Bebe extends Pessoa{
    private Mae nomeDaMae;
    private Medico nomeDoMedico;
    // private ArrayList<ControleMedicamento> controleMedicamentos;
    private ArrayList<ControleMedicamento> controleMedicamentos = new ArrayList<>(); // Bebe é instanciado já tomando remédio em controle de medicação o método set mudou

    public Bebe(){
    }

    public Bebe(String nome, String endereco, Date dataNascimento, Mae nomeDaMae, Medico nomeDoMedico) {
        super(nome, endereco, dataNascimento);
        this.nomeDaMae = nomeDaMae;
        this.nomeDoMedico = nomeDoMedico;
    }

    public Mae getNomeDaMae() {
        return nomeDaMae;
    }

    public void setNomeDaMae(Mae nomeDaMae) {
        this.nomeDaMae = nomeDaMae;
    }

    public Medico getNomeDoMedico() {
        return nomeDoMedico;
    }

    public void setNomeDoMedico(Medico nomeDoMedico) {
        this.nomeDoMedico = nomeDoMedico;
    }

    public ArrayList<ControleMedicamento> getControleMedicamentos() {
        return controleMedicamentos;
    }

    // gera 2º array, não é necessário devido ao array já iniciado por padrão na classe

    /*
    public void setControleMedicamentos(ArrayList<ControleMedicamento> controleMedicamentos) {
        this.controleMedicamentos = controleMedicamentos;
    }
     */

    // incluir os controles de medicamento dentro da lista já criada pela própria classe
    public void setControleMedicamentos(ControleMedicamento controleMedicamentos) {
        this.controleMedicamentos.add(controleMedicamentos);
    }

    public String exibirInformacoes(){
        return String.format("%s\nMãe: %s Contato da mãe: %s\nMédico: %s",
                super.toString(), nomeDaMae.getNome(), nomeDaMae.getCelular(), nomeDoMedico.getNome());
    }

    public String relatorioMedicamentos(){
        String text = "";
        for (ControleMedicamento controle : controleMedicamentos) {
            text += controle.toString();
        }
        return text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bebe bebe = (Bebe) o;
        return Objects.equals(nomeDaMae, bebe.nomeDaMae)
                && Objects.equals(nomeDoMedico, bebe.nomeDoMedico)
                && Objects.equals(controleMedicamentos, bebe.controleMedicamentos)
                && (this.hashCode() == o.hashCode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeDaMae, nomeDoMedico);
    }
}
