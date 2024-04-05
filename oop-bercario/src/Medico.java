import java.util.Date;

public class Medico extends Pessoa {
    private String crm;
    private String celular;

    public Medico() {
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Medico(String nome, String endereco, Date dataNascimento, String crm, String celular) {
        super(nome, endereco, dataNascimento);
        this.crm = crm;
        this.celular = celular;


    }
}
