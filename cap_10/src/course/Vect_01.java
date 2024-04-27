package course;

import java.util.Locale;
import java.util.Scanner;

import entities.Entities;

public class Vect_01 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		int n = sc.nextInt();
		Entities[] vect = new Entities[n];
		
		for (int i = 0; i < vect.length; i++) {
			String name = sc.next();
			double price = sc.nextDouble();
			vect[i] = new Entities(name, price);
		}
		
		double sum = 0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}
		
		double ave = sum / vect.length; /// variavel n pode ser alterada pelo vect.length,
		System.out.printf("Media de presos: %.2f", ave);
		
		sc.close();
	}
}
