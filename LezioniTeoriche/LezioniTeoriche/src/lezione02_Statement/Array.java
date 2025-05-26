package lezione02_Statement;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		
		//array: contenitore di elementi simili tra loro. prop principale: 		sono 0-based
		//gli array sono contenitori a lunghezza fissa
		
		String[] colori = new String[5];
		
		//per ogni indice assegno un valore
		colori[0] = "Rosso";
		colori[1] = "Giallo";
		colori[2] = "Blu";
		colori[3] = "Rosa";
		colori[4] = "Verde";
		//colori[5] = "Nero"; //sto sfondando l array
		
//		System.out.println(colori[0]);
//		System.out.println(colori[1]);
//		System.out.println(colori[2]);
//		System.out.println(colori[3]);
//		System.out.println(colori[4]);
//		System.out.println(colori[5]);
		
		//leggo, ciclo, stampo i valori dell'array utilizzando un ciclo for
		//length è una proprietà degli array
		System.out.println("Lunghezza dell'array: " + colori.length);
		
		for(int i = 0; i < colori.length; i++) {
			System.out.println(colori[i]);
		}
		
		//potrei utilizzare il metodo toString()
		//System.out.println(colori.toString());
		
		//sintasssi abbreviata
		
		int[] numeriCasuali = {5,6,8,9,2,1}; //non devo dichiarare attraverso new
		
		//att: che il numero è il singolo valore dell'array non è piu l' indice
		for(int numero: numeriCasuali) {
			System.out.println(numero);
		}
		
		//creao un array con una dimensione inserita dall'utente

		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci la dimensione dell'array");
		
		int dimArr = input.nextInt();
		
		int[] mioArr = new int[dimArr];
		
		int indice = 0;
		
		do {
			System.out.println("Inserisci un intero");
			mioArr[indice] = input.nextInt();
			indice++;
		}while(mioArr.length > indice);
		
		//leggo l'array
		for (int num:mioArr) {
			System.out.println(num);
		}
		
		//ordinare in modo crescente l'array di numeri casuali
		System.out.println("Ordino array numeri casuali");
		Arrays.sort(numeriCasuali);
		
		for (int num : numeriCasuali) {
			System.out.println(num);
		}
		System.out.println(Arrays.toString(numeriCasuali));
		
	}
}