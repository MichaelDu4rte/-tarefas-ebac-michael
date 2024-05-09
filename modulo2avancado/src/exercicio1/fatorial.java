package exercicio1;
import java.math.BigInteger;

public class fatorial {
	
	public static void main(String[] args) {
        int numero = 100;
        BigInteger resultado = calcularFatorial(numero);
        System.out.println("Fatorial de " + numero + " é: " + resultado);
    }
    
    public static BigInteger calcularFatorial(int n) {
        BigInteger fatorial = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            fatorial = fatorial.multiply(BigInteger.valueOf(i));
        }
        return fatorial;
    }
}
