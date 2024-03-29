public class Medicamento {

    private String descricao;
    private String unidadeMedida = "ml";
    private Integer quantidadeEmEstoque;

    // Construtor

    Medicamento(){
    }
    Medicamento(String descricao, String unidadeMedida, Integer quantidadeEmEstoque) {
        this.descricao = descricao;
        this.unidadeMedida = unidadeMedida;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    // Métodos de acesso: Encapsulamento
    // Getters

    public String getDescricao(){
        return descricao;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    public Integer getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    // Setters
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public void setUnidadeMedida(String unidadeMedida){
        this.unidadeMedida = unidadeMedida;
    }

    public void setQuantidadeEmEstoque(Integer quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
}
