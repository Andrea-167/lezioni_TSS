package model;

public class Brano {

	public String autore;
	public String titolo;
	public String genere;
	public double durata;

	
	public Brano(String autore, String titolo, String genere, double durata) {
		this.autore = autore;
		this.titolo = titolo;
		this.genere = genere;
		this.durata = durata;
	}

	public void stampaInfo() {
		System.out.println("autore= " + autore + ", titolo= " + titolo + ", genere= " + genere + ", durata= " + durata);;
	}
	
	public boolean play() {
		System.out.println("Stai riproducendo: " + titolo);
		return true;
	}

	@Override
	public String toString() {
		return "Brano [autore= " + autore + ", titolo= " + titolo + ", genere= " + genere + ", durata= " + durata + "]";
	}
	
	
	
}
