package model;

public class Studente implements Comparable<Studente>{

	/*
	 * nome
	 * cognome
	 * matricola
	 * corso
	 * contatore (se serve)
	 * 
	 */
	
	private String nome;
	private String cognome;
	private int matricola;
	private String corso;
	
	public Studente(String cognome, String nome, String corso, int matricola) {
		this.cognome = cognome;
		this.nome = nome;
		this.matricola = matricola;
		this.corso = corso;
	}

	public String stampa() {
		return this.cognome + " - " + this.nome + " del corso: " + this.corso; 
	}
	
	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public int getMatricola() {
		return matricola;
	}

	public String getCorso() {
		return corso;
	}

	@Override
	public String toString() {
		return "Studente [nome=" + nome + ", cognome=" + cognome + ", corso=" + corso
				+ "]";
	}
	@Override
	public int compareTo(Studente s) {
		return 0;
	}
	
	
}
