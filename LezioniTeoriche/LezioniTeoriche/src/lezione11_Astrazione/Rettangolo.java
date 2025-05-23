package lezione11_Astrazione;

public class Rettangolo extends FormaGeometrica {

	private double larghezza;
	private double lunghezza;
	
	//ATT sono obbligato a dichiarare il costruttore poicheè nella superclasse ho dichiarato il costruttore non di default... regola generale
	public Rettangolo(Colore colore, double larghezza, double lunghezza) {
		super("Rettangolo", colore);
		this.larghezza = larghezza;
		this.lunghezza = lunghezza;
	}

	@Override
	double calcolaPerimetro() {
		return 2 * (this.larghezza + this.lunghezza);
	}

	@Override
	double calcolaArea() {
		return this.larghezza * this.lunghezza;
	}

}
