
public class Car {
	
	private String marca;
	private String cor;
	
	public Car(String marca, String cor) {
		this.marca = marca;
		this.cor = cor;
	}

	@Override
	public String toString() {
		return "\nMarca do carro: " + marca + "\ncor: " + cor + "\n";
	}
	
	
	
	
	
}
