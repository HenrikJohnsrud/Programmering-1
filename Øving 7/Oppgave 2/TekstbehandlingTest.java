import java.util.Scanner;

public class TekstbehandlingTest {
    public static void main(String[]args){

        System.out.println("Skriv inn teksten du vil bruke:");
        Scanner inn = new Scanner(System.in);
        String tekst = "";
        tekst += inn.nextLine();

        Tekstbehandling behandling = new Tekstbehandling(tekst);

        System.out.println("Antall ord i teksten er: " + behandling.antOrd());
        System.out.format("Gjennomsnittlig ordlengde er: %.2f bokstaver \n",behandling.averageOrdlengde());
        System.out.format("Gjennomsnittlig antall ord per periode er: %.2f \n",behandling.averageOrdPerPeiode());

        String byttFra = "er";
        String byttTil = "kult";
        System.out.println("Her er ordet: '" + byttFra + "' byttet ut med: '" + byttTil + "' : " + behandling.byttOrd(byttFra,byttTil));

        System.out.println("Her er hele teksten uendret: " + behandling.getTekst());
        System.out.println("Her er hele teksten med store bokstaver: " + behandling.getTekstStore());
    }
}
