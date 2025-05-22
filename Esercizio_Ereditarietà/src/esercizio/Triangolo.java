package esercizio;

public class Triangolo extends Formule {

	private double base;
	private double lato1;
	private double lato2;
	private double altezza;
	

	public Triangolo(double base, double lato1, double lato2, double altezza) {
		if(base <= 0 || lato1 <= 0 || lato2 <= 0) {
			throw new IllegalArgumentException("I lati del triangolo devono essere positivi");
		}
		
		this.base = base;
		this.lato1 = lato1;
		this.lato2 = lato2;
		this.altezza = altezza;
	}

	@Override
	public double calcolaPerimetro() {
		return base + lato1 + lato2;
	}
	
	@Override
	public double calcolaArea() {
			return (base * altezza) / 2;
		}



	public double getBase() {
		return base;
	}



	public double getLato1() {
		return lato1;
	}



	public double getLato2() {
		return lato2;
	}



	public double getAltezza() {
		return altezza;
	}

}
