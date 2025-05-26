package esercizio;

public class HR extends Dipendente {
	
	private String areaSpecializzazione;

	public HR(String nome, String cognome, int livello, String areaSpecializzazione) {
		super(nome, cognome, livello, Ruoli.HR);
		this.areaSpecializzazione = areaSpecializzazione;
	}

	@Override
	public double calcolaStipendio() {
		return StipendioBase * 3.4;
	}

	@Override
	public void stampaInfo() {
		super.stampaInfo();
		System.out.println("Ruolo: HR, Area Specializzazione: " + this.areaSpecializzazione);
	}

}
