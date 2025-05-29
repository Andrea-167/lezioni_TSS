package lezione05_RelazioneTraClassi;

public class Main {

	public static void main(String[] args) {
		
		//Istanzio degli oggetti di tipo punto
		Punto P1 = new Punto(2, 2);
//		System.out.println(P1.toString());;
		System.out.println(P1);
		
		Punto P2 = new Punto(3, 3);
		
		Segmento seg1 = new Segmento(P1, P2);
		System.out.println(seg1);
		System.out.println(seg1.calcolaLunghezza());
	}
}
