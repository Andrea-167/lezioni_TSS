package lezione09_Ereditarietà;

//per mettere in atto l'ereditarietà uso la parola chiave extends
public class Automobile extends Veicolo{
	
	//prop aggiuntiva
	private int numPorte;
	
	public Automobile(String marca, String modello, int annoProd, int numRuote, int numPorte) {
		//super chiama il costruttore della superclasse quindi di Veicolo
		super(marca, modello, annoProd, numRuote);
		this.numPorte = numPorte;
	}

	public void accendiAC() {
		System.out.println("Sto accendendo AC della mia automobile");
	}

	
	//sovrascrivo i metodi della mia superclasse, non è obbligatorio
	
	@Override
	public void start() {
		System.out.println("Hai messo in moto la tua Automobile");
	}
	//non sovrascirvo lo stop

	
	//sovrascrivo il metodo mostraInfo() aggiungendo un pezzo
	
	@Override
	public void mostraInfo() {
		super.mostraInfo();
		System.out.println("Numero porte: " + this.numPorte);
	}
	
	
}
