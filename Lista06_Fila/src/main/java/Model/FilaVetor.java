package Model;

/**
 * Classe que representa a fila.
 *
 * @author Laura Möller
 */
public class FilaVetor<T> implements Fila<T> {

    /**
     * Variável de instância que armazena os itens da fila.
     */
    public Object[] info;
    /**
     * Variável de instância que armazena o limite da fila, ou seja, a
     * quantidade máxima de itens.
     */
    public int limite;
    /**
     * Variável de instância que armazena o tamanho atual da fila.
     */
    public int tamanho;
    /**
     * Variável de instância que armazena em qual posição a fila se inicia.
     */
    public int inicio;

    /**
     * Construtor que define que a fila começa vazia.
     *
     * @param limite limite definido para a fila.
     */
    public FilaVetor(int limite) {
        this.limite = limite;
        info = new Object[limite];
        inicio = 0;
        tamanho = 0;
    }

    /**
     * Método que insere um item ao fim da fila.
     *
     * @param valor valor a ser armazenado.
     * @throws FilaCheiaException caso não haja espaço para armazenar o valor na
     * fila.
     */
    @Override
    public void inserir(T valor) throws FilaCheiaException {
        if (tamanho == limite) {
            throw new FilaCheiaException();
        }
        int posicaoInsercao = (inicio + tamanho) % limite;

        info[posicaoInsercao] = valor;
        this.tamanho++;
    }

    /**
     * Método que verifica se a fila está vazia.
     *
     * @return true se a fila estiver vazia, false caso contrário.
     */
    @Override
    public boolean estaVazia() {
        return this.tamanho == 0;
    }

    /**
     * Método que verifica o primeiro da fila.
     *
     * @return primeiro da fila.
     * @throws FilaVaziaException caso a fila esteja vazia.
     */
    @Override
    public T peek() throws FilaVaziaException {
        if (this.tamanho == 0) {
            throw new FilaVaziaException();
        }
        return (T) info[inicio];
    }

    /**
     * Método que retira um item do início da fila.
     *
     * @return item retirado.
     * @throws FilaVaziaException caso a fila esteja vazia.
     */
    @Override
    public T retirar() throws FilaVaziaException {
        if (this.tamanho == 0) {
            throw new FilaVaziaException();
        }
        T valor = (T) info[inicio];
        info[inicio] = null;
        this.inicio = (this.inicio + 1) % limite;
        this.tamanho--;
        if (this.tamanho == 0) {
            this.inicio = 0;
        }
        return valor;
    }

    /**
     * Método que limpa a fila.
     */
    @Override
    public void liberar() {
        if (tamanho == 0) {
            return;
        }
        for (int i = 0; i < limite; i++) {
            info[i] = null;
            tamanho--;
            if (tamanho == 0) {
                break;
            }
        }
    }

    /**
     * Método que concatena a fila com outra fila.
     *
     * @param f2 fila secundária que participará da concatenação.
     * @return uma terceira fila concatenada.
     */
    public FilaVetor<T> criarFilaConcatenada(FilaVetor<T> f2) {
        int tamConjunto = this.tamanho + f2.tamanho;
        FilaVetor<T> f3 = new FilaVetor(this.limite + f2.getLimite());
        int aux1 = this.inicio;
        for (int i = 0; i < this.tamanho; i++) {
            f3.inserir((T) this.info[aux1]);
            aux1 = (aux1 + 1) % this.limite;
        }
        int aux2 = f2.inicio;
        for (int i = 0; i < f2.tamanho; i++) {
            f3.inserir((T) f2.info[aux2]);
            aux2 = (aux2 + 1) % f2.limite; // IMPORTANTE: usar o limite da f2 aqui
        }
        return f3;
    }

    /**
     * Método que converte a fila para texto.
     *
     * @return texto com todos os itens da fila.
     */
    public String toString() {
        if (estaVazia()) {
            return "";
        }
        String fila = "";
        int aux = inicio;
        for (int i = 0; i < this.tamanho; i++) {
            fila += (T) info[aux];
            aux = (aux + 1) % this.limite;
            if (i < tamanho - 1) {
                fila += ", ";
            } else {
                fila += ".";
            }
        }
        return fila;
    }

    /**
     * Método que acessa o limite da fila.
     *
     * @return limite da fila.
     */
    public int getLimite() {
        return limite;
    }

}
