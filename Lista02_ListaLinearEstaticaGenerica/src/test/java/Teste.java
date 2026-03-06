
import Model.ListaEstatica;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Laura Möller
 */
public class Teste {

    private ListaEstatica lista;

    @Test
    public void testeUm_MetodoInclusao() {
        lista = new ListaEstatica();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        assertEquals("5, 10, 15, 20.", lista.toString());
    }

    @Test
    public void testeDois_ObterTamanho() {
        lista = new ListaEstatica();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        assertEquals(4, lista.getTamanho());
    }

    @Test
    public void testeTres_MetodoBuscarElementoExistente() {
        lista = new ListaEstatica();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        assertEquals(2, lista.buscar(15));
    }

    @Test
    public void testeQuatro_MetodoBuscarElementoInexistente() {
        lista = new ListaEstatica();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        assertEquals(-1, lista.buscar(30));
    }

    @Test
    public void testeCinco_MetodoRetirar() {
        lista = new ListaEstatica();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        lista.retirar(10);
        assertEquals("5, 15, 20.", lista.toString());
        assertEquals(3, lista.getTamanho());
    }

    @Test
    public void testeSeis_MetodoInclusaoComRedimensionamento() {
        lista = new ListaEstatica();
        for (int i = 0; i < 15; i++) {
            lista.inserir(i + 1);
        }
        assertEquals("1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15.", lista.toString());
        assertEquals(15, lista.getTamanho());
    }

    @Test
    public void testeSete_MetodoObterElemento() {
        lista = new ListaEstatica();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        lista.retirar(10);
        assertEquals(20, lista.obterElemento(2));
    }

    @Test
    public void testeOito_IndexOutOfBoundsObterElemento() {
        lista = new ListaEstatica();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        lista.retirar(10);
        assertThrows(IndexOutOfBoundsException.class, () -> {
            lista.obterElemento(5);
        });
    }

    @Test
    public void testeNove_MetodoLiberar() {
        lista = new ListaEstatica();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        lista.retirar(10);
        lista.liberar();
        assertTrue(lista.estaVazia());
    }

    @Test
    public void testeDez_InverterQntPar() {
        lista = new ListaEstatica();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        lista.inverter();
        assertEquals("20, 15, 10, 5.", lista.toString());
    }

    @Test
    public void testeOnze_InverterQntImpar() {
        lista = new ListaEstatica();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        lista.inserir(25);
        lista.inverter();
        assertEquals("25, 20, 15, 10, 5.", lista.toString());
    }
}
