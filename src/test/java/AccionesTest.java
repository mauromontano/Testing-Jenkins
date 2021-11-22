import org.junit.Test;

import static org.junit.Assert.*;

public class AccionesTest {

    // Arrange
    private Acciones acc = new Acciones();
    private int pruebaEquals = 4;
    private int pruebaTrue = 7;
    private int pruebaFalse = 20;
    private String word = "campana";


    @Test
    public void testEqualsPertenece() {
        boolean resultado= acc.pertenece(this.pruebaEquals);
        assertEquals(true,resultado);
    }

    @Test
    public void testTruePertenece() {
        boolean resultado= acc.pertenece(pruebaTrue);
        assertTrue(resultado);
    }

    @Test
    public void testFalsePertenece() {
        boolean resultado= acc.pertenece(pruebaFalse);
        assertFalse(resultado);
    }

    @Test
    public void testEqualsContarA() {
        int resultado= acc.contarA(word);
        assertEquals(3,resultado);
    }


}
