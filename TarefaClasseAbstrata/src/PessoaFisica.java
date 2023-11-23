
public class PessoaFisica extends Pessoa {
	
	private Long cpf;
	
	
	public PessoaFisica(String name, Long cpf) {
		setName(name);
		this.cpf = cpf;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Name: " + getName() +
				"\nCpf: " + getCpf();
	}

	
	
	
		
}
