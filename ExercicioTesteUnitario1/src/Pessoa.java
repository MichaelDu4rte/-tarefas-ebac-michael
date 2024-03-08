import java.util.Objects;

public class Pessoa {
	private String name;
	private String sexo;
	
	
	public Pessoa() {}


	public Pessoa(String name, String sexo) {
		this.name = name;
		this.sexo = sexo;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	@Override
	public String toString() {
		return "Pessoa [name=" + name + ", sexo=" + sexo + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(sexo);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(sexo, other.sexo);
	};
	
	
	
}
