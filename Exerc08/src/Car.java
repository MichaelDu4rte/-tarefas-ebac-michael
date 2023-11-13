
public class Car {
	
	private int ano;
	private Double preco;
	private String marca;
	private String cor;
	
	public Car() {
		
	}
	
	
	/**
	 * 
	 * @param ano
	 * @param preco
	 * @param marca
	 * @param cor
	 */
	public Car(int ano, Double preco, String marca, String cor) {
		this.ano = ano;
		this.preco = preco;
		this.marca = marca;
		this.cor = cor;
	}

	// Getters e setters
	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
	
	
}
