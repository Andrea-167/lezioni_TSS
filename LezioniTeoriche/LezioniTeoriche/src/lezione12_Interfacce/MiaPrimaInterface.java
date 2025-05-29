package lezione12_Interfacce;

public interface MiaPrimaInterface {

	//Dichiaro dei metodi senza implementazione (sono di default dichiarati pulic abstract)
	void primoMetodo();
	String secondoMetodo();
	Integer terzoMetoto();
	Boolean quartoMetodo();
	
	//posso anche dichiarare delle prop (implicitamente public abstract final)
	int COSTANTE = 1;
	
	
	//Da JAVA8 in poi posso inserire l implementazione dei metodi
	static void metodoDefaultDellInterfaccia() {
		
		System.out.println("Sono un metodo statico dell'intefaccia");
	}
	
	//metodo Default
	default void metodoSoloDefault() {
		System.out.println("Questo è un metodo di default");
	}
}
