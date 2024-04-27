package course;

import java.util.Locale;
import java.util.Scanner;

import entities.Entities_Ex02;

public class Vect_02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas serão digitadas? ");
		int num_people = sc.nextInt();
		
		System.out.println("Dados Pessoas: ");
		Entities_Ex02[] vect = new Entities_Ex02[num_people];
		
		for (int i = 0; i < vect.length; i ++) {
			System.out.printf("Dados da %d° pessoa:", i);
			System.out.printf("%nNome: ");
			String name = sc.next();
			
			System.out.printf("%nIdade: ");
			int idade = sc.nextInt();

			System.out.printf("%nAltura: ");
			double alt = sc.nextDouble();
			vect[i] = new Entities_Ex02(name, idade, alt);
		}
	}

}
