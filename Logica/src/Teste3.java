public class Teste3 {
    public static void main(String[] args) {

        String nomeCompleto = "Alex Teixeira";
        int qtd = nomeCompleto.substring(nomeCompleto.lastIndexOf(" ") + 1).length();

        System.out.println(qtd);
    }
}
