package Model;

/**
 * Classe que representa um nó genérico da lista.
 *
 * @author Laura Möller
 */
public class NoLista<T> {

    /**
     * Variável de instância que armazena o próximo nó.
     */
    private NoLista<T> proximo;
    /**
     * Variável de instância que armazena dado armazenado no nó.
     */
    private T info;

    /**
     * Construtor da classe que determina que o Nó possui um próximo e um dado.
     *
     * @param proximo próximo ao nó.
     * @param info dado do nó.
     * @throws IllegalArgumentException validações dos setters usados.
     */
    public NoLista(NoLista<T> proximo, T info) throws IllegalArgumentException {
        setProximo(proximo);
        setInfo(info);
    }

    /**
     * Método que acessa a variável de instância que contém o dado do nó.
     *
     * @return dado.
     */
    public T getInfo() {
        return info;
    }

    /**
     * Método que acessa a variável de instância que armazena o dado do nó.
     *
     * @param info dado a ser armazenado.
     * @throws IllegalArgumentException caso a informação seja inválida/vazia.
     */
    public void setInfo(T info) throws IllegalArgumentException {
        if (info == null) {
            throw new IllegalArgumentException("Erro: o valor informado é inválido.");
        }
        this.info = info;
    }

    /**
     * Método que acessa a variável de instância que armazena o próximo nó da
     * lista
     *
     * @return próximo da lista.
     */
    public NoLista getProximo() {
        return proximo;
    }

    /**
     * Método que acessa a variável de instância que armazena o próximo nó da
     * lista.
     *
     * @param proximo o próximo a ser inserido.
     */
    public void setProximo(NoLista<T> proximo) {
        this.proximo = proximo;
    }
}
