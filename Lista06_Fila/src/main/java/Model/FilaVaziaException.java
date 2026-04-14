package Model;

/**
 * Classe de exceção para quando a fila não possuir elementos para realizar uma
 * determinada operação.
 *
 * @author Laura Möller
 */
public class FilaVaziaException extends RuntimeException {

    /**
     * Cria uma mensagem de erro padrão.
     */
    public FilaVaziaException() {
        super("Erro: a fila está vazia.");
    }
}
