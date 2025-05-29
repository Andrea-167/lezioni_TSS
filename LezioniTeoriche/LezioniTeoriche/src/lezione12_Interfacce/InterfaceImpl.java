package lezione12_Interfacce;

public class InterfaceImpl implements MiaPrimaInterface {

	@Override
	public void primoMetodo() {
		System.out.println("Sono nella classe e questo è il primo metodo");
	}

	@Override
	public String secondoMetodo() {
		String salutaMetodo = "Ciao dal secondo metodo";
		return null;
	}

	@Override
	public Integer terzoMetoto() {
		Integer somma = 5+6;
		return somma;
	}

	@Override
	public Boolean quartoMetodo() {
		return true;
	}

	
	
}
