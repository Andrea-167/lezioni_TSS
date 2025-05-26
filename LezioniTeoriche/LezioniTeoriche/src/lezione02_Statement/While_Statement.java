package lezione02_Statement;

import java.util.Scanner;

public class While_Statement {
	public static void main(String[] args) {
		//while: cicli indefiniti
		
		//while(condizione){
		// ...esegui se condizione è true
		// }
		
		//esempio. replico un for con un while
		int i = 0;
		
		while(i < 10) {
			System.out.println("Ciao " + i);
			i++;
		}
		
		System.out.println("DO-WHILE");
		
		//prima eseguo qualcosa poi lo controllo. almeno una volta faccio l'operazione
		int d = 30;
		
		do {
			int risultato = d * 5;
			System.out.println(" 5 x " + d  + " = " + risultato);
			d++;
		}while(d <10);
		
		
		//esempio concreto
		Scanner scan = new Scanner(System.in);
		
		String parola = "";
		int tentativi = 0;
		
		while(!parola.equals("Ciaobello")) {
			tentativi++;
			System.out.println("Parola d'ordine errata");
			parola = scan.nextLine();
		}
		
		System.out.println("Benvenuto");
		System.out.println("Per entrare hai impiegato " + tentativi +  " tentativi");
		
	}
}
