package esercizio;

public class Rettangolo extends Formule{

	private double base;
	private double altezza;
	
	
	public Rettangolo(double base, double altezza) {
		if(base <= 0 || altezza <= 0) {
			throw new IllegalArgumentException("La base e l'altezza devono essere positivo");
		}
		this.base = base;
		this.altezza = altezza;
	}
	
	@Override
	public double calcolaPerimetro() {
		return 2 * (base + altezza);
	}
	
	@Override
	public double calcolaArea() {
		return base * altezza;
	}

	public double getBase() {
		return base;
	}

	public double getAltezza() {
		return altezza;
	}
	
}
