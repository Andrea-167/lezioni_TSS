package lezione09_Ereditarietà;

public class Motocicletta extends Veicolo{

	private String tipo;

	public Motocicletta(String marca, String modello, int annoProd, String tipo) {
		super(marca, modello, annoProd, 2);
		this.tipo = tipo;
	}

	@Override
	public void start() {
		System.out.println("Hai avviato la tua motocicletta");
	}

	@Override
	public void mostraInfo() {
		super.mostraInfo();
		System.out.println("Tipo di moto: " + this.tipo);
	}

	//posso anche avere metodi tipici solo di questa classe
	
	public void impenna() {
		System.out.println("VROOOOO sto impennando la moto");
	}
	
	
}
