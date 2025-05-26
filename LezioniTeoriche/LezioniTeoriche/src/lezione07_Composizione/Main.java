package lezione07_Composizione;

public class Main {

	public static void main(String[] args) {
		
		Casa miaCasa = new Casa("Via Carlo Alberto 22");
		miaCasa.aggiungiStanza(new Stanza("Studio", 12));
		miaCasa.aggiungiStanza(new Stanza("Cucina", 20));
		miaCasa.aggiungiStanza(new Stanza("Bagno", 8));
		miaCasa.aggiungiStanza(new Stanza("Cameda da letto", 25));
		
		miaCasa.visualizzaStanze();
		
		//prop size() degli arraylist
		System.out.println("Nella mia casa ci sono: " + miaCasa.stanze.size());
 		
	}
}
