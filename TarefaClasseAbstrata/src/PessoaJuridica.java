
public class PessoaJuridica extends Pessoa {
	
	private Long Cnpj;
	
	public PessoaJuridica(String name, Long cnpj) {
		setName(name);
		Cnpj = cnpj;
	}

	public Long getCnpj() {
		return Cnpj;
	}

	public void setCnpj(Long Cnpj) {
		this.Cnpj = Cnpj;
	}

	@Override
	public String toString() {
		return "Name: " + getName() +
				"\nCnpj: " + getCnpj();
	}

	
}
