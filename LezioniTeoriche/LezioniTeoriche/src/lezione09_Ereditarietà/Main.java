package lezione09_Ereditarietà;

public class Main {

	public static void main(String[] args) {
		
		//creo un progetto della superclasse
		System.out.println("---VEICOLO---");
		Veicolo veicolo = new Veicolo("Generica", "Generico", 2025, 4);
		veicolo.mostraInfo();
		veicolo.start();
		veicolo.stop();
		
		//creo un oggetto della sottoclasse
		System.out.println("---AUTOMOBILE---");
		Automobile auto = new Automobile("Peugeot", "2008", 2023, 4, 5);
		auto.mostraInfo(); //questo è in override
		auto.start(); //questo è in override con aggiunta
		auto.stop(); //questo non è in override
		
		//creo un veicolo gemerico ----POLIMORFISMO
		System.out.println("---VEICOLO GENERICO---");
		Veicolo veicoloGen = new Automobile("BMW", "M4", 2019, 4, 4);
		veicoloGen.mostraInfo(); //chiama nella sottoclasse
		veicoloGen.start(); //chiama nella sottoclasse
		veicoloGen.stop(); //chiama nella superclasse
		
		//creo una motocicletta
		System.out.println("---MOTOCICLETTA---");
		Motocicletta moto = new Motocicletta("Kawasaki", "z750", 2015, "naked");
		moto.mostraInfo();
		moto.start();
		moto.stop();
	}
}
