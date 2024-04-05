import java.util.Date;

public abstract class Pessoa {

    private String nome;
    private String endereco;
    private Date dataNascimento;

    public Pessoa(){
        //super(); //object
    }

    public Pessoa(String nome, String endereco, Date dataNascimento) {
        this.nome = nome;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return String.format("Nome completo: %s\nEndereço: %s\nData de Nascimento: %s" , nome, endereco, dataNascimento);
    }
}
