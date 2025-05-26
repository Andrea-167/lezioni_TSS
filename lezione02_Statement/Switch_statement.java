package lezione02_Statement;

import java.util.Scanner;

public class Switch_statement {
	public static void main(String[] args) {
		
		//switch: mi permette di valutare, in base ai cas, il valore di una variabile
		
		int giornoSettimana = 2;
		
		switch(giornoSettimana) {
		case 1:
			System.out.println("Lunedì");
			break;
		case 2:
			System.out.println("Martedì");
			break;
		case 3:
			System.out.println("Mercoledì");
			break;
		case 4:
			System.out.println("Giovedì");
			break;
		case 5:
			System.out.println("Venerdì");
			break;
		case 6:
			System.out.println("Sabato");
			break;
		case 7:
			System.out.println("Domenica");
			
			Scanner input = new Scanner(System.in);
			System.out.println("Se questa è l'ultima domenica del mese inserisci 0");
			int ultimaDomenica = input.nextInt();
			if(ultimaDomenica == 0) {
				System.out.println("Questa è l'ultima domenica. Esprimi un desiderio");
			}
			break;
		default:
			System.out.println("Non riconosco questo valore");
			break;
		}
		
		
	}
}
