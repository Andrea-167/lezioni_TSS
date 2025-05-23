package lezione10_AnimaliGeometrici;

public class Uccellino extends Animale{

	protected String verso = "Cip cip";
	
	@Override
	public String versoAlt() {
		String versoSuper = super.versoAlt();
		return verso + " " + versoSuper;
	}

	
}
