package lezione10_AnimaliGeometrici;

public class Pappagallo extends Uccellino {

	String verso = "Ciao Capo, sto studiando JAVA!";

	@Override
	public String versoAlt() {
		return this.verso + " " + super.versoAlt();
	}
	
	
}
