import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero para converter: ");
		int numero = sc.nextInt();	
		System.out.println();
		System.out.println("Numero digitado(primitivo) : " + numero);
		System.out.println();
		
		// Convertendo para o tipo Wrapper
		Integer numero0 = Integer.valueOf(numero);
		System.out.println("--------");
		System.out.println();
		System.out.println("Numero convertido: " + numero0);
		System.out.println("Tipo: " + numero0.getClass().getTypeName());
		
		sc.close();
		
		
		
		
	}

}
