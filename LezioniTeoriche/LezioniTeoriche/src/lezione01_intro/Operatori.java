package lezione01_intro;

public class Operatori {
	public static void main(String[] args) {
		//operatori matematici +*-/
		//% resto della divizione o modulo 
		
		int resto = 12 % 6;
		System.out.println("Il resto vale: " + resto);
		
		int resto2 = 12 % 3;
		System.out.println("Il resto vale: " + resto2 + " quindi è un multiplo di 3");
		
		//Operatori di confronto o relazionali -> producono sempre un boolean
		// == ( uguale a )
		// != ( diverso )
		// > ( maggiore ) < ( minore ) >= ( maggiorer uguale ) <= ( minore uguale )
		
		int i1 = 5;
		int i2 = 6;
		
		boolean c1 = (i1 == i2); //false
		boolean c2 = (i1 != i2); //true 
		boolean c3 = (i1 > i2); //false
		boolean c4 = (i1 < i2); //true
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		
		//operatori di assegnamento 
		// = ( assegnamento ) += ( assegnamento con somma ) -= ( assegnamento con sottrazione ) 
		//*= ( assegnamento con moltiplicazione ) /= ( assegnamento con divisione ) 
		
		int num1 = 10;
		int num2 = 5;
		
		System.out.println(num1 += num2); //sto incrementando num1
		System.out.println(num1); //15 perchè incremento
		System.out.println(num2); //5
		
		
		num2 *= 4;
		System.out.println(num2); //20
		
		
		num2 /= 5;
		System.out.println(num2); //4
		
		
		num2 -= 2;
		System.out.println(num2); //2
		
		//operatori di incremento (++) e decremento (--) aumentano o diminuiscono di 1 il valore delle variabili
		
		int a = 3;
		int b;
		
		System.out.println("a vale " + a);
		a++;
		System.out.println("Dopo a++ la a vale " + a);
		
		b = a++; //operatore di post incremento
		System.out.println("b vale " + b); 
		
		b =++ a; //operatore di pre incremento 
		System.out.println("b vale: " + b);
		
		
	}
}
