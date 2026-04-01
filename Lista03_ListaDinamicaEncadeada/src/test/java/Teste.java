
import Model.ListaEncadeada;
import Model.NoLista;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe de testes.
 *
 * @author Laura Möller
 */
public class Teste {

    /**
     * Variável de instância que armazena a lista para os testes.
     */
    private ListaEncadeada<Integer> lista;

    /**
     * Método que testa se a lista está vazia.
     */
    @Test
    public void testeUm_ListaVazia() {
        lista = new ListaEncadeada<>();
        assertTrue(lista.estaVazia());
    }

    /**
     * Método que testa se a lista não está vazia.
     */
    @Test
    public void testeDois_ListaNaoVazia() {
        lista = new ListaEncadeada<>();
        lista.inserir(5);
        assertFalse(lista.estaVazia());
    }

    /**
     * Método que testa se um valor foi incluso na lista.
     */
    @Test
    public void testeTres_ValidarInclusao() {
        lista = new ListaEncadeada<>();
        lista.inserir(5);
        assertEquals(lista.getPrimeiro(), lista.obterNo(0));
        NoLista<Integer> no = lista.obterNo(0);
        assertEquals(5, no.getInfo());
        assertEquals(null, no.getProximo());
    }

    /**
     * Método que testa inclusão de três números na lista.
     */
    @Test
    public void testeQuatro_ValidarInclusaoTresNumeros() {
        lista = new ListaEncadeada<>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        assertEquals(lista.getPrimeiro(), lista.obterNo(0));
        int valor1 = lista.obterNo(1).getInfo();
        assertEquals(10, valor1);
        int valor2 = lista.obterNo(2).getInfo();
        assertEquals(5, valor2);
        assertThrows(IndexOutOfBoundsException.class, () -> {
            lista.obterNo(3);
        });
    }

    /**
     * Método que valida a busca do primeiro valor.
     */
    @Test
    public void testeCinco_ValidarBuscaPrimeiro() {
        lista = new ListaEncadeada<>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        assertEquals(20, lista.buscar(20).getInfo());
    }

    /**
     * Método que valida a busca de um valor no meio da lista.
     */
    @Test
    public void testeSeis_ValidarBuscaMeioDaLista() {
        lista = new ListaEncadeada<>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        assertEquals(15, lista.buscar(15).getInfo());
    }

    /**
     * Método que busca um valor inexistente na lista.
     */
    @Test
    public void testeSete_ValidarBuscaInexistente() {
        lista = new ListaEncadeada<>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        assertEquals(null, lista.buscar(50));
    }

    /**
     * Método que valida a exclusão do primeiro item da lista.
     */
    @Test
    public void testeOito_ValidarExclusaoPrimeiroItem() {
        lista = new ListaEncadeada<>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        lista.retirar(20);
        assertEquals("15, 10, 5.", lista.toString());
    }

    /**
     * Método que valida a exclusão de um item no meio da lista.
     */
    @Test
    public void testeNove_ValidarExclusaoMeio() {
        lista = new ListaEncadeada<>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        lista.retirar(15);
        assertEquals("20, 10, 5.", lista.toString());
    }

    /**
     * Método que valida obter o nó da posição zero.
     */
    @Test
    public void testeDez_ValidarObterNoPosicaoZero() {
        lista = new ListaEncadeada<>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        assertEquals(20, lista.obterNo(0).getInfo());
    }

    /**
     * Método que valida obter o nó da última posição.
     */
    @Test
    public void testeOnze_ValidarObterNoUltimaPosicao() {
        lista = new ListaEncadeada<>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        assertEquals(5, lista.obterNo(3).getInfo());
    }

    /**
     * étodo que valida obter nó de uma posição invalida.
     */
    @Test
    public void testeDoze_ObterNoPosicaoInvalida() {
        lista = new ListaEncadeada<>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        assertThrows(IndexOutOfBoundsException.class, () -> {
            lista.obterNo(10);
        });
    }

    /**
     * Método que valida o comprimento de uma lista vazia.
     */
    @Test
    public void testeTreze_ObterComprimentoListaVazia() {
        lista = new ListaEncadeada<>();
        assertEquals(0, lista.obterComprimento());
    }

    /**
     * Método que valida o comprimento de uma lista não vazia.
     */
    @Test
    public void testeQuatorze_ObterComprimentoListaNaoVazia() {
        lista = new ListaEncadeada<>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        assertEquals(4, lista.obterComprimento());
    }
}
