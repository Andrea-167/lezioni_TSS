
package lezione08_Incapsulamento;

import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		
		//Invoco il costruttore perché public
		Studente stud1 = new Studente("Maria", "Verdi", 2025);
		
		//posso leggere le prop solo perché ho i metodi get
		System.out.println(stud1.getNome());
		System.out.println(stud1.getCognome());
		System.out.println(stud1.getNumMatricola());
		System.out.println(stud1.toString());
		
		Studente stud2 = new Studente("Mario", "Rossi", 2024);
		System.out.println(stud2.toString());
		
		Studente stud3 = new Studente("Laura", "Verdi", 2025);
		stud3.setPresente("1234", false);
		System.out.println(stud3.toString());
		
		//CORSO
		Corso corso1 = new Corso(); //creo un corso vuoto e utilizzo i metodi Set per valorizzare le prop
		corso1.setDescrizione("Java e Javascript");
		corso1.setDurataCorso(750);
		corso1.setStudenti(10);
		corso1.inserisciStudente(stud1);
		corso1.inserisciStudente(stud2);
		corso1.inserisciStudente(stud3);		
		System.out.println( corso1 );
		
		
		//ZAINO
		Zaino seven = new Zaino("Invicta", "blu", 6);
		
		seven.inizializzaCose();
		
		
		seven.inserisciCose(new Oggetto("Bottiglia", "Acqua", 1));
		seven.inserisciCose(new Oggetto("Panino", "Pomodoro e Tonno", 0.6));
		seven.inserisciCose(new Oggetto("Diario", "Smemoranda", 2));
		
		seven.elencaContenuto();
		
		System.out.println(seven.calcolaVolumeOccupato());
		
		
		//RESPO CORSO
		RespoCorso respoEgle = new RespoCorso();
		
		respoEgle.setNomeRespo("Egle Risola");
		respoEgle.setEmail("egle.risola@immaginazioneelavoro.it");
		respoEgle.setMatricola(1);
		ArrayList<String> corsi = new ArrayList<String>();
		corsi.add("TSS");
		corsi.add("TPPW");
		corsi.add("SR");
		respoEgle.setCorsiAssegnati(corsi);
		
		System.out.println("Nome respo corso: " + respoEgle.getNomeRespo());
		System.out.println(respoEgle);
		
	}
}
