package lezione02_Statement;

import java.util.Iterator;

public class For_Statement {
	public static void main(String[] args) {
	
		for(int i = 0; i < 10; i++) {
			System.out.println("Ciao " + i);
		}
		
		System.out.println("---------");
		//ciclo inverso
		for(int i = 10; i > 0; i--) {
			System.out.println("Ciao " + i);
		}
	
		//for con doppia variabile
		for(int a = 0, b = 9; b >=0; b--, a++) {
			System.out.println("a vale " + a + " b vale " + b);
		}
		
		//for con continuw: serve a "saltare un giro"
		System.out.println("----For con il continue----");
		for(int i = 0; i < 10; i++) {
			if(i%2 == 0) {
				continue;
			}
			System.out.println(i);
		}
		
		//for con break: interrompe il ciclo
		System.out.println("----For con il break----");
		for(int i = 1; i < 10; i++) {
			if(i%3 == 0) {
				break;
			}
			System.out.println(i);
		}
		
		
		
	}
}
