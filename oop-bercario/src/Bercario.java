public class Bercario {
    public static void main(String[] args) {

        Medicamento medicamento = new Medicamento("Antibiótico XPTO", "ml", 15);

        Medicamento medicamento02 = new Medicamento(); // construtor vazio

        System.out.println(medicamento.getDescricao());
        System.out.println(medicamento02.getUnidadeMedida());
    }
}
