import Q1.PilhaCheiaException;
import Q1.PilhaVaziaException;
import Q1.PilhaVetor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Laura Möller
 */
public class Teste {

    private PilhaVetor<Integer> pilha;

    @Test
    public void t1_PilhaVazia() {
        pilha = new PilhaVetor(5);
        assertTrue(pilha.estaVazia());
    }

    @Test
    public void t2_PilhaNaoVazia() {
        pilha = new PilhaVetor(5);
        pilha.push(10);
        assertFalse(pilha.estaVazia());
    }

    @Test
    public void t3_EmpilharDesempilhar() {
        pilha = new PilhaVetor(10);
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        assertEquals(30, pilha.pop());
        assertEquals(20, pilha.pop());
        assertEquals(10, pilha.pop());
        assertTrue(pilha.estaVazia());
    }

    @Test
    public void t4_PilhaCheiaException() {
        pilha = new PilhaVetor(3);
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        assertThrows(
                PilhaCheiaException.class, () -> {
                    pilha.push(40);
                }
        );
    }

    @Test
    public void t5_PilhaVaziaException() {
        pilha = new PilhaVetor(3);
        assertThrows(
                PilhaVaziaException.class, () -> {
                    pilha.pop();
                }
        );
    }

    @Test
    public void t6_DesempilharOTopo() {
        pilha = new PilhaVetor(5);
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        assertEquals(30, pilha.peek());
        assertEquals(30, pilha.pop());
    }

    @Test
    public void t7_Liberar() {
        pilha = new PilhaVetor(5);
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        pilha.liberar();
        assertTrue(pilha.estaVazia());
    }

    @Test
    public void t8_Concatenar() {
        pilha = new PilhaVetor(5);
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        PilhaVetor p = new PilhaVetor<Integer>(2);
        p.push(40);
        p.push(50);
        pilha.concatenar(p);
        assertEquals("50, 40, 30, 20, 10.", pilha.toString());
    }
}
