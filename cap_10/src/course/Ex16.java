package course;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos Funcionarios irá resgistrar?");
		int num_func = sc.nextInt();
		
		List<Integer> list_id = new ArrayList<>();
		List<String> list_name = new ArrayList<>();
		List<Double> list_sal = new ArrayList<>();
		
		int id = sc.nextInt();
		String name = sc.next();
		double sal = sc.nextDouble();
		
		list_id.add(id);
		list_name.add(name);
		list_sal.add(sal);
		
		
		System.out.println("Funcionario # :");
		System.out.println("Id: " + list_id + list_name + list_sal);
		
		
		
		
		sc.close();
	}

}

