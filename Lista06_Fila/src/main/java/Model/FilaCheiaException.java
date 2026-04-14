package Model;

/**
 * Classe de exceção para quando a fila estivver cheia para realizar uma
 * determinada operação.
 *
 * @author Laura Möller
 */
public class FilaCheiaException extends RuntimeException {

    /**
     * Cria uma mensagem de erro padrão.
     */
    public FilaCheiaException() {
        super("Erro: a fila está cheia.");
    }
}
