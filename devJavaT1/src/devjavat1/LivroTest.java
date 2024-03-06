
package devjavat1;

/**
 *
 * @author Camila
 */
public class LivroTest {
    
    public static void main(String[] args) {
        
        Livro livro1 = new Livro();
        livro1.autor = "J. R. R. Tolkien";
        livro1.editora = "Harper Collins";
        livro1.titulo = "Senhor dos Anéis - As duas torres";
        livro1.quantidade = 10;
        livro1.valor = 113.90;
        
        livro1.exibirInfo();
    }
    
}
