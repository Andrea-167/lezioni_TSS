package esercizio;

public class Segretario extends Dipendente {

	private String ufficio;

	public Segretario(String nome, String cognome, int livello, String ufficio) {
		super(nome, cognome, livello, Ruoli.Segretario);
		this.ufficio = ufficio;
	}

	@Override
	public double calcolaStipendio() {
		return StipendioBase * 1.5;
	}

	@Override
	public void stampaInfo() {
		super.stampaInfo();
		System.out.println("Ruolo: Segretario, Ufficio: " + this.ufficio);
	}

	
}
