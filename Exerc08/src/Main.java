
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// criando um objeto da classe carro
		Car carro = new Car();
		
		// Setando valores do carro
		carro.setAno(2003);
		carro.setMarca("Gol");
		carro.setCor("Preto");

		
		System.out.println("Marca do carro: " + carro.getMarca() );
		System.out.println("Ano do carro: " + carro.getAno() );
		System.out.println("Cor do carro: " + carro.getCor() );
		
	}

}
