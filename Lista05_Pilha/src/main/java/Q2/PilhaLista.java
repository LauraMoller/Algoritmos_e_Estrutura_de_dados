package Q2;

/**
 *
 * @author Laura Möller
 */
public class PilhaLista<T> implements Pilha<T> {

    private ListaEncadeada<T> lista;

    public PilhaLista() {
        lista = new ListaEncadeada();
    }

    @Override
    public void push(T info) {
        lista.inserir(info);
    }

    @Override
    public T pop() {
        if (lista.getPrimeiro() == null) {
            throw new PilhaVaziaException();
        }
        T aux = peek();
        lista.retirar(aux);
        return aux;
    }

    @Override
    public T peek() {
        if(estaVazia()){
            return null;
        }
        return lista.getPrimeiro().getInfo();
    }

    @Override
    public boolean estaVazia() {
        return lista.getPrimeiro() == null;
    }

    @Override
    public void liberar() {
        lista.liberar();
    }

}
