package Model;

/**
 *
 * @author Laura Möller
 */
public class ListaDupla<T> {

    private NoListaDupla<T> primeiro;

    public NoListaDupla<T> getPrimeiro() {
        return primeiro;
    }

    public void inserir(T valor) throws IllegalArgumentException {
        if (valor == null) {
            throw new IllegalArgumentException("Erro: valor inválido.");
        }
        if (primeiro == null) {
            NoListaDupla<T> no = new NoListaDupla(valor, null, null);
            this.primeiro = no;
            return; //conferir
        }

        NoListaDupla<T> no = new NoListaDupla(valor, primeiro);
        primeiro.setAnterior(no);
        primeiro.setProximo(null);
        this.primeiro = no;
    }

    public NoListaDupla<T> buscar(T valor) {
        NoListaDupla<T> no = primeiro;
        while (no != null) {
            if (no.getInfo() == valor) {
                return no;
            }
            no = no.getProximo();
        }
        return null;
    }

    public void retirar(T valor) throws IllegalArgumentException {
        NoListaDupla<T> no = buscar(valor);
        if (no == null) {
            throw new IllegalArgumentException("Erro: valor não encontrado.");
        }
        NoListaDupla<T> ant = no.getAnterior();
        NoListaDupla<T> prox = no.getProximo();

        ant.setProximo(prox);
        prox.setAnterior(ant);
        no.setAnterior(null);
        no.setProximo(null);

    }

    public String exibirOrdemInversa() {
        if (this.primeiro == null) {
            return "Lista vazia.";
        }
        NoListaDupla<T> no = primeiro;
        while (no.getProximo() != null) {
            no = no.getProximo();
        }

        String lista = "Ordem Inversa: ";
        while (no.getAnterior() != null) {
            lista += no.getInfo() + " ";
            no.getAnterior();
        }

        return lista;
    }

    public void liberar() {
        NoListaDupla<T> no = primeiro.getProximo();
        while (no != null) {
            NoListaDupla<T> prox = no.getProximo();
            no.setProximo(null);
            no.setAnterior(null);
            no = prox;
        }
        primeiro = null;
    }

    public String toString() {
        if (this.primeiro == null) {
            return "Lista vazia.";
        }
        NoListaDupla<T> no = primeiro;

        String lista = "";
        while (no != null) {
            lista += no.getInfo();
            if (no.getProximo() == null) {
                lista += ".";
            } else {
                lista += ", ";
            }
            no.getProximo();
        }

        return lista;
    }

}
