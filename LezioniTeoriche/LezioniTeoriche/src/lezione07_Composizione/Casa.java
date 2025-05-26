package lezione07_Composizione;

import java.util.ArrayList;
import java.util.List;

public class Casa {

	String indirizzo;
	List<Stanza> stanze = new ArrayList<Stanza>();
	
	public Casa(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	
	public void aggiungiStanza(Stanza stanza) {
		this.stanze.add(stanza);
	}
	
	public void visualizzaStanze() {
		System.out.println("Stanze nella casa in " + indirizzo + ":");
		for(Stanza stanza: stanze) {
			System.out.println("- " + stanza.nome + " " + stanza.area + " mq");
		}
		System.out.println("Area totale: " + areaCasa() + " mq");
	}
	
	private double areaCasa() {
		double areaTotale = 0;
		
		for(Stanza stanza: stanze) {
			areaTotale += stanza.area;
		}
		return areaTotale;
	}
	
	
}
