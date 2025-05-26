package lezione07_Composizione;

public class Stanza {

	String nome;
	double area;
	
	public Stanza(String nome, double area) {
		this.nome = nome;
		this.area = area;
	}

	@Override
	public String toString() {
		return "Stanza [nome=" + nome + ", area=" + area + "]";
	}
	
	
}
