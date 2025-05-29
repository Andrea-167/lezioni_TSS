package lezione12_Interfacce;

public interface FormaCalcolabile {

	//Metodi
	double calcolaArea();
	double calcolaPerimetro();
	
	String TIPO = "Forma geometrica calcolabile";
	
	//metodi di defaukt
	default void stampaInfoForma() {
		System.out.println("Area Forma " + this.calcolaArea());
		System.out.println("Area Perimetro " + this.calcolaPerimetro());
	}
	
	
	static void benvenuto() {
		System.out.println("Benvenuto nella geometria piana euclidea calcolabile");
	}
	
	//DOPO
//	int faiUnCalcolo(int a, int b);
}
