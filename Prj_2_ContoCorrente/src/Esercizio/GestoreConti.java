package Esercizio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

//Classe che gestisce i conti correnti
	public class GestoreConti {
 public Map<String, ContoCorrente> contiCorrenti; // Mappa per memorizzare i conti correnti utilizzando il codiceConto come chiave
 public List<ContoCorrente> listaConti; // Lista per memorizzare tutti i conti correnti creati

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