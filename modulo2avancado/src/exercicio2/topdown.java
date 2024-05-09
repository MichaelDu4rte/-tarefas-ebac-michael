package exercicio2;

public class topdown {
    public static void main(String[] args) {
        int numero = 10;
        long resultado = calcularFatorialTopDown(numero);
        System.out.println("Fatorial de " + numero + " é: " + resultado);
    }
    
    public static long calcularFatorialTopDown(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calcularFatorialTopDown(n - 1);
    }
}
