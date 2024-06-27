import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class FibonacciTest {
	 @Test
	    public void testCalcularFibonacci() {
	        Fibonacci fib = new Fibonacci();
	        
	        assertEquals(0, fib.calcularFibonacci(0));
	        assertEquals(1, fib.calcularFibonacci(1));
	        assertEquals(1, fib.calcularFibonacci(2));
	        assertEquals(2, fib.calcularFibonacci(3));
	        assertEquals(3, fib.calcularFibonacci(4));
	        assertEquals(5, fib.calcularFibonacci(5));
	        assertEquals(8, fib.calcularFibonacci(6));
	        assertEquals(13, fib.calcularFibonacci(7));
	        assertEquals(21, fib.calcularFibonacci(8));
	        assertEquals(34, fib.calcularFibonacci(9));
	    }

	    @Test
	    public void testCalcularFibonacciComIndiceNegativo() {
	        Fibonacci fib = new Fibonacci();
	        
	        assertThrows(IllegalArgumentException.class, () -> {
	            fib.calcularFibonacci(-1);
	        });
	    }
}
