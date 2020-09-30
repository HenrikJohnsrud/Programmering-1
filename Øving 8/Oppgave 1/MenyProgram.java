import java.util.Scanner;
public class MenyProgram {

    private static int arbtakernr = 112;
    private static int ansettelsesaar = 2009;
    private static double maanedslonn = 25000;
    private static double skattProsent = 30;

    private static String fornavn1 = "Henrik";
    private static String etternavn1 = "Johnsrud";
    private static int fodselsaar1 = 2000;

    private static Person personlia = new Person(fornavn1,etternavn1,fodselsaar1);


    private static final ArbTaker arbeidstaker = new ArbTaker(personlia, arbtakernr, ansettelsesaar, maanedslonn, skattProsent);
    private static final Scanner inn = new Scanner(System.in);

    public static void main(String[]args) {
        boolean kjor = true;
        while (kjor) {
            visData();
            visMeny();
            int meny = inn.nextInt();
            switch (meny) {
                case 1:
                    setLonnOgSkatt();
                    break;
                case 2:
                    setArbtakerNrOgAnsattAar();
                    break;
                case 3://skattrekk i måneden
                    System.out.println("Personen blir trukket " + arbeidstaker.skattetrekkPerMaaned() + " kroner i skatt i måneden");
                    break;

                case 4://bruttolønn i året
                    System.out.println("Personen har " + arbeidstaker.bruttoLonnPerAar() + " kroner som bruttolønn i året");
                    break;

                case 5://skattetrekk per år
                    System.out.println("I løpet av et helt år blir personen trukket " + arbeidstaker.skattetrekkPerAar() + " kroner");
                    break;

                case 6://navn på arbtaker
                    System.out.println(arbeidstaker.navnString());
                    break;

                case 7://alder på arbtaker
                    System.out.println("Personen er " + arbeidstaker.personAlder() + " år gammel");
                    break;

                case 8://ant år i bedriften
                    System.out.println("Personen har vært ansatt i denne bedriften i " + arbeidstaker.aarIBedrift() + " år");
                    break;

                case 9://Om arbtaker har vært ansatt mer en x år
                    System.out.println("Skriv inn antall år du vil teste:");
                    int aar = inn.nextInt();
                    System.out.println(arbeidstaker.ansattAarTest(aar));
                    break;
                case 10:
                    kjor = false;
                    System.out.println("Programmet er avsluttet");
                    break;

                default:
                    System.out.println("Kun tall mellom 1 og 10 er gyldige input");
                    break;
            }
        }


    }

    public static void setArbtakerNrOgAnsattAar(){
        System.out.println("Skriv inn arbeidstaker-nummeret til personen");
        int arbTakerNr = inn.nextInt();
        arbeidstaker.setArbtakernr(arbTakerNr);

        System.out.println("I hvilke år ble personen ansatt?");
        int ansattAar = inn.nextInt();
        arbeidstaker.setAnsettelsesaar(ansattAar);
    }

    public static void setLonnOgSkatt(){
        System.out.println("Sett månedslønnen til personen");
        double maanedsLonn = inn.nextDouble();
        arbeidstaker.setMaanedslonn(maanedsLonn);

        System.out.println("Sett skatteprosent til personen");
        double skatt = inn.nextDouble();
        arbeidstaker.setSkattProsent(skatt);
    }

    public static void visData(){

        System.out.println("Følgende data gjelder:");
        System.out.println("Månedslønn (kr): " + arbeidstaker.getMaanedslonn());
        System.out.println("Skatteprosent: " + arbeidstaker.getSkattProsent());
        System.out.println("Arbeidstaker-nummer: " + arbeidstaker.getArbtakernr());
        System.out.println("Ansettelses-år: " + arbeidstaker.getAnsettelsesaar());
    }

    public static void visMeny(){

        System.out.println("Tast inn tall for ønsket aktivitet");
        System.out.println("1: Endre lønn og skatteprosent");
        System.out.println("2: Endre arbeidstaker-nummer og ansettelses-år");
        System.out.println("3: Skattetrekk i måneden");
        System.out.println("4: Få årlig bruttolønn");
        System.out.println("5: Se skattetrekk per år");
        System.out.println("6: Få navn på arbeidstaker");
        System.out.println("7: Få alder til personen");
        System.out.println("8: Hvor lenge personen har vært ansatt");
        System.out.println("9: Har personen være ansatt i mer en x år?");
        System.out.println("10: Avslutt program");
    }
}

