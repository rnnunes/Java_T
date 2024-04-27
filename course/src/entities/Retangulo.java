package entities;

public class Retangulo {
	
	public double base;
	public double alt;
	
	public double area() {
		return base * alt;
	}
	
	public double perimetro() {
		return 2 * (base + alt);
	}
	
	public double diagonal() {
		double diag1 = ((base * base) + (alt * alt));
		return Math.sqrt(diag1);
	}
}
