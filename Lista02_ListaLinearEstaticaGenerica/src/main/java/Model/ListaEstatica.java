package Model;

/**
 * Classe que representa uma lista estática de tipo genérico.
 *
 * @author Laura Möller
 */
public class ListaEstatica<T> {

    /**
     * Variável de instância que armazena os dados da lista.
     */
    private Object[] info;
    /**
     * Variável de instância que armazena a quantidade de itens na lista.
     */
    private int tamanho;

    /**
     * Construtor da classe que inícia a lista com dez posições e zero itens na
     * lista.
     */
    public ListaEstatica() {
        liberar();
    }

    /**
     * Método auxiliar que realiza um pseudo redimensionamento na lista,
     * adicionando 10 posições.
     */
    private void redimensionar() {
        Object[] novo = new Object[tamanho + 10];
        for (int i = 0; i < tamanho; i++) {
            novo[i] = info[i];
        }
        info = novo;
    }

    /**
     * Método que adicionar um item à lista.
     *
     * @param valor valor a ser adicionado.
     */
    public void inserir(T valor) {
        if (tamanho == info.length) {
            redimensionar();
        }
        info[tamanho] = valor;
        tamanho++;
    }

    /**
     * Método que exibe todo os itens da lista ou "A lista está vazia.".
     *
     * @return valores.
     */
    public String exibir() {
        if (estaVazia()) {
            return "A lista está vazia.";
        }
        String valores = "";
        for (int i = 0; i < tamanho; i++) {
            valores += info[i] + "\n";
        }
        return valores;
    }

    /**
     * Método que transforma em string os valores da lista, separados por
     * vírgula.
     *
     * @return valores.
     */
    public String toString() {
        if (estaVazia()) {
            return "A lista está vazia.";
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

    /**
     * Método que verifica se um valor está na lista.
     *
     * @param valor valor procurado.
     * @return Caso esteja presente retorna a posição dele. Se a lista estiver
     * vazia será retornado -2 e se o valor não estiver presente será retornado
     * -1.
     */
    public int buscar(T valor) {
        if (estaVazia()) {
            return -2;
        }
        for (int i = 0; i < tamanho; i++) {
            if (info[i].equals(valor)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Método que retira um item da lista.
     *
     * @param valor valor a ser retirado.
     * @throws IllegalArgumentException caso o valor não esteja presente na
     * lista.
     * @throws IndexOutOfBoundsException caso a lista esteja vazia.
     */
    public void retirar(T valor) throws IndexOutOfBoundsException, IllegalArgumentException {
        if (estaVazia()) {
            throw new IndexOutOfBoundsException("Erro: a lista está vaiza.");
        }
        int busca = buscar(valor);
        if (busca == -1) {
            throw new IllegalArgumentException("Erro: o valor não está presente na lista.");
        }

        for (int i = busca; i < tamanho - 1; i++) {
            info[i] = info[i + 1];
        }

        tamanho--;
    }

    /**
     * Método que limpa a lista/inicializa.
     */
    public void liberar() {
        info = new Object[10];
        tamanho = 0;
    }

    /**
     * Método que obtém um elemento com base no indíce.
     *
     * @param idx indíce do item procurado.
     * @return o valor armazenado na posição.
     * @throws IndexOutOfBoundsException caso a lista esteja vazia ou o indíce
     * não esteja ocupado.
     */
    public T obterElemento(int idx) throws IndexOutOfBoundsException {
        if (estaVazia()) {
            throw new IndexOutOfBoundsException("Erro: não é possível buscar, pois a lista está vazia.");
        }

        if (tamanho <= idx) {
            throw new IndexOutOfBoundsException("Erro: não é possível buscar, pois o indíce não está ocupado.");
        }
        return (T) info[idx];
    }

    /**
     * Método para verificar se a lista está vazia.
     *
     * @return true se estiver vazia, false se não estiver.
     */
    public boolean estaVazia() {
        return tamanho == 0;
    }

    /**
     * Método que obtém a quantidade de itens armazenados na lista.
     *
     * @return quantidade de itens.
     */
    public int getTamanho() {
        return tamanho;
    }

    /**
     * Método que inverte a ordem dos elementos inseridos na lista.
     */
    public void inverter() {
        if (estaVazia()) {
            throw new IndexOutOfBoundsException("Erro: a lista está vaiza.");
        }
        for (int i = 0; i < tamanho / 2; i++) {
            T aux = (T) info[i];
            info[i] = info[tamanho - 1 - i];
            info[tamanho - 1 - i] = aux;
        }
    }

}
