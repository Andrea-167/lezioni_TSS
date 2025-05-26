package lezione08_Incapsulamento;

public class Oggetto {
	private String nome;
	private String descrizione;
	private double volume;

	public Oggetto(String nome, String descrizione, double volume) {
		this.nome = nome;
		this.descrizione = descrizione;
		this.volume = volume;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}
	
	
	
	
}