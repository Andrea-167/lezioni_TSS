package lezione01_intro;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Ciao, mondo!");
		
		//byte miaEta1 = 20; //byte (-127,128)
		int miaEta = 20; //non c'è pi+ il problema di memoria
		String mioNome = "Doua";
		double miaAltezza = 1.60;
		System.out.println("Ciao mi chiamo " + mioNome + " ho " + miaEta + " anni e sono alto " + miaAltezza);
		
		
		var tuaEta = 35;
		var tuoNome = "Anna";
		var tuaAltezza = 1.80;
		System.out.println(tuaEta + " ti chiami " + tuoNome + " e sei alta " + tuaAltezza); //tipizzazione debole (alt+shift+y)
	}
	
}
