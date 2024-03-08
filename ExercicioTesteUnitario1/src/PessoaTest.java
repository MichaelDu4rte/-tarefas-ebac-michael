
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;



public class PessoaTest {
	
	@Test
	public void test() {
		
				// F = Girl // M = Boy
				Pessoa p1 = new Pessoa("Mathues", "m");
				Pessoa p2 = new Pessoa("Joao", "m");
				Pessoa p3 = new Pessoa("Joana", "F");
				Pessoa p4 = new Pessoa("Amanda", "F");
				
				List<Pessoa> list = new ArrayList<Pessoa>();
				
				list.add(p1);
				list.add(p2);
				list.add(p3);
				list.add(p4);
				
				// criando uma nova lista e filtrando apenas quem é do sexo feminino
				List<Pessoa> a = list.stream().filter(p -> p.getSexo() == "F").collect(Collectors.toList());
				
				// Verifica se todas as pessoas da lista têm sexo feminino
		        for (Pessoa pessoa : a) {
		            assertEquals("F", pessoa.getSexo());
		        }
		        
		        System.out.println("Todas as pessoas sao do sexo feminino");
	}
		           
}
