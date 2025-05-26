package model;

import utils.Evolvibile;
import utils.TipoFuoco;

public class Charmeleon extends Pokemon implements TipoFuoco, Evolvibile{

	public Charmeleon(String nome, int livello, int pvMax, String[] tipi) {
		super(nome, livello, pvMax, tipi);
	}

	@Override
	public boolean puoEvolvere() {
		return false;
	}

	@Override
	public String prossimaEvoluzione() {
		return null;
	}

	@Override
	public Pokemon evolvi() {
		return null;
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
	public void attaccoBase() {
		this.mossaSpeciale();
	}

	@Override
	public void mossaSpeciale() {
		this.lanciafiamme();
	}

	@Override
	public void faiVerso() {
		System.out.println(this.nome + " dice CHARELEOOON");
	}

}
