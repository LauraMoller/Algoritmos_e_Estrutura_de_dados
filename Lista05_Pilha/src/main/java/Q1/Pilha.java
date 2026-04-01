package Q1;

/**
 *
 * @author Laura Möller
 */
public interface Pilha<T> {

    public void push(T info);

    public T pop();

    public T peek();

    public boolean estaVazia();

    public void liberar();
}
