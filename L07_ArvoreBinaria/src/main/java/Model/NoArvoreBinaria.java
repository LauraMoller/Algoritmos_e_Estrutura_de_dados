package Model;

/**
 * Classe que representa os nós da árvore binária.
 *
 * @author Laura Möller
 */
public class NoArvoreBinaria<T> {

    /**
     * Variável de Instância que armazena a informação contida no nó.
     */
    private T info;
    /**
     * Variável de Instância que armazena o nó filho da esquerda.
     */
    private NoArvoreBinaria<T> esquerda;
    /**
     * Variável de Instância que armazena o nó filho da direita.
     */
    private NoArvoreBinaria<T> direita;

    /**
     * Construtor da classe que define um nó sem filhos.
     *
     * @param info informação contida no nó.
     */
    public NoArvoreBinaria(T info) {
        setInfo(info);
    }

    /**
     * Construtor da classe que define um nó com dois filhos.
     *
     * @param info informação contida no nó.
     * @param esq nó filho da esquerda.
     * @param dir nó filho da direita.
     */
    public NoArvoreBinaria(T info, NoArvoreBinaria<T> esq, NoArvoreBinaria<T> dir) {
        setInfo(info);
        setEsquerda(esq);
        setDireita(dir);
    }

    /**
     * Método que define a informação contida no nó.
     *
     * @param info informação a ser contidano nó.
     */
    public void setInfo(T info) {
        this.info = info;
    }

    /**
     * Método que retorna a informação contida no nó.
     *
     * @return informação contida no nó.
     */
    public T getInfo() {
        return info;
    }

    /**
     * Método que retorna o nó da esquerda.
     *
     * @return nó da esquerda.
     */
    public NoArvoreBinaria<T> getEsquerda() {
        return esquerda;
    }

    /**
     * Método que retorna o nó da direita.
     *
     * @return nó da direita.
     */
    public NoArvoreBinaria<T> getDireita() {
        return direita;
    }

    /**
     * Método que define o nó da esquerda.
     *
     * @param esquerda nó a ser definido como nó da esquerda.
     */
    public void setEsquerda(NoArvoreBinaria<T> esquerda) {
        this.esquerda = esquerda;
    }

    /**
     * Método que define o nó da direita.
     *
     * @param direita nó a ser definido como nó da direita.
     */
    public void setDireita(NoArvoreBinaria<T> direita) {
        this.direita = direita;
    }

}
