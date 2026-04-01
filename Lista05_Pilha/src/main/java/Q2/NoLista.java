package Q2;

/**
 * 
 *
 * @author Laura Möller
 */
public class NoLista<T> {

    private NoLista<T> proximo;
    
    private T info;

    public NoLista(NoLista<T> proximo, T info) throws IllegalArgumentException {
        setProximo(proximo);
        setInfo(info);
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) throws IllegalArgumentException {
        if (info == null) {
            throw new IllegalArgumentException("Erro: o valor informado é inválido.");
        }
        this.info = info;
    }
    
    public NoLista<T> getProximo() {
        return proximo;
    }

    public void setProximo(NoLista<T> proximo) {
        this.proximo = proximo;
    }
}
