import javax.sound.midi.Soundbank;
import java.util.Date;

public class Bercario {
    public static void main(String[] args) {

        Medicamento medicamento = new Medicamento("Antibiótico XPTO", "ml", 15);

        Medicamento medicamento02 = new Medicamento(); // construtor vazio

        //System.out.println(medicamento.getDescricao());
        //System.out.println(medicamento02.getUnidadeMedida());
        //System.out.println(medicamento02.toString()); // exibe o endereço de referência

        Mae mae01 = new Mae();
        mae01.setNome("Maria de Souza");
        mae01.setCelular("47-99999-4444");

        Medico medico01 = new Medico();
        medico01.setNome("Dr. Paulo Alves");

        Bebe bebe01 = new Bebe("João Souza", "Av. Movimentada, n 100", new Date(), mae01, medico01);
        Bebe bebe02 = new Bebe();

        System.out.println(bebe01.equals(bebe02));
        System.out.println(bebe02.hashCode() + " | " + bebe01.hashCode());
        //System.out.println(bebe01.exibirInformacoes());
    }
}
