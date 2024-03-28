public class Teste4 {
    public static void main(String[] args) {

        int mes = 4;

        switch (mes) {
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Março");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Segundo trimestre");
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                System.out.println("Segundo semestre");
                break;
            default:
                System.out.println("Não foi possível identificar o mês");
        }
    }
}
