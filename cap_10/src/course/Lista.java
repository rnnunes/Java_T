package course;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {

	public static void main(String[] args) {
		//aula 15 cap 10 

		List<String> list = new ArrayList<>(); // lista = interface
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2,"Marco");
		
		System.out.println(list.size());
	
		for (String x : list) { // for each
			System.out.println(x);
		}
		
		System.out.println("---------------------------------");
		
//		list.remove("Anna"); // remover nome exatamente igual esta // comparação
//		list.remove(1); // remover pela a numeração 
		list.removeIf(x -> x.charAt(0) == 'M'); // if remover
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("----------------------------------");
		
		System.out.println("Numero Intex do Bob = " + list.indexOf("Anna")); // se não tiver o nome ira retornar -1
	
		System.out.println("----------------------------------");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());// filtro de lista
		
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("----------------------------------");

		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null); // Encontrar o primeiro nome q começa quem a letra em questão neste caso o 'A'
		
		System.out.println(name);
	}

}


