package esercizio;

public class Main {

	public static void main(String[] args) {

		RegistroAziendale registro = new RegistroAziendale();
		
        // Aggiunta di dipendenti
		Segretario seg1 = new Segretario("Paolo", "Bianchi", 1, "Direzione");
		Programmatore prog1 = new Programmatore("Andrea", "Rossi", 2, "Java");
		HR hr1 = new HR("Franco", "Verdi", 3, "Reclutamento e Selezione");
		Manager man1 = new Manager("Giacomo", "Gialli", 4, "Sviluppo software");
		Programmatore prog2 = new Programmatore("Salvatore", "Grigi", 2, "Python");
		
		//aggiunta al registro
		registro.aggiungiDipentente(man1);
		registro.aggiungiDipentente(hr1);
		registro.aggiungiDipentente(prog1);
		registro.aggiungiDipentente(seg1);
		registro.aggiungiDipentente(prog2);
		System.out.println();
		
		//pagamento stipendi
		registro.pagaStipendi();
		System.out.println();
		
		//stampa dipendenti
		registro.stampaTuttiIDipendenti();
		System.out.println();
		
		registro.StampaPerRuolo(Ruoli.Segretario);
		System.out.println("-------------------");
		registro.StampaPerRuolo(Ruoli.Programmatore);
		System.out.println("-------------------");
		registro.StampaPerRuolo(Ruoli.HR);
		System.out.println("-------------------");
		registro.StampaPerRuolo(Ruoli.Manager);
	}

}
