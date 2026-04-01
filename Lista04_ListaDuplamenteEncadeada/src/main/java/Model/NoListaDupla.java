package Model;

/**
 *
 * @author Laura Möller
 */
public class NoListaDupla<T> {

    private T info;
    private NoListaDupla<T> proximo;
    private NoListaDupla<T> anterior;

    public NoListaDupla(T info) {
        setInfo(info);
    }

    public NoListaDupla(T info, NoListaDupla<T> proximo, NoListaDupla<T> anterior) {
        setInfo(info);
        setProximo(proximo);
        setAnterior(anterior);
    }

    public NoListaDupla(T info, NoListaDupla<T> proximo) {
        setInfo(info);
        setProximo(proximo);
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public T getInfo() {
        return info;
    }

    public void setProximo(NoListaDupla<T> proximo) throws IllegalArgumentException {
        this.proximo = proximo;
    }

    public NoListaDupla<T> getProximo() {
        return proximo;
    }

    public void setAnterior(NoListaDupla<T> anterior) throws IllegalArgumentException {
        this.anterior = anterior;
    }

    public NoListaDupla<T> getAnterior() {
        return anterior;
    }

}
