package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Studente;

public class RegistroCtrl {

	/*
	 * Sviluppa i seguenti metodi
	 * caricaStudentiDaFile()
	 * 
	 * ***aggiungiStudenteAFile()***
	 * 
	 * 
	 * faiAppello() chiede se lo studente è presente o assente. Lo stud è presente? Y/N
	 * stampaPresenti()
	 * stampaAssenti()
	 */
	
	private ArrayList<Studente> studenti;
	private List<Studente> presenti;
	private List<Studente> assenti;
	
	

	public RegistroCtrl() {
		this.studenti = new ArrayList<Studente>();
		this.presenti = new ArrayList<Studente>();
		this.assenti = new ArrayList<Studente>();		
		
	}
	
	public void caricaStudenteDaFile() {
		File elencoStudenti = new File("elencoStudentiTSS.csv");
		
		try {
			Scanner sc = new Scanner(elencoStudenti);
			
			while(sc.hasNextLine()) {
				String riga = sc.nextLine();
				String[] separate = riga.split(",");
				String cognome = separate[0];
				String nome = separate[1];
				String corso = separate[2];
				Integer matricola = Integer.parseInt(separate[3]);
				Studente studente = new Studente(cognome, nome, corso, matricola);
				this.studenti.add(studente);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Non ho trovato il file. Controlla la posizione");
			e.printStackTrace();
		}
	}
	
	public ArrayList<Studente> getStudenti(){
		return studenti;
	}
	
	public Studente getSingoloStudente(int indice) {
		return studenti.get(indice);
	}
	
	public void stampaElencoStudenti() {
		for (Studente studente : studenti) {
			System.out.println(studente.stampa());
		}
	}
	
	public void faiAppello() {
		 Scanner scanner = new Scanner(System.in);
	        char scelta;

	        presenti.clear();
	        assenti.clear();

	        for(Studente studente : studenti) {
	            do{ 
	                System.out.println(studente.stampa());
	                System.out.print("Il seguente studente è presente? p/a --> ");
	                scelta = scanner.next().toLowerCase().charAt(0);
	            }while(scelta != 'p' && scelta != 'a');
	            if(scelta == 'p') {
	                presenti.add(studente);
	            }else {
	                assenti.add(studente);
	            }
	        }

	        System.out.println("Appello completato.");
	        
	        System.out.println("\nGli studenti presenti sono:");
	        for (Studente s : presenti) {
	            System.out.println(s.getMatricola() + " - " + s.getNome() + " " + s.getCognome());
	        }
	        System.out.println("\nGli studenti assenti sono:");
	        for (Studente s : assenti) {
	        	System.out.println(s.getMatricola() + " - " + s.getNome() + " " + s.getCognome());
	        }
	}
	
}
