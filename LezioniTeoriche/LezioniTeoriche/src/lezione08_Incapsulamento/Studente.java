
package lezione08_Incapsulamento;

public class Studente {
	 private String nome;
	 private String cognome;
	 private int annoIscrizione;
	 private int numMatricola;
	 private boolean presente;
	 static int contatore;
	
	 public Studente(String nome, String cognome, int annoIscrizione) {
		this.nome = nome;
		this.cognome = cognome;
		this.annoIscrizione = annoIscrizione;
		this.presente = true;
		this.numMatricola = ++contatore;
	}

	//Per poter modificare le prop devo creare i metodi getters & setters
	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public int getAnnoIscrizione() {
		return annoIscrizione;
	}

	public int getNumMatricola() {
		return numMatricola;
	}

	public boolean isPresente() {
		return presente;
	}

	//Con il set, modifico, valorizzo, assegno un valore ad una prop
	public void setPresente(String pass,boolean presente) {
		if(pass.equals("1234")) {
			this.presente = presente;			
		}else {
			System.out.println("mi spiace, non puoi variare la presenza dello studente " + this.nome);
		}
	}

	@Override
	public String toString() {
		
//		StringBuilder: per creare e modificare stringhe in modo efficiente, soprattutto quando si devono 
//		effettuare molte operazioni di concatenazione o modifica. Invece di creare nuovi oggetti stringa ad
//		ogni operazione.
		StringBuilder desc = new StringBuilder();
		desc.append(this.numMatricola);
		desc.append("\t");
		desc.append(this.nome);
		desc.append("\t");
		desc.append(this.cognome);
		desc.append("\t");
		desc.append(this.presente ? "presente": "assente"); //operatore ternario
		
		return desc.toString(); //Sto facendo il toString() dell'oggetto StringBuilder
	}
	
	
	 
	 
	 
	 
}
