package lezione02_Statement;

import java.util.Scanner;

public class EsamiUniversita {

	//crea un programma per valutare gli esami all'università
	//l'esame scritto fa da sbarramento per l'esame orale
	
	public static void main(String[] args) {
		
		final int VOTO_MIN = 1;
		final int VOTO_MAX = 30;
	
		Scanner mioScann = new Scanner(System.in);
		System.out.println("Inserisci il voto del tuo esame scritto");
		
		int votoScritto = mioScann.nextInt();
		
		if(votoScritto >= VOTO_MIN && votoScritto <= VOTO_MAX) {
		
			if (votoScritto >= 18) {
				System.out.println("Voto scritto: " + votoScritto + " . Puoi sostenere l'esame orale");
				
				System.out.println("Inserisci il voto del tuo esame orale");
				int votoOrale = mioScann.nextInt();
				
				if(votoOrale >= VOTO_MIN && votoOrale <= VOTO_MAX) {
					if (votoOrale >= 18) {
						System.out.println("Voto orale: " + votoOrale);
						double votoFinale = Math.round((double)(votoScritto + votoOrale)/2);
						System.out.println("Voto finale: " + votoFinale);	
					}else {
						System.out.println("Mi spiace, non hai superato l'esame orale quindi non hai superato l'esame!!");
					}
				}else {
					System.out.println("Voto orlae inserito non valido");
				}
			}else {
				System.out.println("Mi spiace, non puoi sostenere l'orale");
			}
		}else {
			System.out.println("Voto scritto non valido");
		}
		
		
	}
}