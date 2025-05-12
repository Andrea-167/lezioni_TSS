package view;

import model.Brano;
import model.Playlist;

public class Main {

	public static void main(String[] args) {
		
		Playlist miaPL = new Playlist("Ciro", 24, 5);
		miaPL.addBrano(new Brano("The Weeknd", "Out of Tine", "Pop", 3.31));
		miaPL.addBrano(new Brano("The Weeknd", "After Hours", "Pop", 5.42));
		miaPL.addBrano(new Brano("The Weeknd", "The Abyss", "Pop", 4.23));
		miaPL.addBrano(new Brano("The Weeknd", "Starboy", "Pop", 2.54));
		miaPL.addBrano(new Brano("The Weeknd", "Wake Me Up", "Pop", 4.11));
		
		miaPL.infoPlaylist();
	}
}
