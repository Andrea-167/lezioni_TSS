package lezione09_Ereditarietà;


//Questa è la mia superclasse
public class Veicolo {

	//campi dichiarati protected fanno si che queste proprietà vengano viste solo dalla classe stessa e da chi eredita
	protected String marca;
	protected String modello;
	protected int annoProd;
	protected int numRuote;
	
	//costruttore
	public Veicolo(String marca, String modello, int annoProd, int numRuote) {
		this.marca = marca;
		this.modello = modello;
		this.annoProd = annoProd;
		this.numRuote = numRuote;
	}
	
	//metodi
	public void start() {
		System.out.println("Hai avviato il veicolo");
	}
	
	public void stop() {
		System.out.println("Hai fermato il veicolo");
	}

	public void mostraInfo() {
		System.out.println("Veicolo: " + this.marca + " " + this.modello + " (anno: " +this.annoProd + ")" + " Numero ruote: " + this.numRuote);
	}
	
	@Override
	public String toString() {
		return "Veicolo [marca= " + marca + ", modello= " + modello + ", annoProd= " + annoProd + "]";
	}
	
	
	
}
