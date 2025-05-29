package lezione06_Aggregazione;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

	String nome;
	List<Libro> libri; //List fanno parte delle collection
	
	public Biblioteca(String nome) {
		this.nome = nome;
		this.libri = new ArrayList<Libro>(); //Array List sono degli array scalabli aventi dei metodi per aggiungere, rimuovere, modificare il contenuto
		
		}
		public void addLibro(Libro libro) {
			this.libri.add(libro);
		}
		
		public void stampaListaLibri() {
			System.out.println("Libri presenti in biblioteca");
			for(Libro libro : libri) {
				System.out.println(libro.titolo + " - " + libro.autore);
			}
		}
	
	
	
}
