package lezione03_metodi;

import java.util.Scanner;

public class Intro {

//Metodo: termine legato alla OOP
//servono a wrappare codice, mettere codice sotto un unico nome
//Permettono di scomporre un problema in sottoproblemi
//re-use del codice
	
/*
 * SINTESSI
 * 
 * static: il metodo appartiene alla classe e non all'istanza
 * 
 * (modificatori)(tipo restituito)(nome del metodo)(Argomenti)
 * 
 *(						FIRMA DEL METODO					 )
 * 
 * public static 		void			main	(String[]args){
 * 
 * ...body del metodo...
 * 
 * OPZIONALE:
 * return qualcosa; (il return restituisce qualcosa)
 * }
 */
	
	public static void main(String[] args) {
		System.out.println("Ciao dal metodo main");
		
		//richiamo salutaUser()
		//Uso la logica funzionale poiché ho indipendenza tra dichiarazione e richiamo del metodo
		salutaUser();
		
		//al metodo sotto devo passare un argomento, un parametro o più
		salutaDocente("Pierluigi", "Pierantola", 61);
		salutaDocente("Pippo", "Rossi");
		salutaDocente("Anna Lanzullo");
		salutaDocente();
		
		}
	
	//QUesto è un metodo
	public static void salutaUser() {
		System.out.println("Ciao, Dario! ");
		System.out.println("Qual è il tuo congonome?");
		Scanner in = new Scanner(System.in);
		System.out.println("Allora ciao, Dario " + in.nextLine());
	}
	
	
	public static void salutaDocente(String nomeDoc, String cognomeDoc) {
		System.out.println("Buongiorno docente " + nomeDoc + " " + cognomeDoc);
		//non sono obbligato ad usare etaDoc
	}
	
	//OVERLOADING: sovraccarico del metodo per poter avere piu o meno dei parametri
	public static void salutaDocente(String nomeDoc, String cognomeDoc, int etaDoc) {
		System.out.println("Esimio docente " + nomeDoc + " " + cognomeDoc + ". Adesso so anche quanti anni hai!!");
		int etaPensione = 65;
		int anniRestanti = etaPensione - etaDoc;
		System.out.println("Le mancano " + anniRestanti + " alla pensione");	
	}
	
	public static void salutaDocente(String nomeCognome) {
		System.out.println("Buongiorno docente " + nomeCognome);
	}
	
	public static void salutaDocente() {
		System.out.println("Buongiorno docente");
	}
	
	
}
