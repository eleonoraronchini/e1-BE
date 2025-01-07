import java.util.Scanner;
public class Esercizio2 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        //con .out.print rimane sulla stessa riga, con out.print.ln va a capo.
        System.out.print("Inserisci una prima stringa:");
        String str1 = sc.nextLine();
        System.out.print("Inserisci una seconda stringa:");
        String str2 = sc.nextLine();
        System.out.print("Inserisci una terza stringa:");
        String str3 = sc.nextLine();

        System.out.println(str1+str2+str3);
        System.out.println(str3+str2+str1);

    }
}
