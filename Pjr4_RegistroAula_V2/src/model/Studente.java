package model;

import java.util.Random;

public class Studente {
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
	private int nMat;
	private String corso;
	private String presenza;
	private String token;
	private static int contatore = 1; //essendo static il contatore rimane in questa classe Studente e non viene portato oltre
	
	public Studente(String nome, String cognome, String corso, int nMat) {
		this.nome = nome;
		this.cognome = cognome;
		this.corso = corso;
		this.nMat = nMat;
		this.token = tokenizer();
		contatore++;
	}
	
	//questa classe static non puo accedere a membri non statici. non posso usare this, non posso usare super(), non posso fare l'override
//	private static String tokenizer() {
//		Random numRand = new Random();
//		Double numD = numRand.nextDouble();
//		return numD.toString();
//	}
	
	private String tokenizer() {
		String token = "";
		token += this.nome.toUpperCase().charAt(0) + "" + this.cognome.toUpperCase().charAt(0);
		
		Random r = new Random();
		Integer num = r.nextInt(100);
		token += num.toString() + this.contatore;
		
		return token;
	}
	
	

	public String getPresenza() {
		return presenza;
	}

	public void setPresenza(String presenza) {
		this.presenza = presenza;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getnMat() {
		return nMat;
	}

	public void setnMat(int nMat) {
		this.nMat = nMat;
	}

	public String getCorso() {
		return corso;
	}

	public void setCorso(String corso) {
		this.corso = corso;
	}
	
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Override
	public String toString() {
		return "Studente [nome=" + nome + ", cognome=" + cognome + ", nMat=" + nMat + ", corso=" + corso + ", token="
				+ token + "]";
	}
	
	
	
}
