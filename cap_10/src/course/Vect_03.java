package course;

import java.util.Locale;
import java.util.Scanner;

import entities.Entities_ex03;

public class Vect_03 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("Quantos Quartos pretende alugar? ");
		int num_quartos = sc.nextInt();
		
		Entities_ex03 vect = new Entities_ex03("teste", "testeboy");

		System.out.println(vect);
		System.out.println(vect.toString());
	}

}
