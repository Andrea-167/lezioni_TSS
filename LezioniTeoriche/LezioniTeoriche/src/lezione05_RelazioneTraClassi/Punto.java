package lezione05_RelazioneTraClassi;

public class Punto {

	double x;
	double y;

	public Punto() {
	}

	public Punto(double x, double y) {

		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}
	
}
