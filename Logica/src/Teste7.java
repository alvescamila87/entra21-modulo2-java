import javax.swing.*;
import java.util.ArrayList;

public class Teste7 {
    public static void main(String[] args) {

        ArrayList<Integer> inteiros = new ArrayList<>();

        do {
            int cont = 1;
            inteiros.add(cont++);
        } while (inteiros.size() < 5);

        System.out.println(inteiros);
    }
}
