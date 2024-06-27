
// Class calculadora para realizar calculos sobre dois numeros
public class Calculadora {

	// calculo adicionar
	public int adicionar(int a, int b) {
		return a + b;
	}
	
	// calculo subtrair
	public int subtrair(int a, int b) {
		return a - b;
	}
	
	// calculo multiplicar
	public int multiplicar(int a, int b) {
		return a * b;
	}
	
	// calculo dividir
	public int dividir(int a, int b) {
		
		if(b == 0 ) {
			throw new IllegalArgumentException("Divisor não pode ser zero");
		}
		
		return a / b;
	}

}
