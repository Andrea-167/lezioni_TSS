//Commenti
//package definisce la directory nella quale troviamo il file.java
package hello;


public class Hello {

	public static void main(String[] args) {
		
//		Questi sono metodi Syso per stampare un saluto		
		System.out.println("Hello, world!");
		System.out.println("Corso di Tecnico Sviluppo Software");
		
//		dichiaro una serie di variabili
		String mioNome = "Andrea";
		String mioCognome = "Mancuso";
		String nomeCorso = "TSS-2025";
		
//		Concateno una serie di variabili di tipo String		
		String benvenuto = "Ciao, "+ mioNome + " " + mioCognome + ". Sei iscitto al corso " + nomeCorso;
//		Stampo richiamando la variabile benvenuto		
		System.out.println(benvenuto);
		
//		facio un calcolo
		int numero1 = 10;
		int numero2 = 8;
		
		int somma = numero1 + numero2;
		String risultato = "La somma vale " + somma;
		System.out.println(risultato);
		
		int prodotto = numero1 * numero2;
		System.out.println("Il prodotto vale " + prodotto);
		
		int differenza = numero1 - numero2;
		System.out.println("La differenza vale " + differenza);
		
		double quoziente = (double) numero1 / (double) numero2;
		System.out.println("Il quoziente vale " + quoziente);
		
		/**
		 * vi
		 * permette
		 * di
		 * andare
		 * a
		 * capo
		 */
	}
	
}
