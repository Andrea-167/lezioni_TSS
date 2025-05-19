package view;

import controller.PlayListCtrl;
import model.Brano;
import model.Playlist;

public class Main {

	public static void main(String[] args) {
		
		Playlist miaPlaylist = new Playlist("rock '70");
		
//		Brano nuovoBrano = new Brano("Immigrant song", "Led Zeppelin", 4.5);
//		Brano nuovoBrano2 = new Brano("Breathe", "Pink Floyd", 5.2);
//		
//		miaPlaylist.addBrano(nuovoBrano);
//		miaPlaylist.addBrano(nuovoBrano2);
		
//		PlayListCtrl database = new PlayListCtrl();
//		database.caricaCanzoni();
//		database.stampaBraniPL();

		PlayListCtrl db = new PlayListCtrl();
		db.caricaCanzoniDaFile();
		System.out.println("Stai stampando tutti i brani disponibili !!");
		db.stampaBraniPL();
		
		System.out.println("----Elenco----");
		miaPlaylist.addBrano(db.getSingoloBrano(12));
		miaPlaylist.addBrano(db.getSingoloBrano(12));
		miaPlaylist.addBrano(db.getSingoloBrano(64));
		miaPlaylist.addBrano(db.getSingoloBrano(22));
		miaPlaylist.addBrano(db.getSingoloBrano(22));

		miaPlaylist.infoPlaylist();
		
//		System.out.println("---Confronta Brani---");
//		
//		Brano b1 = db.getSingoloBrano(0);
//		System.out.println(b1);
//		
//		Brano b2 = db.getSingoloBrano(20);
//		System.out.println(b2);
//		
//		if(b1.compareTo(b2) == 0) {
//			System.out.println("I brani sono uguali");
//		}else {
//			System.out.println("I brani sono diversi");
//			System.out.println(b1.compareTo(b2));
//		}
		
		
	}
}
