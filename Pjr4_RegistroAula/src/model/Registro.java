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
	private List<Studente> studenti = new ArrayList<Studente>();
	
	
	public Registro(String nomeCorso) {
		this.nomeCorso = nomeCorso;
		System.out.println("Corso TSS");
	}


	public String getNomeCorso() {
		return nomeCorso;
	}


	public List<Studente> getStudenti() {
		return studenti;
	}
	
	public void aggiungiStudenteAlCorso(Studente studente) {
		
			if(studenti.size() == 0) {
				studenti.add(studente);
			}else {
				boolean giaEsiste = false;
				for (Studente stud : studenti) {
					if(stud.compareTo(studente) == 0) {
						System.out.println("Hai aggiunto: " + studente.getCognome() + " " + studente.getNome() + " al corso: " + studente.getCorso());
						giaEsiste = true;
						break;
					}
				}
				if(!giaEsiste) {
					this.studenti.add(studente);
				}
			}
			
	}
	
	public Studente getStudenteByMatricola(Studente[] listaStudenti, int numStudenti) {
		Studente studTrovato = null;
		for(int i = 0; i <listaStudenti.length; i++) {
			if(listaStudenti[i] != null && listaStudenti[i].getMatricola() == numStudenti) {
				studTrovato = listaStudenti[i];
			}
		}
		return studTrovato;
	}
	
	
}
