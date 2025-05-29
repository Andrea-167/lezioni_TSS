package lezione13_Eccezioni;

public class MiaEccezione extends Throwable{

	@Override
	public String getMessage() {
		return "Questo è il messaggio dell'eccezione personalizzata";
	}

	@Override
	public void printStackTrace() {
		super.printStackTrace();
	}

	public String dettagliEccezione() {
		System.out.println("Questi sono i dettagli della mia eccezione: ");
		return "Dettagli eccezione: sono in un Null Pointer EXception";
	}
}
