package view;

import controller.RegistroCtrl;
import model.Registro;
import model.Studente;

public class App {

	public static void main(String[] args) {
		
//		Registro registroCorso = new Registro("TSS");


		RegistroCtrl db = new RegistroCtrl();
		db.caricaStudenteDaFile();
		System.out.println("studenti");
		db.stampaElencoStudenti();
		
		System.out.println("APPELLO STUDENTI");
		db.faiAppello();
	}
}
