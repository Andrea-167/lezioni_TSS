package esercizio;

public class Manager extends Dipendente {

	private String reparto;
	
	public Manager(String nome, String cognome, int livello, String reparto) {
		super(nome, cognome, livello, Ruoli.Manager);
		this.reparto = reparto;
	}

	@Override
	public double calcolaStipendio() {
		return StipendioBase * 4.5;
	}

	@Override
	public void stampaInfo() {
		super.stampaInfo();
		System.out.println("Ruolo: Manager, Reparto: " + this.reparto);
	}
	
}
