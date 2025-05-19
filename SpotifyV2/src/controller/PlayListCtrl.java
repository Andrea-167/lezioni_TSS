package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import model.Brano;

public class PlayListCtrl {

	private ArrayList<Brano> brani;
	
	public PlayListCtrl() {
		this.brani = new ArrayList<Brano>();
	}
	
	//caricamento manuale
	public void caricaCanzoni() {
		String raccolta[] = {
			"24K;Bruno Mars;3",
			"Beat It;Michael Jackson;3.5",
			"DTMF;Bad Bunny;4.1",
			"Perfect;Ed Sheeran;2.5",
			"Beautiful people;Maryln Manson;4",
			"After Hours;The Weeknd;4.0",
			"Californications;RHCP;3.5",
			"Pika Girl;S3rl;3.9",
			"Nu jeans e na maglietta;Nino D'Angelo;2.5"
		};
		
		for(String canzone: raccolta) {
			String[] splitted = canzone.split(";");
			String titolo = splitted[0];
			String autore = splitted[1];
			Double durata = Double.parseDouble(splitted[2]);
			
			Brano brano = new Brano(titolo, autore, durata);
			this.brani.add(brano);
			
		}
	}

	public void caricaCanzoniDaFile() {
		File fileCanzoni = new File("Canzoni.csv");
		
		try {
			Scanner sc = new Scanner(fileCanzoni);
			
			while(sc.hasNextLine()) {
				String riga = sc.nextLine();
				String[] separate = riga.split(",");
				String autore = separate[0];
				String titolo = separate[1];
				Double durata = Double.parseDouble(separate[2]);
				Brano brano = new Brano(titolo, autore, durata);
				this.brani.add(brano);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Non sono stato in grado di trovare il file. Controlla la sua posizione");
			e.printStackTrace();
		}
	}
	
	public ArrayList<Brano> getBrani() {
		return brani;
	}
	
	public Brano getSingoloBrano(int indice) {
		return brani.get(indice);
	}
	
	
	public void stampaBraniPL() {
		for (Brano brano : brani) {
			System.out.println(brano.stampa());
		}
	}
	
	
}
