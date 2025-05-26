
package lezione08_Incapsulamento;

import java.util.ArrayList;

public class Zaino {
	private String marca;
	private String colore;
	private double volume;
	
	ArrayList<Oggetto> cose;

	public Zaino(String marca, String colore, double volume) {
		this.marca = marca;
		this.colore = colore;
		this.volume = volume;
	}

	public void inizializzaCose() {
		cose = new ArrayList();
		cose.add(new Oggetto("Biro", "blu", 0.02));
		cose.add(new Oggetto("Quaderno", "righe", 0.08));
		cose.add(new Oggetto("PC", "Dell", 2.35));
	}
	
	public void elencaContenuto() {
		for(Oggetto oggetto: cose) {
			System.out.println(oggetto.getNome() 
					+ " " + oggetto.getDescrizione() 
					+ " " + oggetto.getVolume());
		}
	}


	public double calcolaVolumeOccupato() {
		double vol = 0;
		for (Oggetto oggetto : cose) {
			vol += oggetto.getVolume();
		}
		return vol;
	}

	public boolean inserisciCose(Oggetto o) {
		
		if(this.volume - (this.calcolaVolumeOccupato() + o.getVolume()) >= 0) {
			cose.add(o);
			return true;
		}
		System.out.println("Oggetto " + o.getNome() +" non inseristo per mancanza di spazio");
		return false;
	}
}
