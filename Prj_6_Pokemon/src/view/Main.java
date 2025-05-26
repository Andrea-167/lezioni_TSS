package view;

import model.Charmander;
import model.Charmeleon;
import model.Pokemon;

public class Main {

	public static void main(String[] args) {
		Charmander charmander = new Charmander("Charmander", 5, 33);
		charmander.mostraInfo();
		
		if(charmander instanceof Pokemon) {
			Charmeleon charmeleon = (Charmeleon) charmander.evolvi();
		}
		
		
	}
}
