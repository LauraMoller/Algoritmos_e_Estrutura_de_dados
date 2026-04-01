package Q1;

/**
 *
 * @author Laura Möller
 */
public class PilhaVetor<T> implements Pilha<T> {

    private T info[];
    private int limite;
    private int tamanho;

    @SuppressWarnings("unchecked")
    public PilhaVetor(int limite) {
        this.info = (T[]) new Object[limite];
        this.tamanho = 0;
        this.limite = limite;
    }

    @Override
    public void push(T info) throws PilhaCheiaException {
        if (this.tamanho >= this.limite) {
            throw new PilhaCheiaException();
        }
        this.info[tamanho] = info;
        tamanho++;
    }

    @Override
    public T pop() throws PilhaVaziaException {
        if (this.tamanho == 0) {
            throw new PilhaVaziaException();
        }
        T valorDoTopo = info[tamanho - 1];
        info[tamanho - 1] = null;
        tamanho--;
        return valorDoTopo;
    }

    @Override
    public T peek() throws PilhaVaziaException {
        if (this.tamanho == 0) {
            throw new PilhaVaziaException();
        }
        return info[tamanho - 1];
    }

    @Override
    public boolean estaVazia() {
        return this.tamanho == 0;
    }

    @Override
    public void liberar() {
        for (int i = 0; i < tamanho; i++) {
            info[i] = null;
        }
        this.tamanho = 0;
    }

    public String toString() {
        if (this.tamanho == 0) {
            throw new PilhaVaziaException();
        }
        StringBuilder sb = new StringBuilder();
        for (int i = tamanho - 1; i >= 0; i--) {
            sb.append(info[i]);
            if (i > 0) {
                sb.append(", ");
            } else {
                sb.append(".");
            }
        }
        return sb.toString();
    }

    public void concatenar(PilhaVetor<T> p) throws EspacoInsuficienteException {
        int tam = p.tamanho + this.tamanho;
        if (tam > limite) {
            throw new EspacoInsuficienteException();
        }
        for (int i = 0; i < p.tamanho; i++) {
            this.push(p.info[i]);
        }
    }

}
