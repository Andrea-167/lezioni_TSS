package lezione05_RelazioneTraClassi;

public class Segmento {

	//Lo stato della mia classe è fatto da prop che non sono piu dei tipi primitivi
	Punto a;
	Punto b;
	
	
	public Segmento(Punto a, Punto b) {
		this.a = a;
		this.b = b;
	}

	public double calcolaLunghezza() {
		
		double lunghezza = Math.sqrt(Math.pow((b.x - a.x), 2) + Math.pow((b.y - a.y), 2));
		return 0;
	}
	

	@Override
	public String toString() {
		return "Segmento [a=" + a + ", b=" + b + "]"; // quando stamperà a e b richiamerà il toString dei 2 punti
	}
	
}
