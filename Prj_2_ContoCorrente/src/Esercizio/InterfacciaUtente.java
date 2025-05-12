package Esercizio;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;

public class InterfacciaUtente {
    // Metodo principale per eseguire l'applicazione
    public static void main(String[] args) {
        GestoreConti gestoreConti = new GestoreConti();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Gestore Conti Correnti ---");
            System.out.println("1. Crea Nuovo Conto Corrente");
            System.out.println("2. Accedi a Conto Corrente");
            System.out.println("3. Esci");
            System.out.println("4. Visualizza tutti i conti");
            System.out.print("Scegli l'operazione: ");
            int scelta = -1;
            try {
                scelta = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Input non valido. Inserire un numero.");
                scanner.nextLine();
                continue;
            }
            scanner.nextLine();

            switch (scelta) {
                case 1:
                    creaNuovoConto(scanner, gestoreConti);
                    break;
                case 2:
                    accediConto(scanner, gestoreConti);
                    break;
                case 3:
                    System.out.println("Uscita dal programma.");
                    scanner.close();
                    return;
                case 4:
                    visualizzaTuttiConti(gestoreConti);
                    break;
                default:
                    System.out.println("Scelta non valida. Riprovare.");
            }
        }
    }

    // Metodo per creare un nuovo conto corrente
    public static void creaNuovoConto(Scanner scanner, GestoreConti gestoreConti) {
        System.out.println("--- Crea Nuovo Conto Corrente ---");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Cognome: ");
        String cognome = scanner.nextLine();
        LocalDate dataCreazione = null;
        while (dataCreazione == null) {
            System.out.print("Data di Creazione (yyyy-MM-dd): ");
            String dataCreazioneStr = scanner.nextLine();
            try {
                dataCreazione = LocalDate.parse(dataCreazioneStr, DateTimeFormatter.ISO_LOCAL_DATE);
            } catch (DateTimeParseException e) {
                System.out.println("Formato data non valido. Utilizzare il formato AAAA-MM-GG.");
            }
        }
        ContoCorrente nuovoConto = gestoreConti.creaNuovoConto(nome, cognome, dataCreazione);
        System.out.println("Conto Corrente creato con successo. Codice Conto: " + nuovoConto.getCodiceConto());
    }

    // Metodo per accedere a un conto corrente esistente
    public static void accediConto(Scanner scanner, GestoreConti gestoreConti) {
        System.out.println("--- Accedi a Conto Corrente ---");
        System.out.print("Codice Conto: ");
        String codiceConto = scanner.nextLine();
        ContoCorrente conto = gestoreConti.accediConto(codiceConto);
        if (conto != null) {
            eseguiOperazioniConto(scanner, gestoreConti, conto);
        } else {
            System.out.println("Conto Corrente non trovato.");
        }
    }

    // Metodo per eseguire operazioni sul conto corrente
    public static void eseguiOperazioniConto(Scanner scanner, GestoreConti gestoreConti, ContoCorrente conto) {
        while (true) {
            System.out.println("\n--- Operazioni Conto Corrente ---");
            System.out.println("1. Visualizza Saldo");
            System.out.println("2. Deposita Denaro");
            System.out.println("3. Preleva Denaro");
            System.out.println("4. Visualizza Dettagli Conto");
            System.out.println("5. Esci");
            System.out.print("Scegli l'operazione: ");
            int scelta = -1;
            try {
                scelta = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Input non valido. Inserire un numero.");
                scanner.nextLine();
                continue;
            }
            scanner.nextLine();
            double importo = 0;
            switch (scelta) {
                case 1:
                case 4:
                    gestoreConti.eseguiOperazioniConto(conto, scelta, importo);
                    break;
                case 2:
                    System.out.print("Importo da depositare: ");
                    try {
                        importo = scanner.nextDouble();
                    } catch (InputMismatchException e) {
                        System.out.println("Input non valido. Inserire un numero.");
                        scanner.nextLine();
                        break;
                    }
                    scanner.nextLine();
                    gestoreConti.eseguiOperazioniConto(conto, scelta, importo);
                    break;
                case 3:
                    System.out.print("Importo da prelevare: ");
                    try {
                        importo = scanner.nextDouble();
                    } catch (InputMismatchException e) {
                        System.out.println("Input non valido. Inserire un numero.");
                        scanner.nextLine();
                        break;
                    }
                    scanner.nextLine();
                    gestoreConti.eseguiOperazioniConto(conto, scelta, importo);
                    break;
                case 5:
                    System.out.println("Torno al menu principale.");
                    return;
                default:
                    System.out.println("Scelta non valida. Riprovare.");
            }
        }
    }

    // Metodo per visualizzare tutti i conti correnti
    public static void visualizzaTuttiConti(GestoreConti gestoreConti) {
        List<ContoCorrente> listaConti = gestoreConti.getListaConti();
        if (listaConti.isEmpty()) {
            System.out.println("Non ci sono conti correnti presenti nel sistema.");
        } else {
            System.out.println("\n--- Elenco Conti Correnti ---");
            for (ContoCorrente conto : listaConti) {
                System.out.println(conto.toString());
            }
        }
    }
}
