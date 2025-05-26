package model;

import utils.Evolvibile;
import utils.TipoFuoco;

public class Charmander extends Pokemon implements TipoFuoco, Evolvibile{

	private static String[] tipi = {"Fuoco"};
	public Charmander(String nome, int livello, int pvMax) {
		super(nome, livello, pvMax, tipi);
		
	}

	@Override
	public void attaccoBase() {
		this.braciere();
	}

	@Override
	public void mossaSpeciale() {
		this.lanciafiamme();
	}

	@Override
	public void faiVerso() {
		System.out.println(this.nome + " dice CHAR CHAR");
	}

	@Override
	public void lanciafiamme() {
		System.out.println(this.nome + " usa Lanciafiamme...VROOO");
	}

	@Override
	public void braciere() {
		System.out.println(this.nome + " usa Braciere");
	}

	@Override
	public void nitrocarica() {
		System.out.println(this.nome + " usa Nitrocarica");
	}

	@Override
	public boolean puoEvolvere() {
		return true;
	}

	@Override
	public String prossimaEvoluzione() {
		return "Charmeleon";
	}

	@Override
	public Pokemon evolvi() {
		if(puoEvolvere()) {
			System.out.println("\n" + this.nome + " si sta evolvendo");
			System.out.println("Diventa più grande e forte");
			System.out.println("Evoluzione completata");
			return new Charmeleon(nome, livello, pvMax, tipi);
		}else {
			System.out.println(this.nome + " non riesce ancora ad evolversi");
			return this;
		}
	}

}
