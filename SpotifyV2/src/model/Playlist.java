package model;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

	private String nomePL;
	private List<Brano> brani = new ArrayList<Brano>();

	public Playlist(String nomePL) {
		this.nomePL = nomePL;
		System.out.println("Hai appena crato una playlist..");
	}

	public String getNomePL() {
		return nomePL;
	}

	public List<Brano> getBrani() {
		return brani;
	}

	public void addBrano(Brano brano) {
		
		if (brani.size() == 0) {
			brani.add(brano);
		}else {
			boolean giaEsiste = false;
			
			for (Brano branoInPL: brani) {
				if(branoInPL.compareTo(brano) == 0) {
					System.out.println("Stai aggiungendo un brano esistente: " + brano);
					giaEsiste = true;
					break;
				}
			}
			if(!giaEsiste) {
				this.brani.add(brano);
			}
		}
	}

	public void infoPlaylist() {
		System.out.println("Hai scelto la playlist: " + this.nomePL);
		int spazioDisponibile = 10 - this.brani.size();
		System.out.println("Hai ancora posto per " + spazioDisponibile + " posti");
		System.out.println("Canzoni inserite");
		for (Brano brano : brani) {
			System.out.println(brano);
		}
	}

}
