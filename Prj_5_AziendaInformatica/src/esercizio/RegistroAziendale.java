package esercizio;

import java.util.ArrayList;
import java.util.List;

public class RegistroAziendale {

	private List<Dipendente> dipendenti;
	
	public RegistroAziendale() {
		this.dipendenti = new ArrayList<>();
	}
	
	public void aggiungiDipentente(Dipendente dipendete) {
		this.dipendenti.add(dipendete);
	}
	
	public void pagaStipendi() {
		for (Dipendente dipendente : dipendenti) {
			double stipendio = dipendente.calcolaStipendio();
			System.out.printf("Stipendio di %s %s (%s): €%.2f%n",
                    dipendente.getNome(), dipendente.getCognome(),
                    dipendente.getClass().getSimpleName(), stipendio);
		}
	}
	
	public void stampaTuttiIDipendenti() {
        System.out.println("\n--- Tutti i Dipendenti ---");
        if (dipendenti.isEmpty()) {
            System.out.println("Nessun dipendente registrato.");
            return;
        }
        for (Dipendente dipendente : dipendenti) {
            dipendente.stampaInfo();
            System.out.println("---------------");
        }
    }
	
	public void StampaPerRuolo(Ruoli ruolo) {
		System.out.println("----Stampa per ruolo----");
		for (Dipendente dipendente : dipendenti) {
			if(dipendente.ruolo.equals(ruolo)) {
				System.out.println(dipendente);
			}
		}
	}
	
	
}
