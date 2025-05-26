package esercizio;

public class Programmatore extends Dipendente {

	private String linguaggio;
	
	public Programmatore(String nome, String cognome, int livello, String linguaggio) {
		super(nome, cognome, livello, Ruoli.Programmatore);
		this.linguaggio = linguaggio;
	}

	public double calcolaStipendio() {
		return StipendioBase * 2.8;
	}

	@Override
	public void stampaInfo() {
		super.stampaInfo();
		System.out.println("Ruolo: Programmatore, Linguaggio: " + this.linguaggio);
	}

	
}
