import java.util.Date;

public class ControleMedicamento {
    private Date dataHora;
    private Medicamento medicamento;
    private Bebe nomeDoBebe;

    public ControleMedicamento(){

    }
    public ControleMedicamento(Date dataHora, Medicamento medicamento, Bebe nomeDoBebe) {
        this.dataHora = dataHora;
        this.medicamento = medicamento;
        this.nomeDoBebe = nomeDoBebe;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    public Bebe getNomeDoBebe() {
        return nomeDoBebe;
    }

    public void setNomeDoBebe(Bebe nomeDoBebe) {
        this.nomeDoBebe = nomeDoBebe;
    }

    @Override
    public String toString() {
        return String.format(
                "Data Hora: %s\n" +
                "Medicamento: %s " +
                "Unidade de medida: %s\n",
                dataHora, medicamento.getDescricao(), medicamento.getUnidadeMedida());
    }
}
