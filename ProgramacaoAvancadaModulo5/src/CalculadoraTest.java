

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import org.junit.Test;

// classe para realizar test da classe Calculadora
public class CalculadoraTest {

    @Test
    public void testAdicionar() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.adicionar(2, 3));
        assertEquals(-1, calc.adicionar(-2, 1));
        assertEquals(0, calc.adicionar(0, 0));
    }

    @Test
    public void testSubtrair() {
        Calculadora calc = new Calculadora();
        assertEquals(1, calc.subtrair(3, 2));
        assertEquals(-3, calc.subtrair(-2, 1));
        assertEquals(0, calc.subtrair(0, 0));
    }

    @Test
    public void testMultiplicar() {
        Calculadora calc = new Calculadora();
        assertEquals(6, calc.multiplicar(2, 3));
        assertEquals(-2, calc.multiplicar(-2, 1));
        assertEquals(0, calc.multiplicar(0, 5));
    }

    @Test
    public void testDividir() {
        Calculadora calc = new Calculadora();
        assertEquals(2, calc.dividir(6, 3));
        assertEquals(-2, calc.dividir(-6, 3));
        
        // Testando divisão por zero
        assertThrows(IllegalArgumentException.class, () -> {
            calc.dividir(1, 0);
        });
    }
}
