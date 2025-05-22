package esercizio;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Calcolo del Perimetro e dell'Area delle diverse forme geometriche");
		
		try {
			
			//cerchio
			System.out.println("\n---CECHIO---");
			Cerchio cerchio = new Cerchio(5);
			System.out.println("Il raggio del cerchio è: " + cerchio.getRaggio());
			System.out.printf("Il Perimetro del cerchio è: %.2f%n", cerchio.calcolaPerimetro());
			System.out.printf("L'Area del cerchio è: %.2f%n" , cerchio.calcolaArea());
			
			//rettangolo
			System.out.println("\n---RETTANGOLO---");
			Rettangolo rettangolo = new Rettangolo(3, 5);
			System.out.println("La base del rettangolo è: " + rettangolo.getBase() + " e l'altezza è: " + rettangolo.getAltezza());
			System.out.printf("Il perimetro del rettangolo è: %.2f%n" , rettangolo.calcolaPerimetro());
			System.out.printf("L'Area del rettangolo è: %.2f%n" , rettangolo.calcolaArea());
			
			//quadrato
			System.out.println("\n---QUADRATO---");
			Quadrato quadrato = new Quadrato(5);
			System.out.println("Il lato del quadrato è: " + quadrato.getLato());
			System.out.printf("Il perimetro del quadrato è: %.2f%n" , quadrato.calcolaPerimetro());
			System.out.printf("L'Area del quadrato è: %.2f%n" , quadrato.calcolaArea());
			
			//triangolo
			System.out.println("\n---TRIANGOLO---");
			Triangolo triangolo = new Triangolo(3, 2, 7, 5);
			System.out.println("La base del triangolo è: " + triangolo.getBase());
			System.out.println("I lati del triangolo sono: " + triangolo.getLato1() + ", " + triangolo.getLato2());
			System.out.println("L'altezza del triangolo è: " + triangolo.getAltezza());
			System.out.printf("Il perimetro del triangolo è: %.2f%n" , triangolo.calcolaPerimetro());
			System.out.printf("L'Area del triangolo è: %.2f%n" , triangolo.calcolaArea());
			
			
		} catch (IllegalArgumentException e) {
			System.out.println("Errore");
		}
	}
}
