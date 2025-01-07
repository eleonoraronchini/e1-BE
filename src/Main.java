import java.util.Scanner;

public class Main {

    // Metodo moltiplica: accetta due interi e ritorna il loro prodotto
    public static int moltiplica(int a, int b) {
        return a * b;
    }

    // Metodo concatena: accetta una stringa e un numero e restituisce una stringa che concatena gli elementi
    public static String concatena(String str, int num) {
        return str + num;
    }

    // Metodo inserisciInArray: accetta un array di stringhe di cinque elementi ed una stringa
    // e restituisce un array di sei elementi in cui la stringa passata sia al terzo posto
    // e le stringhe precedentemente in quarta e quinta posizione siano rispettivamente in quinta e sesta
    public static String[] inserisciInArray(String[] arr, String str) {
        // Crea un nuovo array con 6 elementi
        String[] nuovoArray = new String[6];

        // Copia i primi 2 elementi
        nuovoArray[0] = arr[0];
        nuovoArray[1] = arr[1];

        // Inserisce la stringa al terzo posto
        nuovoArray[2] = str;

        // Copia gli altri elementi (dalla quarta alla sesta posizione)
        nuovoArray[3] = arr[2];
        nuovoArray[4] = arr[3];
        nuovoArray[5] = arr[4];

        return nuovoArray;
    }
    public static int perimetroRettangolo(int altezza, int base) {
        return 2* (altezza+base);
    }

    public static void main(String[] args) {
        // Test del metodo moltiplica
        int prodotto = moltiplica(5, 3);
        System.out.println("Prodotto: " + prodotto); // Output: 15

        // Test del metodo concatena
        String concatenato = concatena("Numero: ", 7);
        System.out.println("Concatenato: " + concatenato); // Output: Numero: 7

        // Test del metodo inserisciInArray
        String[] arr = {"a", "b", "c", "d", "e"};
        String[] nuovoArr = inserisciInArray(arr, "x");

        // Stampa il nuovo array
        System.out.print("Nuovo array: ");
        for (String elemento : nuovoArr) {
            System.out.print(elemento + " ");
        }
        // Creiamo l'oggetto Scanner per leggere l'input
        Scanner sc = new Scanner(System.in);

        // Chiediamo all'utente di inserire il nome
        System.out.println("Inserisci il tuo nome");
        String name = sc.nextLine();

        // Chiediamo all'utente di inserire il cognome
        System.out.println("Inserisci il tuo cognome");
        String surname = sc.nextLine();

        // Stampiamo il messaggio di benvenuto
        System.out.println("Ciao " + name + " " + surname);

        //Chiediamo all'utente di inserire il valore dell'altezza
        System.out.println("Inserisci il valore dell'altezza del triangolo");
        int altezza = sc.nextInt();
        System.out.println("Inserisci il valore della base del triangolo");
        int base = sc.nextInt();
        int perimetro = perimetroRettangolo(altezza, base);

        //Stampiamo il risultato del Perimetro del triangolo
        System.out.println(perimetro);

    }

}