package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Registro;
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
	
	private List<Studente> presenti = new ArrayList<Studente>();
	private List<Studente> assenti = new ArrayList<Studente>();
	private Registro registro;
	
	public RegistroCtrl() {
		
	}
	
	public RegistroCtrl(Registro registro) {
		this.registro = registro;
	}
	
	public void caricaStudentiDaFile() {
		
		File fileElenco = new File("elencoStudentiTSS.csv");
	
		try {
			Scanner input = new Scanner(fileElenco);
			
			while(input.hasNextLine()){
				String line = input.nextLine();
				String[] elementi = line.split(",");
				String nomeStud = elementi[0];
				String cognomeStud = elementi[1];
				String nomeCorso = elementi[2];
				Integer matricola = Integer.parseInt(elementi[3]);
				
				Studente s = new Studente(nomeStud, cognomeStud, nomeCorso, matricola);
				this.registro.aggiungiStudente(s);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Non ho trovato il file. Controlla la posizione");
			e.printStackTrace();
		}
	}
	
	public void faiAppello() {
		Scanner input = new Scanner(System.in);
		
		char scelta;
	
		 presenti.clear();
	        assenti.clear();

	        for(Studente studente : this.registro.getStudenti()) {
	            do{ 
	                System.out.println(studente);
	                System.out.print("Il seguente studente è presente o assente? p/a --> ");
	                scelta = input.next().toLowerCase().charAt(0);
	            }while(scelta != 'p' && scelta != 'a');
	            if(scelta == 'p') {
	            	studente.setPresenza("Presente");
	                presenti.add(studente);
	            }else {
	            	studente.setPresenza("Assente");
	                assenti.add(studente);
	            }
	        }
	        
	        System.out.println("----REGISTRO COMPLETATO----");

	        for (Studente studente : this.registro.getStudenti()) {
				System.out.println(studente.getnMat() + " - " + studente.getNome() + " " + studente.getCognome() + " - " + studente.getPresenza());
			}
	        
	}
	
	public void aggiungiStudenteSuFile(Studente s, String pathFile) {
		File fileElenco = new File(pathFile);
		
		if(s.equals(null)) {
			throw new IllegalArgumentException();
		}else {
			try {
				String nome = s.getNome();
				String cognome = s.getCognome();
				String corso = s.getCorso();
				Integer nMat = s.getnMat();
				
				// il secondo parametro true serve a fare l'append al file gia esistente
				//se non metto il true creo un nuovo file
				FileWriter fW = new FileWriter(pathFile, true);
				
				fW.write("\n" + nome + "," + cognome + "," + corso + "," + nMat);
				fW.close();
				
				this.registro.aggiungiStudente(s);
				System.out.println("Studente " + s + "\nAggiunto con successo");
				
			} catch (Exception e) {
				System.out.println("Non sono in grado di scrivere sul file: ");
				e.printStackTrace();
			}
		}
		
	}
	
	
}
