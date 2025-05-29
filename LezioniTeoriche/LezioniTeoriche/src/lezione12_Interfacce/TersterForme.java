package lezione12_Interfacce;

public class TersterForme {
	public static void main(String[] args) {
		
		FormaCalcolabile.benvenuto();// lo uso come un semplice metodo static
		
		Cerchio mioCerchio = new Cerchio(5.2);
		
		System.out.println("L'area del cerchio vale: " + mioCerchio.calcolaArea());
		System.out.println("Il perimetro del cerchio vale: " + mioCerchio.calcolaPerimetro());
//		System.out.println();
		
		Rettangolo mioRettangolo = new Rettangolo(4.3, 8.2);
		
		System.out.println("L'area del rettangolo vale: " + mioRettangolo.calcolaArea());
		System.out.println("Il perimetro del rettangolo vale: " + mioRettangolo.calcolaPerimetro());
//		System.out.println();
		mioRettangolo.stampaInfoForma();
//		System.out.println();
		
		//Array di FormeCalcolabili
		FormaCalcolabile[] mieForme = {mioCerchio, mioRettangolo};
		for (FormaCalcolabile fc : mieForme) {
			System.out.println(fc.calcolaArea());
		}
	
		//DOPO
//		FormaCalcolabile formaCalc = (a,b) -> a+b;
//		int risultato = formaCalc.faiUnCalcolo(8, 9);
		
		
	}
}
