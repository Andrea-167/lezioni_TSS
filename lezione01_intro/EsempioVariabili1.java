package lezione01_intro;

public class EsempioVariabili1 {

	public static void main(String[] args) {
		
//	Spese sostenute
		//istanzio delle variabili
		double speseGenerali;
		double speseAuto;
		double speseViaggi;
		
		//assegno un variabile
		speseGenerali = 2500.6;
		speseAuto = 500;
		speseViaggi = 3642.8;
		
		double totale = speseGenerali + speseAuto + speseViaggi;
		double mediaTrimestre = totale / 4;
		
		System.out.println("-----SPESE-----");
		System.out.println("Spese Generali: " + speseGenerali);
		System.out.println("Spese Auto: " + speseAuto);
		System.out.println("Spese Viaggi: " + speseViaggi);
		System.out.println("Tot: " + totale + "€");
		System.out.println("Ogni trimestre hai speso in media: " + mediaTrimestre + "€");
		System.out.println("-----------");
		
		double totaleAnnoPre = 4520.2;
		
		//confronto i due totali 
		boolean confronto = totaleAnnoPre > totale;
		
		System.out.println("Il totale dell'anno precedente è maggiore del totale di quest'anno ? " + confronto);
		
	}
}
