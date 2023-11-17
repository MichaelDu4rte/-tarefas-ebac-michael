import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		List<String> listaDeHomens = new ArrayList<>();
		List<String> listaDeMulheres = new ArrayList<>();
		Integer qtdHomens = 0;
		Integer qtdMulheres = 0;
		
		
		while(true) {
			System.out.println("Digite um nome e genero (Exemplo: Gustavo-M) ou 'sair' para encerrar");
			
			String entrada = sc.next();
			
			if (entrada.equalsIgnoreCase("sair")) {
				
				Collections.sort(listaDeHomens);
				Collections.sort(listaDeMulheres);
				break;

			} else {
				
				String[] partes = entrada.split("-");
				
				if(partes.length == 2) {
					String nome = partes[0];
					
					String genero = partes[1];
					
					if (genero.equalsIgnoreCase("M")) {
						listaDeHomens.add(nome);	
						qtdHomens++;
					}
					
					if(genero.equalsIgnoreCase("F")) {
						listaDeMulheres.add(nome);
						qtdMulheres++;

					}
				}
			}
			
		}
		
		System.out.println(listaDeHomens);
		System.out.println("Quantidade de homens: " + qtdHomens);
		System.out.println("-------------------------");
		System.out.println(listaDeMulheres);
		System.out.println("Quantidade de mulheres: " + qtdMulheres);
		
		sc.close();
		
	}

}
