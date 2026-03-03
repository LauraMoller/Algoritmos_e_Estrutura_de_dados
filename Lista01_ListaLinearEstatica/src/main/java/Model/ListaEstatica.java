package Model;

/**
 * Classe que representa uma Lista Linear Estática.
 *
 * @author Laura Möller
 */
public class ListaEstatica {

    /**
     * Variável de instância que armazena a estrutura da lista (vetor).
     */
    private int[] info;
    /**
     * Variável de instância que faz o controle da quantidade de itens na lista.
     */
    private int tamanho;

    /**
     * Construtor da classe que inicializa as variáveis de instância.
     */
    public ListaEstatica() {
        liberar();
    }

    /**
     * Método que realiza um pseudo redimensionamento do vetor quando chamado.
     */
    private void redimensionar() {
        int[] novo = new int[info.length + 10];
        for (int i = 0; i < tamanho; i++) {
            novo[i] = info[i];
        }
        info = novo;
    }

    /**
     * Método que insere um valor ao fim da estrutura.
     *
     * @param valor valor a ser inserido
     */
    public void inserir(int valor) {
        if (info.length == tamanho) {
            redimensionar();
        }
        info[tamanho] = valor;
        tamanho++;
    }

    /**
     * Método que exibe os valores da lista ou "Lista vazia".
     *
     * @return valores.
     */
    public String exibir() {
        if (tamanho == 0) {
            return "Lista vazia";
        }
        String lista = "";
        for (int i = 0; i < tamanho; i++) {
            lista += info[i] + "/n";
        }
        return lista;
    }

    /**
     * Método que busca um valor nos dados da lista.
     *
     * @param valor valor buscado.
     * @return índice que está armazenando o valor, -1 caso não esteja presente
     * ou -2 caso a lista esteja vazia.
     */
    public int buscar(int valor) {
        if (tamanho == 0) {
            return -2;
        }
        for (int i = 0; i < tamanho; i++) {
            if (info[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Método que retira um valor da lista.
     *
     * @param valor valor a ser retirado.
     * @throws IllegalArgumentException caso o valor não esteja na lista ou a
     * lista esteja vazia.
     */
    public void retirar(int valor) throws IllegalArgumentException {
        int idx = buscar(valor);
        if (idx == -1) {
            throw new IllegalArgumentException("Erro: valor não está presente na lista, logo não é possível removê-lo.");
        }
        if (estaVazia()) {
            throw new IllegalArgumentException("Erro: a lista está vazia.");
        }

        info[idx] = 0;

        for (int i = idx; i < tamanho - 1; i++) {
            info[i] = info[i + 1];
        }
        info[tamanho] = 0;
        tamanho--;
    }

    /**
     * Método que limpa a lista.
     */
    public void liberar() {
        info = new int[10];
        tamanho = 0;
    }

    /**
     * Método que obtém o elemento a partir de um índice.
     *
     * @param idx índice do elemento.
     * @return valor armazenado na posição.
     * @throws IndexOutOfBoundsException caso a lista esteja vazia ou o indíce
     * informado não esteja ocupado.
     */
    public int obterElemento(int idx) throws IndexOutOfBoundsException {
        if (estaVazia()) {
            throw new IndexOutOfBoundsException("Erro: não é possível buscar, pois a lista está vazia.");
        }

        if (tamanho <= idx) {
            throw new IndexOutOfBoundsException("Erro: não é possível buscar, pois o indíce não está ocupado.");
        }
        return info[idx];
    }

    /**
     * Método que verifica se a lista está vazia.
     *
     * @return true se estiver vazia ou false se não estiver.
     */
    public boolean estaVazia() {
        return tamanho == 0;
    }

    /**
     * Método que obtém a quantidade de itens da lista.
     *
     * @return quantidade de itens na lista.
     */
    public int getTamanho() {
        return tamanho;
    }

    /**
     * Método que transforma os valores constidos na lista em uma string.
     *
     * @return valores armazenados na estrutura.
     */
    public String toString() {
        if (estaVazia()) {
            return "Lista vazia.";
        }
        String valores = "";
        for (int i = 0; i < tamanho; i++) {
            if (i < tamanho - 1) {
                valores += info[i] + ", ";
            } else {
                valores += info[i] + ".";
            }
        }
        return valores;
    }

}
