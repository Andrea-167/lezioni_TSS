package model;

import java.util.ArrayList;
import java.util.List;

public class Registro {

	/*
	 * nomeCorso
	 * studenti
	 * 
	 * getStudenteByMatricola(numMat)
	 * 
	 * aggiungiStudenteAlCorso() **ATT**
	 */
	
	private String nomeCorso;
	private ArrayList<Studente> studenti = new ArrayList<Studente>();
	
	public Registro(String nomeCorso) {
		this.nomeCorso = nomeCorso;
	}

	public String getNomeCorso() {
		return nomeCorso;
	}

	public ArrayList<Studente> getStudenti() {
		return studenti;
	}
	
	public Studente getStudByMat(int nMat) {
		for (Studente s : studenti) {
			if(s.getnMat() == nMat) {
				return s;
			}
		}
		
		return null;
	}
	
	public void aggiungiStudente(Studente s) {
		this.studenti.add(s);
	}
	
}
