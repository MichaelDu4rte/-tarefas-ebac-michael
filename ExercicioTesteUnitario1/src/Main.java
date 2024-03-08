import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Main {
	public static void main(String[] args) {
		
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
		
		List<Pessoa> a = list.stream().filter(p -> p.getSexo() == "F").collect(Collectors.toList());
	           
		System.out.println("Lista Completa: ");
		list.forEach(System.out::println);
		
		System.out.println();
		System.out.println("-----------------------------");
		System.out.println("Lista apenas mulheres: ");
		a.forEach(System.out::println);
	
		
	}
}
