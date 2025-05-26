package lezione08_Incapsulamento;

import java.util.List;

public class RespoCorso {
	
	private String nomeRespo;
	private int matricola;
	private String email;
	private List<String> corsiAssegnati;
	
	public RespoCorso() {
	}
	
	public RespoCorso(String nomeRespo, int matricola, String email, List<String> corsiAssegnati) {
		this.nomeRespo = nomeRespo;
		this.matricola = matricola;
		this.email = email;
		this.corsiAssegnati = corsiAssegnati;
	}
	public String getNomeRespo() {
		return nomeRespo;
	}
	public void setNomeRespo(String nomeRespo) {
		this.nomeRespo = nomeRespo;
	}
	public int getMatricola() {
		return matricola;
	}
	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<String> getCorsiAssegnati() {
		return corsiAssegnati;
	}
	public void setCorsiAssegnati(List<String> corsiAssegnati) {
		this.corsiAssegnati = corsiAssegnati;
	}

	@Override
	public String toString() {
		return "RespoCorso [nomeRespo=" + nomeRespo + ", matricola=" + matricola + ", email=" + email
				+ ", corsiAssegnati=" + corsiAssegnati + "]";
	}
}
