
package devjavat1;

/**
 *
 * @author Camila
 */
public class Livro {
    
    // Atributos (características do objeto)
    String titulo;
    String autor;
    String editora;
    double valor;
    int quantidade;    
    
    // Métodos (ações | funcionalidades que um objeto pode realizar)
    public void exibirInfo() {
        System.out.printf("Título: %s\n" 
                + "Autor: %s\n" 
                + "Editora: %s\n" 
                + "Valor: R$ %.2f\n" 
                + "Quantidade: %d\n", titulo, autor, editora, valor, quantidade);
    }
    
}
