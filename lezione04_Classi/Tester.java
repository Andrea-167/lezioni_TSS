package lezione04_Classi;

public class Tester {

	public static void main(String[] args) {
		
		//creo un'istanza della classe Persona invocando il metodo costruttore della classe Persona
		Persona pers1 = new Persona("Pier", "Bolli", 25, 1.80, "001 ");
		
		//leggo le caratteristiche ovvero accedo alle proprietà dell'oggetto
		System.out.println(pers1.nome);
		System.out.println(pers1.cognome);
		System.out.println(pers1.eta);
		System.out.println(pers1.altezza);
		System.out.println(pers1.matricola);
		
		
		Canzone canzone1 = new Canzone(); //qui utilizzo il costruttore di default
		canzone1.titolo = "Eooo";
		canzone1.cantante = "Bad Bunny";
		canzone1.durata = 3.8;
		
		System.out.println("Titolo: " + canzone1.titolo + " - " + canzone1.cantante);
		
		Canzone canzone2 = new Canzone("Bruno Mars", "24K", 2.5); //qui utlizzo il costruttore a firma piena
		System.out.println("Titolo: " + canzone2.cantante + " - " + canzone2.titolo);
		System.out.println(canzone2.toString());
		
		Canzone canzone3 = new Canzone("MJ", "Off the wall");
		System.out.println(canzone3.toString());
	

		System.out.println("----BICICLETTE----");
		Bicicletta miaBici = new Bicicletta(); //sto creando una bici con il costruttore di default
		System.out.println("La mia bici è di marca: " + miaBici.marca);
//		miabici.numeroruote = 9; //ATT la mia bici ha un numero di ruote Costante
		miaBici.marcia= 3;
		miaBici.accelera(100);
		miaBici.rallenta(50);
		miaBici.calcoloVelocita();
		System.out.println(miaBici); //ATT: stampare direttamente l'oggetto quando abbiamo un toString lo richiama in automatico
		
	}
	
	
}
