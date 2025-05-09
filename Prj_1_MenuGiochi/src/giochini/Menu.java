package giochini;

import java.util.Scanner;

public class Menu {
	
	public static void multipli() {
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println(i + " BANGARANG");
			}else if(i % 3 == 0) {
				System.out.println(i + " BOOM");
			}else if(i % 5 == 0) {
				System.out.println(i + " ZOOM");
			}else {
				System.out.println(i);
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner mioScann = new Scanner(System.in);
		char scelta;
		
		do {
		
			System.out.println("----MENU----");
			System.out.println("1. Gioco1");
			System.out.println("2. Gioco2");
			System.out.println("3. Gioco3");
			System.out.println("Q. Esci");
			System.out.println("----------");
		
			scelta = mioScann.next().charAt(0);
		
			switch(scelta) {
			case '1':
				System.out.println("Hai scelto il gioco 1 - Il gioco dei multipli");
				//multipli
				//stampa i numeri da 1 a 100. per tutti i multipli di 3 stampa BOOM. per tutti i multipli di 5 stampa ZOOM. per tutti i multipli di 3 e 5 stampa BANGARANG
				
				//modo 1: posso scrivere qui dentro tutta la logica
				// for con if
				
				//modo 2: posso creare un metodo ausiliare in questa classe
				multipli();
				//modo 3:; posso creare una classe a pare con dei metodi e richiamarli
				
				
				
				break;
			case '2':
				System.out.println("Hai scelto il gioco 2");
				//pattern
				//elabora un algoritmo per stampare il seguente Star pattern
				/*
				 * @
				 * @@
				 * @@@ 
				 * @@@@
				 * @@@@@ 
				 */
				Triangolo.disegnaTriangolo();
				break;
			case '3':
				System.out.println("Hai scelto il gioco 3 - Il gioco della Tombola");
				//tombola
				//ricrea il gioco della tombola. da un set di 90 numeri estraine 20. mi raccomando non posso estrarre 2 volte lo stesso numero
				Scanner input = new Scanner(System.in);
				System.out.println("Quanti numeri vuoi estrarre ? ");
				Tombola.estrazione3(input.nextInt());
				break;
			case 'q':
				System.out.println("Stai uscendo dal programma...");
				break;
				
			default:
					System.out.println("Scusa non capisco questo comando");
					
			}
			
			
		}while(scelta != 'q' && scelta != 'Q');
		
		System.out.println("Ciao, alla prossima partita !");
		
		
	}
}
