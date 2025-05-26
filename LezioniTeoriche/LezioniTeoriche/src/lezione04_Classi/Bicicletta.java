package lezione04_Classi;

public class Bicicletta {

	//in questo caso sto direttamente assegnando delle proprietà
	final byte numeroRuote = 2;
	byte marcia = 6;
	int frequenza = 0;
	double velocita = 0;
	
	final String marca = "Cannondale";
	String modello = "C-Bike-ale";
	String tipoBici = new String("stradale");
	
	//in questo caso il costruttore me lo posso risparmiare
	
	public void accelera (int incFrequenza) {
		frequenza += incFrequenza;
		System.out.println("Stai acceleando. La frequenza attuale è: " + frequenza);
	}
	
	public void rallenta (int incFrequenza) {
		frequenza -= incFrequenza;
		System.out.println("Stai rallentando. La frequenza attuale è: " + frequenza);
	}
	
	public void calcoloVelocita() {
		velocita = frequenza * marcia;
		System.out.println("La tua vel attuale è: " + velocita);
	}

	@Override
	public String toString() {
		return "Bicicletta [numeroRuote=" + numeroRuote + ", marcia=" + marcia + ", frequenza=" + frequenza
				+ ", velocita=" + velocita + ", marca=" + marca + ", modell=" + modello + ", tipoBici=" + tipoBici + "]";
	}
	
	
	
}
