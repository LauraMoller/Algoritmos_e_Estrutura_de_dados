package Q2;

/**
 *
 * @author Laura Möller
 */
public class ListaEncadeada<T> {

    private NoLista<T> primeiro;

    public ListaEncadeada() {
        this.primeiro = null;
    }

    public void inserir(T valor) {
        NoLista<T> novo = new NoLista<>(primeiro, valor);
        setPrimeiro(novo);
    }

    public void setPrimeiro(NoLista<T> primeiro) {
        this.primeiro = primeiro;
    }

    public boolean estaVazia() {
        return primeiro == null;
    }

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

    public NoLista<T> getPrimeiro() {
        return primeiro;
    }

    public int obterComprimento() {
        int i = 0;
        NoLista<T> noAtual = primeiro;
        while (noAtual != null) {
            i++;
            noAtual = noAtual.getProximo();
        }
        return i;
    }

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

    public void liberar() {
        this.primeiro = null;
    }
}
