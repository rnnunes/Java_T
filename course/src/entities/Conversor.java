package entities;

public class Conversor {
	
	public double vlr_Dol;
	public double compra_Dol;
	
	public double conversao() {
		return (((compra_Dol * 6)/100) + compra_Dol) * vlr_Dol;
	}
}
