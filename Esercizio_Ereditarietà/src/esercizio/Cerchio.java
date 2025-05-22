package esercizio;

public class Cerchio extends Formule {

	private double raggio;
	
	public Cerchio(double raggio) {
		if(raggio <= 0) {
			throw new IllegalArgumentException("Il raggio deve essere positivo");
		}
		this.raggio = raggio;
	}
	

	public double calcolaPerimetro() {
		return 2 * Math.PI * raggio;
	}
	
	@Override
	public double calcolaArea() {
		return Math.PI * Math.pow(raggio, 2);
	}

	public double getRaggio() {
		return raggio;
	}
}
