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
			System.out.printf("Dados da %d° pessoa:", i + 1);
			System.out.printf("%nNome: ");
			String name = sc.next();
			
			System.out.printf("Idade: ");
			int idade = sc.nextInt();

			System.out.printf("Altura: ");
			double alt = sc.nextDouble();
			vect[i] = new Entities_Ex02(name, idade, alt);
		}
		
		double sum = 0;
		for (int i = 0; i < vect.length ; i++ ) {	
				sum += vect[i].getAlt();
			
		}
		
		int count = 0;
		for (int i = 0; i < vect.length ; i ++) {
				if (vect[i].getIdade() < 16) {
					count += count + 1;
				}
		}
		
		double perc = (count * 100) / num_people;
		System.out.printf("%nAltura Média das Pessoas: %.2f", sum/num_people);
		System.out.printf("%nPercentual de pessoas que tem menos de 16 anos: %.1f%% %n", perc);
		
		for (int i = 0; i < vect.length ; i ++) {
			if (vect[i].getIdade() < 16) {
					System.out.println(vect[i].getName());
			}
		}
		
	}
}
