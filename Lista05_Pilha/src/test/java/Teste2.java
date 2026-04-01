import Q2.PilhaLista;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Laura Möller
 */
public class Teste2 {
    
    private PilhaLista<Integer> pilha;
    
    public Teste2() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void t1_estaVazia(){
        pilha = new PilhaLista();
        assertTrue(pilha.estaVazia());
    }
    
    @Test
    public void t2_naoEstaVazia(){
        pilha = new PilhaLista();
        pilha.push(10);
        assertFalse(pilha.estaVazia());
    }
    
    @Test
    public void t3_empilharDesempilhar(){
        pilha = new PilhaLista();
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        assertEquals(30, pilha.pop());
        assertEquals(20, pilha.pop());
        assertEquals(10, pilha.pop());
        assertTrue(pilha.estaVazia());
    }
    
    @Test
    public void t4_peekRetornaOTopo(){
        pilha = new PilhaLista();
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        assertEquals(30, pilha.peek());
        assertEquals(30, pilha.pop());
    }
    
    @Test
    public void t5_liberar(){
        pilha = new PilhaLista();
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        pilha.liberar();
        assertTrue(pilha.estaVazia());
    }
    
}
