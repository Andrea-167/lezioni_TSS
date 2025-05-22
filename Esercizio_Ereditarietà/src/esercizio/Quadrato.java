package esercizio;

public class Quadrato {

	private double lato;

	public Quadrato(double lato) {
		if(lato <= 0) {
			throw new IllegalArgumentException("Il lato deve essere positivo");
		}
		this.lato = lato;
	}
	
	public double calcolaPerimetro() {
		return lato * 4;
	}
	
	public double calcolaArea() {
		return lato * lato;
	}

	public double getLato() {
		return lato;
	}
	
}
