
import Model.FilaCheiaException;
import Model.FilaVaziaException;
import Model.FilaVetor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe de teste.
 *
 * @author Laura Möller
 */
public class Teste {

    /**
     * Variável de instância que armazena um objeto da fila.
     */
    private FilaVetor<Integer> fila;

    /**
     * Método teste que verifica se a fila está vazia ao criar.
     */
    @Test
    public void t1_criarFilaVazia() {
        fila = new FilaVetor(3);
        assertTrue(fila.estaVazia());
    }

    /**
     * Método teste que verifica a criação de uma fila que não está vazia.
     */
    @Test
    public void t2_criarFilaNaoVazia() {
        fila = new FilaVetor(5);
        fila.inserir(10);
        assertFalse(fila.estaVazia());
    }

    /**
     * Método teste que verifica se a enfileiração dos elementos na fila ocorre
     * corretamente (First In, First Out).
     */
    @Test
    public void t3_verificarEnfileiracao() {
        fila = new FilaVetor(10);
        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);
        assertEquals(10, fila.retirar());
        assertEquals(20, fila.retirar());
        assertEquals(30, fila.retirar());
        assertTrue(fila.estaVazia());
    }

    /**
     * Método teste que verifica se a exceção de fila cheia é lançada quando a
     * fila atinge seu limite.
     */
    @Test
    public void t4_excecaoFilaCheia() {
        fila = new FilaVetor(3);
        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);
        assertThrows(FilaCheiaException.class, () -> {
            fila.inserir(40);
        });
    }

    /**
     * Método teste que verifica se a exceção de fila vazia é lançada ao tentar
     * retirar um elemento de uma fila vazia.
     */
    @Test
    public void t5_excecaoFilaVazia() {
        fila = new FilaVetor(3);
        assertThrows(FilaVaziaException.class, () -> {
            fila.retirar();
        });
    }

    /**
     * Método teste que verifica o método peek (retorna o primeiro elemento da
     * fila).
     */
    @Test
    public void t6_peek() {
        fila = new FilaVetor(5);
        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);
        assertEquals(10, fila.peek());
        assertEquals(10, fila.retirar());
    }

    /**
     * Método teste que verifica o método liberar, responsável por esvaziar a
     * fila.
     */
    @Test
    public void t7_liberar() {
        fila = new FilaVetor(5);
        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);
        fila.liberar();
        assertTrue(fila.estaVazia());
    }

    /**
     * Método teste que verifica se a concatenação de fila ocorre corretamente.
     */
    @Test
    public void t8_concatenar() {
        fila = new FilaVetor(5);
        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);
        FilaVetor<Integer> f2 = new FilaVetor(3);
        f2.inserir(40);
        f2.inserir(50);
        FilaVetor<Integer> f3 = fila.criarFilaConcatenada(f2);
        assertEquals("10, 20, 30, 40, 50.", f3.toString());
        assertEquals("10, 20, 30.", fila.toString());
        assertEquals("40, 50.", f2.toString());
        assertEquals(8, f3.getLimite());
    }

}
