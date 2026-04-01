
import Model.ListaDupla;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Laura Möller
 */
public class Teste {

    public Teste() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void t1_Inclusao() {
        ListaDupla<Integer> lista = new ListaDupla();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        assertEquals("20, 15, 10, 5.", lista.toString());
        assertEquals("5 10 15 20", lista.exibirOrdemInversa());
    }
    
    
}
