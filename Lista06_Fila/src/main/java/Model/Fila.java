package Model;

/**
 * Interface que define o contrato para uma estrutura de dados do tipo Fila (FIFO - First In, First Out).
 * Os elementos são inseridos no fim e removidos do início.
 * @author Laura Möller
 * @param <T> O tipo de elemento armazenado na fila.
 */
public interface Fila<T> {

    /**
     * Insere um novo elemento no final da fila.
     * @param valor valor O elemento a ser adicionado.
     */
    public void inserir(T valor);

    /**
     * Verifica se a fila está vazia.
     * @return true se a fila não contiver elementos, false caso contrário.
     */
    public boolean estaVazia();

    /**
     * Retorna o elemento que está na frente da fila sem removê-lo.
     * @return O elemento no início da fila, ou null se a fila estiver vazia.
     */
    public T peek();

    /**
     * Remove e retorna o elemento que está no início da fila.
     * @return O elemento removido do início da fila.
     */
    public T retirar();

    /**
     * Remove todos os elementos da fila, deixando-a limpa para reutilização.
     */
    public void liberar();
}
