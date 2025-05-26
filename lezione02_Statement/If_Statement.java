package lezione02_Statement;

public class If_Statement {
	public static void main(String[] args) {
		
		/**
		 * if(condizione){
		 * 		...eseguo se TRUE
		 * }
		 * 
		 * else if(altraCondizione){
		 * 		...eseguo se TRUE
		 * }
		 * 
		 * else{
		 * 	..eseguo se tutto il resto è FALSE
		 * }
		 * 
		 */
		
		boolean piove = false;
		
		if (piove) {
			System.out.println("Porto l'ombrello");
		}
		//else non è obbligatorio
		else {
			System.out.println("Non porto l'ombrello");
		}
		
		//esempio
		int miaEta = 22;
		
		if (miaEta >= 18) {
			System.out.println("Benvenuto, puoi entrare");
		}else if(miaEta < 10) {
			System.out.println("Devi essere accompagnato dai genitori");
		}else {
			System.out.println("Mi spiace, non puoi entrare");
		}
		
		//operatore ternazio
		
		int a = 5;
		int b = 6;
		
		if (a == b) {
			System.out.println("I numeri sono uguali");
		}else {
			System.out.println("I numeri sono diversi");
		}
		
		
		String msg = (a == b)? "I numeri sono uguali": "I numeri sono diversi";
		System.out.println(msg);
	}
}
