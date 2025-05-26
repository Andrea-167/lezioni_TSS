package lezione04_Classi;

public class Persona {

	/**
	 * class è un modello, un progetto, il blueprint per la
	 * creazione ad oggetti
	 * la classe definisce un tipo di dato complesso
	 * l'istanza della classe è un oggetto
	 */	
	
	//STATO dell classe. Caratteristiche
	public String nome;
	public String cognome;
	public int eta;
	public double altezza;
	public int matricola;
	
	
	//Metodo costruttore
	//Deve avere lo stesso identico nome della classe
	public Persona(String name, String surname, int age, double height, String id) {
		this.nome = name + " " + id;
		this.cognome = surname;
		this.eta = age;
		this.altezza = height;
		this.matricola = matricolatore();
	}
	
	public int matricolatore() {
		int matricola = (int) Math.ceil(Math.random() * 100);
		return matricola;
	}
	
}
