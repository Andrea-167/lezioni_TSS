package lezione03_metodi;

public class UsoMetodiDiAltri {
	
	public static void main(String[] args) {
		//a patto che sia public io posso utl
		String qualcosa =MetodiAusiliari.cosaMiPassi("Qualcosa ti passerò");
		System.out.println(qualcosa);
		
		double somma = Calcolatrice0.addizione(5.2, 8.9);
		System.out.println("Il valore della somma è " + somma);
		
	}
}
