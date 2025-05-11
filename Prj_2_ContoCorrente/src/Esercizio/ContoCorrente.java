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

// Classe che gestisce i conti correnti
public class GestoreConti {
    private Map<String, ContoCorrente> contiCorrenti; // Mappa per memorizzare i conti correnti utilizzando il codiceConto come chiave
    private List<ContoCorrente> listaConti; // Lista per memorizzare tutti i conti correnti creati

    // Costruttore della classe GestoreConti
    public GestoreConti() {
        this.contiCorrenti = new HashMap<>();
        this.listaConti = new ArrayList<>(); // Inizializza la lista
    }

    // Metodo per creare un nuovo conto corrente
    public ContoCorrente creaNuovoConto(String nome, String cognome, LocalDate dataCreazione) {
        String codiceConto = UUID.randomUUID().toString(); // Genera un codice conto univoco
        ContoCorrente nuovoConto = new ContoCorrente(nome, cognome, dataCreazione, codiceConto);
        contiCorrenti.put(codiceConto, nuovoConto); // Aggiunge il nuovo conto alla mappa
        listaConti.add(nuovoConto); // Aggiunge il nuovo conto alla lista
        return nuovoConto;
    }

    // Metodo per accedere a un conto corrente esistente
    public ContoCorrente accediConto(String codiceConto) {
        if (contiCorrenti.containsKey(codiceConto)) {
            return contiCorrenti.get(codiceConto); // Restituisce il conto corrente se trovato
        } else {
            return null;
        }
    }

    // Metodo per eseguire operazioni sul conto corrente
    public void eseguiOperazioniConto(ContoCorrente conto, int scelta, double importo) {
        if (conto == null) {
            System.out.println("Operazione non permessa. Conto non valido.");
            return;
        }
        switch (scelta) {
                case 1:
                    System.out.println("Saldo: " + conto.getSaldo() + "€");
                    break;
                case 2:
                    conto.deposita(importo);
                    break;
                case 3:
                    conto.preleva(importo);
                    break;
                case 4:
                    System.out.println(conto.toString());
                    break;
                default:
                    System.out.println("Scelta non valida. Riprovare.");
            }
    }

    // Metodo per ottenere la lista di tutti i conti correnti
     public List<ContoCorrente> getListaConti() {
        return listaConti;
    }
}

