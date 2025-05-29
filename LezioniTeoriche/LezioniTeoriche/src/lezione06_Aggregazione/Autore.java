package lezione06_Aggregazione;

public class Autore {

	String nome;
	String cognome;
	
	public Autore(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}

	@Override
	public String toString() {
		return "Autore [" + nome + ", " + cognome + "]";
	}
	
	
}
