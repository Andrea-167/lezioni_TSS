package lezione11_Astrazione;

public abstract class FormaGeometrica {

	//posso avere delle proprietà
	protected String nome;
	protected Colore colore;
	
	//posso avere un costruttore, quindi posso avere anche dei metodi non abstract
	//questo costruttore "me lo gioco" nella sottoclasse richiamando super()
	public FormaGeometrica(String nome, Colore colore) {
		super();
		this.nome = nome;
		this.colore = colore;
	}
	
	//possoa vere metodi concreti
	public void mostraInfo() {
		System.out.println("Forma: " + this.nome + " Colore: " + this.colore);
	}
	
	//metodo astratto nella classe astratta ---> non ho imolementazione
	abstract double calcolaPerimetro();
	abstract double calcolaArea();
}
