package exercicio2;

public class bottomup {
	 public static void main(String[] args) {
	        int numero = 10;
	        long resultado = calcularFatorialBottomUp(numero);
	        System.out.println("Fatorial de " + numero + " é: " + resultado);
	    }
	    
	    public static long calcularFatorialBottomUp(int n) {
	        if (n == 0 || n == 1) {
	            return 1;
	        }
	        long[] dp = new long[n + 1];
	        dp[0] = 1;
	        dp[1] = 1;
	        for (int i = 2; i <= n; i++) {
	            dp[i] = dp[i - 1] * i;
	        }
	        return dp[n];
	    }
}
