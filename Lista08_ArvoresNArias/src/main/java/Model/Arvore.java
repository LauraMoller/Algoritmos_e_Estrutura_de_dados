package Model;

/**
 *
 * @author Laura Möller
 */
public class Arvore<T> {

    private NoArvore<T> raiz;

    public Arvore(NoArvore<T> raiz) {
        setRaiz(raiz);
    }

    public void setRaiz(NoArvore<T> raiz) {
        this.raiz = raiz;
    }

    public NoArvore<T> getRaiz() {
        return raiz;
    }

    public String toString() {
        if (raiz == null) {
            return "<>";
        }
        return obterRepresentacaoTextual(raiz);
    }

    private String obterRepresentacaoTextual(NoArvore<T> no) {
        if (no == null) {
            return "";
        }
        return "<" + no.getInfo() + obterRepresentacaoTextual(no.getPrimeiro()) + ">"
                + obterRepresentacaoTextual(no.getProximo());
    }

    public boolean pertence(T info) {
        if (raiz == null) {
            return false;
        }
        return pertence(raiz, info);
    }

    private boolean pertence(NoArvore<T> no, T info) {
        if (no == null) {
            return false;
        }
        if (no.getInfo().equals(info)) {
            return true;
        }
        return pertence(no.getPrimeiro(), info) || pertence(no.getProximo(), info);
    }

    public int contarNos() {
        if (raiz == null) {
            return 0;
        }
        return contarNos(raiz);
    }

    private int contarNos(NoArvore<T> no) {
        if (no == null) {
            return 0;
        }
        return 1 + contarNos(no.getPrimeiro()) + contarNos(no.getProximo());
    }
}
