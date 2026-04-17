package Model;

/**
 * Classe que representa uma árvore binária, ou seja, cada nó possui no máximo
 * dois filhos.
 *
 * @author Laura Möller
 */
public class ArvoreBinaria<T> {

    /**
     * Variável de Instância que armazena a raiz da árvore.
     */
    private NoArvoreBinaria<T> raiz;

    /**
     * Construtor da classe que inicializa a árvore vazia, ou seja, sem nós.
     */
    public ArvoreBinaria() {
        setRaiz(null);
    }

    /**
     * Método que acessa a variável de instância raiz e determina a raiz.
     *
     * @param raiz nó que será a raiz da árvore.
     */
    public void setRaiz(NoArvoreBinaria<T> raiz) {
        this.raiz = raiz;
    }

    /**
     * Método que verifica se a árvore está vazia.
     *
     * @return true se estiver vazia, false caso contrário.
     */
    public boolean estaVazia() {
        return raiz == null;
    }

    /**
     * Método público de recursividade para verificar se uma informação pertence
     * à árvore.
     *
     * @param info informação a ser buscada.
     * @return true se pertencer, false caso contrário.
     */
    public boolean pertence(T info) {
        return pertence(raiz, info);
    }

    /**
     * Método privado de recursividade para verificar se uma informação pertence
     * à árvore.
     *
     * @param no no atual da busca.
     * @param info informação buscada.
     * @return true se pertencer, false caso contrário.
     */
    private boolean pertence(NoArvoreBinaria<T> no, T info) {
        if (no == null) {
            return false;
        }
        return (no.getInfo() == info) || pertence(no.getEsquerda(), info) || pertence(no.getDireita(), info);
    }

    /**
     * Método público de recursividade que produz a representação textual da
     * árvore.
     *
     * @return representação textual (Pré-ordem).
     */
    public String toString() {
        if (raiz == null) {
            return "<>";
        }
        return arvorePre(raiz);
    }

    /**
     * Método privado de recursividade que produz a representação textual da
     * árvore.
     *
     * @param no nó atual.
     * @return representação textual (Pré-ordem).
     */
    private String arvorePre(NoArvoreBinaria<T> no) {
        if (no == null) {
            return "<>";
        }
        return "<" + no.getInfo() + arvorePre(no.getEsquerda()) + arvorePre(no.getDireita()) + ">";
    }

    /**
     * Método público de recursividade que determina a quantidade de nós que a
     * árvore possui.
     *
     * @return quantidade de nós da árvore.
     */
    public int contarNos() {
        if (raiz == null) {
            return 0;
        }
        return contarNos(raiz);
    }

    /**
     * Método privado de recursividade que determina a quantidade de nós que a
     * árvore possui.
     *
     * @param no nó atual.
     * @return quantidade de nós da árvore.
     */
    private int contarNos(NoArvoreBinaria<T> no) {
        if (no == null) {
            return 0;
        }
        return 1 + contarNos(no.getEsquerda()) + contarNos(no.getDireita());
    }
}
