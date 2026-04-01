package Q1;

/**
 *
 * @author Laura Möller
 */
public class EspacoInsuficienteException extends RuntimeException {

    public EspacoInsuficienteException() {
        super("Erro: não há espaço suficiente na pilha para realizar a operação.");
    }
}
