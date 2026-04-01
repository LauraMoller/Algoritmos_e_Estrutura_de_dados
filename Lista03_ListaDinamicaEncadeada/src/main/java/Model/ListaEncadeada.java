package Model;

/**
 * Classe que representa a lista encadeada.
 *
 * @author Laura Möller
 */
public class ListaEncadeada<T> {

    /**
     * Variável de instância que armazena a referência ao primeiro nó da lista.
     */
    private NoLista<T> primeiro;

    /**
     * Construtor da classe que define a lista incialmente como vazia.
     */
    public ListaEncadeada() {
        this.primeiro = null;
    }

    /**
     * Método que insere um dado (nó) na lista.
     *
     * @param valor valor a ser armazenado.
     */
    public void inserir(T valor) {
        NoLista<T> novo = new NoLista<>(primeiro, valor);
        setPrimeiro(novo);
    }

    /**
     * Método que define o primeiro nó da lista.
     *
     * @param primeiro nó a ser definido como primeiro.
     */
    public void setPrimeiro(NoLista<T> primeiro) {
        this.primeiro = primeiro;
    }

    /**
     * Método que verifica se a lista está vazia.
     *
     * @return verdadeiro se a lista estiver vazia, false se houver ao menos um
     * nó.
     */
    public boolean estaVazia() {
        return primeiro == null;
    }

    /**
     * Método que busca um valor na lista.
     *
     * @param valor valor procurado.
     * @return nó que contém o valor.
     */
    public NoLista<T> buscar(T valor) {
        NoLista<T> no = primeiro;
        while (no != null) {
            if (no.getInfo().equals(valor)) {
                return no;
            }
            no = no.getProximo();
        }
        return null;
    }

    /**
     * Método que retira um valor da lista.
     *
     * @param valor valor a ser retirado.
     */
    public void retirar(T valor) {
        NoLista<T> noAtual = primeiro;
        NoLista<T> noAnterior = null;
        while (noAtual != null && !noAtual.getInfo().equals(valor)) {
            noAnterior = noAtual;
            noAtual = noAtual.getProximo();
        }
        if (noAtual != null) {
            if (noAnterior == null) {
                this.primeiro = noAtual.getProximo();
            } else {
                noAnterior.setProximo(noAtual.getProximo());
            }
        }
    }

    /**
     * Método que acessa a variável de instância que contém o primeiro nó.
     *
     * @return primeiro nó.
     */
    public NoLista<T> getPrimeiro() {
        return primeiro;
    }

    /**
     * Método que retorna o comprimento (tamanho) da lista.
     *
     * @return quantidade de itens na lista.
     */
    public int obterComprimento() {
        int i = 0;
        NoLista<T> noAtual = primeiro;
        while (noAtual != null) {
            i++;
            noAtual = noAtual.getProximo();
        }
        return i;
    }

    /**
     * Método que obtém um nó com base em um indíce de posição.
     *
     * @param idx posição do nó.
     * @return nó da posição.
     * @throws IndexOutOfBoundsException caso o indíce informado seja negativo
     * ou maior do que a quantidade de itens na lista.
     */
    public NoLista<T> obterNo(int idx) throws IndexOutOfBoundsException {
        int comprimento = obterComprimento() - 1;
        if (idx < 0 || idx > comprimento) {
            throw new IndexOutOfBoundsException("Erro: indíce inválido.");
        }
        int i = 0;
        NoLista<T> noAtual = primeiro;
        while (i != idx) {
            noAtual = noAtual.getProximo();
            i++;
        }
        return noAtual;
    }

    /**
     * Método que lista os valores da lista.
     *
     * @return lista de valroes.
     */
    public String toString() {
        if (estaVazia()) {
            return "A lista está vazia.";
        }
        NoLista<T> noAtual = primeiro;
        String valores = "";
        while (noAtual != null) {
            valores += noAtual.getInfo();
            if (noAtual.getProximo() != null) {
                valores += ", ";
            } else {
                valores += ".";
            }
            noAtual = noAtual.getProximo();
        }
        return valores;
    }
}
