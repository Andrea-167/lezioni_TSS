package model;

import java.util.ArrayList;

public class Playlist {

	ArrayList<Brano> brano = new ArrayList<Brano>();
	public String nome;
	public double durataTotale;
	public int numeroBrani;
	
	public Playlist(String nome, double durataTotale, int numeroBrani) {
		this.nome = nome;
		this.durataTotale = durataTotale;
		this.numeroBrani = numeroBrani;
	}

	public void addBrano(Brano brano) {
		this.brano.add(brano);
	}
	
	public void removeBrano(Brano brano) {
		this.brano.remove(brano);
	}
	
	public void infoPlaylist() {
		System.out.println("Playlist: " + nome + ".\nContiene: " + numeroBrani + " brani.\nLa durata totale è di: " + durataTotale + " minuti");
		for(Brano brano: brano) {
			brano.stampaInfo();
		}
	}
	

}
