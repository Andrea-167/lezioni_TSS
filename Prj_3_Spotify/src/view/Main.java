package view;

import model.Brano;
import model.Playlist;

public class Main {

	public static void main(String[] args) {
		
		Playlist miaPL = new Playlist("Ciro", 24, 5);
		Brano canzone1 = new Brano("The Weeknd", "Out of Tine", "Pop", 3.31);
		miaPL.addBrano(canzone1);
		Brano canzone2 = new Brano("The Weeknd", "After Hours", "Pop", 5.42);
		miaPL.addBrano(canzone2);
		Brano canzone3 =new Brano("The Weeknd", "The Abyss", "Pop", 4.23);
		miaPL.addBrano(canzone3);
		Brano canzone4 = new Brano("The Weeknd", "Starboy", "Pop", 2.54);
		miaPL.addBrano(canzone4);
		Brano canzone5 = new Brano("The Weeknd", "Wake Me Up", "Pop", 4.11);
		miaPL.addBrano(canzone5);;
		miaPL.removeBrano(canzone3);
		
		miaPL.infoPlaylist();
	}
}