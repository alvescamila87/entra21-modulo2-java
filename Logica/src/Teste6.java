public class Teste6 {
    public static void main(String[] args) {

        String nome = "Maria";
        String sobrenome = "";
        int idade = 15;

        if(nome.isEmpty() || nome.isBlank()) {
            System.out.println("Favor informar um nome.");
        }
        if(sobrenome.isEmpty() || sobrenome.isBlank()) {
            System.out.println("Favor informar um sobrenome.");
        }
        if(!(idade>0)) {
            System.out.println("Favor informar uma idade.");
        }

        // precedencia
        int resultado1 = 3 + 4 * 2;
        System.out.println(resultado1);

        double resultado2 = 1 + 4 / 2;
        System.out.println(resultado2);
    }
}
