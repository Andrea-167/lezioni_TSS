package model;

public class Brano implements Comparable<Brano>{

	private String titolo;
	private String autore;
	private double durata;

	public Brano(String titolo, String autore, double durata) {
		this.titolo = titolo;
		this.autore = autore;
		this.durata = durata;
	}
	
	public void suona() {
		System.out.println("Stai ascoltando..." + this.titolo + " di " + this.autore.toUpperCase());
}

	public String stampa() {
		return this.autore + " - " + this.titolo;
	}
	
	
	
	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public double getDurata() {
		return durata;
	}

	public void setDurata(double durata) {
		this.durata = durata;
	}

	@Override
	public String toString() {
		return "Brano [titolo=" + titolo + ", autore=" + autore + ", durata=" + durata + "]";
	}

	@Override
	// questo metodo, implementato percheè utilizzo l'interfaccia, restituisce 0 quando i due oggetti paragonati sono identici. <0 o >0 quando i due oggetti sono diversi
	public int compareTo(Brano b) {
		
		int confrontoAutore = this.autore.compareTo(b.autore);
		if(confrontoAutore == 0) {
			int confrontoTitolo = this.titolo.compareTo(b.titolo);
			if(confrontoTitolo == 0) {
				return Double.compare(this.durata, b.durata);
			}else {
				return confrontoTitolo;
			}
		}
		return confrontoAutore;
	}
	
	
}
