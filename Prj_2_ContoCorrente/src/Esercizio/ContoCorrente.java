package Esercizio;

import java.util.HashMap;
import java.util.Map;
import java.time.LocalDate;
import java.util.UUID;
import java.util.ArrayList;
import java.util.List;

// Classe che rappresenta un Conto Corrente
class ContoCorrente {
    public String nome;
    public String cognome;
    public LocalDate dataCreazione;
    public String codiceConto;
    public double saldo;

    // Costruttore della classe ContoCorrente
    public ContoCorrente(String nome, String cognome, LocalDate dataCreazione, String codiceConto) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataCreazione = dataCreazione;
        this.codiceConto = codiceConto;
        this.saldo = 0.0; // Saldo iniziale impostato a 0
    }

    // Metodo per ottenere il codice del conto
    public String getCodiceConto() {
        return codiceConto;
    }

    // Metodo per ottenere il saldo del conto
    public double getSaldo() {
        return saldo;
    }

    // Metodo per depositare denaro nel conto
    public void deposita(double importo) {
        if (importo > 0) {
            saldo += importo;
            System.out.println("Depositati " + importo + "€ sul conto " + codiceConto);
        } else {
            System.out.println("Importo non valido per il deposito.");
        }
    }

    // Metodo per prelevare denaro dal conto
    public boolean preleva(double importo) {
        if (importo > 0) {
            if (saldo >= importo) {
                saldo -= importo;
                System.out.println("Prelevati " + importo + "€ dal conto " + codiceConto);
                return true;
            } else {
                System.out.println("Saldo insufficiente sul conto " + codiceConto);
                return false;
            }
        } else {
            System.out.println("Importo non valido per il prelievo.");
            return false;
        }
    }

    // Metodo per ottenere una rappresentazione in stringa del conto
    @Override
    public String toString() {
        return "Conto Corrente [Nome=" + nome + ", Cognome=" + cognome + ", Data Creazione=" + dataCreazione
                + ", Codice Conto=" + codiceConto + ", Saldo=" + saldo + "€]";
    }
}
