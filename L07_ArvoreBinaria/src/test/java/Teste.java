
import Model.ArvoreBinaria;
import Model.NoArvoreBinaria;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe de Teste.
 *
 * @author Laura Möller
 */
public class Teste {

    /**
     * Variável de instância que armazena um objeto inteiro da classe
     * ArvoreBinaria.
     */
    private ArvoreBinaria<Integer> arvore;

    /**
     * Método de teste que verifica se a árvore está vazia.
     */
    @Test
    public void t1_arvoreVazia() {
        arvore = new ArvoreBinaria();
        assertTrue(arvore.estaVazia());
    }

    /**
     * Método de teste que verifica se a árvore não está vazia.
     */
    @Test
    public void t2_arvoreNaoVazia() {
        arvore = new ArvoreBinaria();
        NoArvoreBinaria<Integer> no = new NoArvoreBinaria(5);
        arvore.setRaiz(no);
        assertFalse(arvore.estaVazia());
    }

    /**
     * Método de teste que verifica a representação textual da árvore.
     */
    @Test
    public void t3_representacaoTextual() {
        arvore = new ArvoreBinaria();
        NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria(4);
        NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria(5);
        NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria(6);
        NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria(3, no5, no6);
        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria(2, null, no4);
        NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria(1, no2, no3);
        arvore.setRaiz(no1);
        assertEquals("<1<2<><4<><>>><3<5<><>><6<><>>>>", arvore.toString());
    }

    /**
     * Método de teste que verifica se um nó pertence à árvore.
     */
    @Test
    public void t4_pertence() {
        arvore = new ArvoreBinaria();
        NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria(4);
        NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria(5);
        NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria(6);
        NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria(3, no5, no6);
        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria(2, null, no4);
        NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria(1, no2, no3);
        arvore.setRaiz(no1);
        assertTrue(arvore.pertence(1));
    }

    /**
     * Método de teste que verifica se um nó pertence a árvore.
     */
    @Test
    public void t5_pertence() {
        arvore = new ArvoreBinaria();
        NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria(4);
        NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria(5);
        NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria(6);
        NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria(3, no5, no6);
        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria(2, null, no4);
        NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria(1, no2, no3);
        arvore.setRaiz(no1);
        assertTrue(arvore.pertence(3));
    }

    /**
     * Método de teste que verifica se um nó folha pertence à árvore.
     */
    @Test
    public void t6_pertenceNoFolha() {
        arvore = new ArvoreBinaria();
        NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria(4);
        NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria(5);
        NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria(6);
        NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria(3, no5, no6);
        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria(2, null, no4);
        NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria(1, no2, no3);
        arvore.setRaiz(no1);
        assertTrue(arvore.pertence(6));
    }

    /**
     * Método de teste que verifica se um nó que não pertence é identificado
     * corretamente.
     */
    @Test
    public void t7_naoPertence() {
        arvore = new ArvoreBinaria();
        NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria(4);
        NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria(5);
        NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria(6);
        NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria(3, no5, no6);
        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria(2, null, no4);
        NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria(1, no2, no3);
        arvore.setRaiz(no1);
        assertFalse(arvore.pertence(10));
    }

    /**
     * Método teste que verifica se os nós são contabilizados corretamente.
     */
    @Test
    public void t8_qntNos() {
        arvore = new ArvoreBinaria();
        NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria(4);
        NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria(5);
        NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria(6);
        NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria(3, no5, no6);
        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria(2, null, no4);
        NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria(1, no2, no3);
        arvore.setRaiz(no1);
        assertEquals(6, arvore.contarNos());
    }
}
