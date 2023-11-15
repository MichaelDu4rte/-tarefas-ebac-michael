import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		AlunoMedia notas = new AlunoMedia();
		
		System.out.print("Digite a primeira nota: ");
		notas.setNota1(sc.nextDouble());
		
		System.out.print("Digite a segunda nota: ");
		notas.setNota2(sc.nextDouble());
		
		System.out.print("Digite a terceira nota: ");
		notas.setNota3(sc.nextDouble());
		
		System.out.print("Digite a quarta nota: ");
		notas.setNota4(sc.nextDouble());
		
		if(notas.calculoMedia() >= 7) {
			System.out.print("Aluno aprovado com media: " + String.format("%.2f", notas.calculoMedia()));
		} else if (notas.calculoMedia() >= 5) {
			System.out.print("Aluno em recuperacao com media: " + String.format("%.2f", notas.calculoMedia()));
		} else {
			System.out.print("Aluno foi reprovado com media: " + String.format("%.2f", notas.calculoMedia()));
		}
		
		sc.close();

	}

}
