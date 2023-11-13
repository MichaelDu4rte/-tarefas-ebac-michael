
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Definindo notas do aluno
		AlunoNotas notas = new AlunoNotas(10, 4, 8, 6);
		
		// Verificando se a nota é maior que 6
		if(notas.notaFinal() >= 6) {
			
			// Se for maior que 6 aluno foi aprovado
			System.out.println("Nota final: " + notas.notaFinal());
			System.out.println("Aluno aprovado");
		} else {
			// Caso nao, aluno sera reprovado
			System.out.println("Nota final: " + notas.notaFinal());
			System.out.println("Aluno reprovado");
		}

	}

}
