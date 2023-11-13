
public class AlunoNotas {
	
	int nota1;
	int nota2;
	int nota3;
	int nota4;
	
	public AlunoNotas() {
		
	}
	
	public AlunoNotas(int nota1, int nota2, int nota3, int nota4) {
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.nota4 = nota4;
	}
	
	
	/**
	 * 
	 * @return Nota final do aluno
	 */
	public int notaFinal() {
		return (this.nota1 + this.nota2 + this.nota3 + this.nota4) / 4;
	}
	
	
	
}
