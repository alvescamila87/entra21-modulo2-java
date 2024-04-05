import java.util.Date;

public class Mae extends Pessoa {
    private String celular;

    public Mae(){

    }

    public Mae(String nome, String endereco, Date dataNascimento, String celular) {
        super(nome, endereco, dataNascimento);
        this.celular = celular;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
}
