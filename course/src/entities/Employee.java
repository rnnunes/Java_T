package entities;

public class Employee {

	public String name;
	public double salGrosso;
	public double tax;
	
	
	
	
	public void aumentoSal(double percent) {
		salGrosso = ((percent/100) * salGrosso) + salGrosso;
	}
	
	public double salLiq() {
		return salGrosso - tax;
	}
	
}
