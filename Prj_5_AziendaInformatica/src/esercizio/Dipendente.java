package esercizio;

public abstract class Dipendente {

	private String nome;
	private String cognome;
	private int livello;
	protected Ruoli ruolo;
	protected static final double StipendioBase = 1000.0; //costante
	
	
	public Dipendente(String nome, String cognome, int livello, Ruoli ruolo) {
		this.nome = nome;
		this.cognome = cognome;
		this.livello = livello;
		this.ruolo = ruolo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public int getLivello() {
		return livello;
	}
	
	public abstract double calcolaStipendio();
	
	public void stampaInfo() {
		System.out.println("Nome: " + this.nome + ", Cognome: " + this.cognome + ", Livello: " + this.livello);
	}

	@Override
	public String toString() {
		return "Dipendente [nome= " + nome + ", cognome= " + cognome + ", livello= " + livello + ", ruolo= " + ruolo + "]";
	}
	
	
}
