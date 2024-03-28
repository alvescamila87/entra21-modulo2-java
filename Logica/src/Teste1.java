public class Teste1 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if(i % 2 == 0) {
                continue; // ao continuar, executa o próximo loop do for e não imprime o i;
            }
            System.out.println(i);
        }
    }
}
