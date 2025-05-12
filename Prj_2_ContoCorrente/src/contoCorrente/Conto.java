package contoCorrente;

import java.util.Date;

public class Conto {

	public static int contatore; //mi serve a contare quanti conti sono aperti nella banca
	public int numConto;
	public double saldo;
	public String titolare;
	Date dataApertura;
	
	public Conto() {
		System.out.println("Hai appena creato un conto vuoto. Dovrai aggiungere le varie propietà");
		contatore++; //ATT: non posso usare il this. poiche contatore è static quindi appartiene solo ed esclusivamente alla classe
	}
	
	public Conto(int numConto, double saldo, String titolare, Date dataApertura) {
		System.out.println("Hai appena creato un conto corrente");
		this.numConto = numConto;
		this.saldo = saldo;
		this.titolare = titolare;
		this.dataApertura = dataApertura;
		contatore++;	
		System.out.println("Nella tua banca ci sono " + contatore + " conti");
	}
	
	public double preleva(double importo) {
		
		if(importo < saldo) {
			System.out.println("Stai prelevando: " + importo);
			saldo -= importo;
			System.out.println("Saldo attuale: " + saldo);
		}else {
			System.out.println("Non hai sufficienti fondi");
		}
		return saldo;
	}
	
	public void versamento(double importo) {
		if (importo > 0) {
		System.out.println("Stai versando: " + importo + " €");
		saldo += importo;
		System.out.println("Saldo attuale: " + saldo);
		}else {
			System.out.println("Non puoi versare un importo negativo");
		}
	}
	
	public String stampaInfo() {
		String s = "";
		s += "Numero conto: \t " + numConto;
		s += "\n Titola: " + titolare;
		s += "\n Saldo attuale: " + saldo;				
		return s;
	}

	
	
	@Override
	public String toString() {
		return "Conto [numConto=" + numConto + ", saldo=" + saldo + ", titolare=" + titolare + ", dataApertura="
				+ dataApertura + "]";
	}
}
