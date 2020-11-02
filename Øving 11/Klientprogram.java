import java.util.ArrayList;
import java.util.Scanner;
/**
 * Klientklasse for eiendomsregisteret
 * @version 29.10.2020
 * @author Henrik Johnsrud
 */
public class Klientprogram {

    /**
     * Eiendomsregister
     */
    private static EiendomsRegister register = new EiendomsRegister();
    /**
     * Scanner
     */
    private static Scanner inn = new Scanner(System.in);

    /**
     * Main-metode
     * @param args
     */
    public static void main(String[] args) {
        /**
         * Legger til testdata
         */
        register.registrerEiendom(1445, "Gloppen", 77, 631, "", 1017.6, "Jens Olsen");
        register.registrerEiendom(1445, "Gloppen", 77, 131, "Syningom", 661.3, "Nicolay Madsen");
        register.registrerEiendom(1445, "Gloppen", 75, 19, "Fugletun", 650.6, "Evilyn Jensen");
        register.registrerEiendom(1445, "Gloppen", 74, 188, "", 1457.2, "Karl Ove Bråten");
        register.registrerEiendom(1445, "Gloppen", 69, 47, "Høiberg", 1339.4, "Elsa Indregård");

        boolean loop = true;
        /**
         * Så lenge loop == true skal løkken kjøre
         */
        while (loop) {
            /**
             * Vis meny og få et input(valg) av brukeren
             */
            int valg = visMeny();

            switch (valg) {
                case 1:
                    registrerEiendom();
                    break;
                case 2:
                    if (register.alleEiendommer()!=null) {
                        ArrayList<Eiendom> midlertidigArrayList = new ArrayList<Eiendom>();
                        midlertidigArrayList = register.alleEiendommer();
                        for (int i = 0; i < midlertidigArrayList.size(); i++) {
                            System.out.println(midlertidigArrayList.get(i).toString());
                        }
                    }
                    else {
                        System.out.println("Det er ingen eiendommer i registeret");
                    }
                    break;
                case 3:
                    System.out.println("Fyll inn følgende data om eiendommen du øsnker å finne");
                    System.out.println("Kommunenummer:");
                    int kommuneNr = inn.nextInt();
                    System.out.println("Gårdsnummer:");
                    int gaardsNr = inn.nextInt();
                    System.out.println("Bruksnummer:");
                    int bruksNr = inn.nextInt();
                    String eiendom = register.finnEiendom(kommuneNr,gaardsNr,bruksNr);
                    if (eiendom==null){
                        System.out.println("Det finnes ingen eiendom med de dataene i registeret");
                    }
                    else {
                        System.out.println(eiendom);
                    }
                    break;
                case 4: //Regne ut og vise gjennomsnitts areal av alle eiendommene i registeret
                    System.out.println("Gjennomsnittsarealet på alle eiendommene i registeret er: "+register.tomtGjennomsnittAreal()+"m^2");
                    break;
                case 5:
                    System.out.println("Programmet er avsluttet");
                    loop = false;
                    break;
                default:
                    System.out.println("Kun tall mellom 1 og 5 er gyldige input");
                    break;
            }

        }
    }

    /**
     * Viser de ulike valgene og får et svar av brukeren
     * @return en int som representerer valg av handling
     */
    private static int visMeny() {
        int valg = 0;

        System.out.println("Velg hvilke operasjon du ønsker å utføre");
        System.out.println("Tast 1: Registrer en ny eiendom");
        System.out.println("Tast 2: Skriv ut alle eiendommene i systemet");
        System.out.println("Tast 3: Finn en eiendom med eiendomsID");
        System.out.println("Tast 4: Få gjennomsnitts-areal på alle eiendommene i systemet");
        System.out.println("Tast 5: Avslutt program");

        String input = inn.next();
        try {
            valg = Integer.parseInt(input);
        }
        catch (NumberFormatException e){
            System.out.println("Det du skrev inn er ikke et heltall, skriv inn et tall mellom 1 og 5");
        }

        return valg;
    }

    /**
     * Legger til en ny eiendom i registeret
     */
    private static void registrerEiendom(){
        System.out.println("Fyll inn følgende data om eiendommen du vil registrere");
        System.out.println("Kommunenavn på kommunen den ligger i");
        String kommuneNavn = inn.next();
        System.out.println("Kommunenummer");
        int kommuneNr = inn.nextInt();
        System.out.println("Gårdsnummer");
        int gaardsNr = inn.nextInt();
        System.out.println("Bruksnummer");
        int bruksNr = inn.nextInt();
        System.out.println("Bruksnavn");
        String bruksNavn = inn.next();
        System.out.println("Areal på tomten (m^2)");
        double areal = inn.nextDouble();
        System.out.println("Navn på eier av eiendommen");
        String navnEier = inn.next();
        if (register.registrerEiendom(kommuneNr,kommuneNavn,gaardsNr,bruksNr,bruksNavn,areal,navnEier)){ //sjekker om metoden returnerer true. Gjør den det er registreringen vellykket
            System.out.println("Registrering fullført");
        }
        else {
            System.out.println("Registrering mislyktes");
        }
    }

}
