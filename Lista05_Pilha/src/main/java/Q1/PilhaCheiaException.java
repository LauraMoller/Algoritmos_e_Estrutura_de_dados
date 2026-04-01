package Q1;

/**
 *
 * @author Laura Möller
 */
public class PilhaCheiaException extends RuntimeException {

    public PilhaCheiaException() {
        super("Erro: a pilha está cheia");
    }
}
