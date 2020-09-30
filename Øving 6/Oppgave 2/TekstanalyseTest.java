import java.util.Scanner;

public class TekstanalyseTest {
    public static void main(String[]args){
        int valg;

        do {
            System.out.println("Tast 1 for tekstanalyse, tast 2 for å avslutte");
            Scanner start = new Scanner(System.in);
            valg = start.nextInt();

            if (valg == 1) {
                System.out.println("Skriv inn teksten din her:");
                Scanner inn = new Scanner(System.in);
                String tekst = "";
                tekst += inn.nextLine(); //for å få med hele stringen. tar med resten etter man skriver "mellomrom"

                Tekstanalyse klasse = new Tekstanalyse(tekst);
x
                System.out.println("Det er " + klasse.antForskjellige() + " forskjellige bokstaver i teksten");
                System.out.println("Det er totalt " + klasse.antBokstaverTotalt() + " bokstaver i teksten");
                System.out.println("Prosentandelen av teksten som ikke er bokstaver er: " + klasse.prosentIkkeBokstaver() + "%");
                char forekomst = 'e';
                System.out.println("Bokstaven e forekommer " + klasse.antForekomster(forekomst) + " ganger i teksten");
                System.out.println("Bokstav(ene) som forekommer flest ganger i teksten er:" + klasse.flestForekomster());
            }
        }
        while (valg == 1);
        System.out.println("Programmet er avsluttet");
    }
}
