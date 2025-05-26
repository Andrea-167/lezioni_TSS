package lezione02_Statement;

public class Recap {
	public static void main(String[] args) {
//		le variabili sono aree di memoria alle quali associamo un nome
/*
 * 		regole di denominazione:
 * 		- non possoo cominciare con numeri
 * 		- possono contenere numeri e lettere
 * 		- no keyword Jave (private, default, byte, final)
 * 		-solitamente in camelCase
 * 		la dichiarazione è indipendente dalla valorizzazione
 * 
 */
//		String nomeCorso ="TSS-2025";
		String nomeCorso;
		
		//assegno
		nomeCorso = "TSS_2025";
		
		//leggo e stampo
		System.out.println(nomeCorso);
		
		//riassegno
		nomeCorso = "TSS_2026";
		
		System.out.println(nomeCorso);
		
		//TIPI PRIMITIVI
		int numeroStudenti = 11;
		double metaStudenti = 5.5;
		
		byte num1 = 10;
		char lettera = 'f';
		boolean piove = true;
		
		//COSTANTI, non possono essere riassegnate. final è un MODIFICATORE
		final double PI = 3.14;
		final double IVA = 0.22;
		
		final int MAX_VALUE = 100;
		final int MIN_VALUE = 1;
		
		//MIN_VALUE = 2; errore, poichè non le posso riassegnare
		
		
		
		
	}
}
