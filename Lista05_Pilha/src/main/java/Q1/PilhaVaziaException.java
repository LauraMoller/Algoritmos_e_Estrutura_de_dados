package Q1;

/**
 *
 * @author Laura Möller
 */
public class PilhaVaziaException extends RuntimeException {

    public PilhaVaziaException() {
        super("Erro: a pilha está vaiza.");
    }
}
