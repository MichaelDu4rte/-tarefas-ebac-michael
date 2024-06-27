
public class Fibonacci {
	// Método para calcular o n-ésimo número da sequência de Fibonacci
    public int calcularFibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("O índice não pode ser negativo");
        }
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int a = 0, b = 1, c;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
