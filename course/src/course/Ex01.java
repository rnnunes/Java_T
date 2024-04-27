package course;

import java.util.Scanner;
import entities.Retangulo;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Entre com a Largura e Altura do Retangulo Respectivamente: ");
		retangulo.base = sc.nextDouble();
		retangulo.alt = sc.nextDouble();
		
		System.out.println("Area = " + retangulo.area());
		System.out.println("Perimetro = " + retangulo.perimetro());
		System.out.println("Diagonal = " + retangulo.diagonal());
	}

}
