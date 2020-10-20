import java.util.ArrayList;
import java.util.Scanner;

public class Program {

    private static Scanner inn = new Scanner(System.in);
    private static MenyRegister register = new MenyRegister();

    public static void main(String[]args) {

        boolean loop = true;
        while (loop){
            System.out.println("Velg en handling du vil utføre:");
            System.out.println("Tast 1: Registrer en ny rett");
            System.out.println("Tast 2: Finn en rett gitt navnet");
            System.out.println("Tast 3: Finne alle retter av en gitt type");
            System.out.println("Tast 4: Registrer en ny meny");
            System.out.println("Tast 5: Finne alle menyer med pris mellom to gitte priser");
            System.out.println("Tast 6: Avslutt program");

            int valg = inn.nextInt();
            switch (valg) {
                case 1:
                    registerRett();
                    break;
                case 2:
                    System.out.println("Skriv navnet på retten du ønsker å finne:");
                    String navnRett = inn.next();
                    System.out.println(register.finnRettPaaNavn(navnRett));
                    break;
                case 3:
                    System.out.println("Skriv type rett du ønsker å finne: (forrett, hovedrett, dessert)");
                    String typeRett = inn.next();
                    skrivUtArrayList(register.finnRettPaaType(typeRett));
                    break;
                case 4:
                    nyMeny2();
                    break;
                case 5:
                    menyerMellomPriser();
                    break;
                case 6:
                    System.out.println("Programmet er avsluttet");
                    loop = false;
                    break;
                default:
                    System.out.println("Kun tall mellom 1 og 6 er gylidige input");
                    break;
            }
        }
    }

    private static void registerRett(){
        System.out.println("Skriv inn navnet på retten du vil registrere:");
        String navn = inn.next();
        System.out.println("Hvilke type rett er " + navn + "? (forrett, hovedrett, dessert)");
        String type = inn.next();
        System.out.println("Hva koster retten?");
        double pris = inn.nextDouble();
        System.out.println("Hva er oppskriften til " + navn + "?");
        String oppskrift = inn.next();

        register.registrerRett(navn, type, pris, oppskrift);
    }

    public static void skrivUtArrayList(ArrayList<Rett> liste) {
        if (liste.size() > 0) {
            for (int i = 0; i < liste.size(); i++) {
                System.out.println(liste.get(i).toString());
            }
        } else {
            System.out.println("Fant ingen retter av denne typen");
        }
    }


    private static void nyMeny2(){
        String retter = "";
        for (int i = 0; i<register.getRetter().size(); i++){
            if (i == 0){
                retter += register.getRetter().get(i).getNAVN();
            }
            else {
                retter = retter + ", " + register.getRetter().get(i).getNAVN();
            }
        }
        System.out.println("Dette er rettene som er registrert i systemet: \n"+retter);
        ArrayList<Rett> retterTilMeny = new ArrayList<Rett>();
        boolean ferdig = false;
        while (!ferdig){
            if (retterTilMeny.size()==0) {
                System.out.println("Skriv inn navnet på retten du vil legge til i menyen (må være fra listen over)");
            }
            else {
                System.out.println("Tast 1 for å avslutte og lagre menyen eller skriv inn navnet på retten du vil legge til i menyen (må være fra listen over)");
            }
                String rett = inn.next();
                boolean vellykket = false;
                if (rett.equals("1")){
                    ferdig = true;// må legge til noe for å lagre menyen
                    register.registrerMeny(retterTilMeny);
                    System.out.println("Registrering fullført");
                    vellykket = true;
                }
                for (int i = 0; i < register.getRetter().size(); i++) {
                    if (register.getRetter().get(i).getNAVN().equals(rett)) {
                        retterTilMeny.add(register.getRetter().get(i));
                        vellykket = true;
                    }
                }
                if (!vellykket){System.out.println("Retten finnes ikke i systemet");}
        }
    }

    private static void menyerMellomPriser(){
        System.out.println("Fyll inn startprisen:");
        double startpris = inn.nextDouble();
        System.out.println("Fyll inn sluttprisen:");
        double sluttpris = inn.nextDouble();
        ArrayList<Meny> midlertidig = new ArrayList<Meny>();

        midlertidig = register.menyerMellomToPriser(startpris, sluttpris);

        if (midlertidig.size() > 0) {
            for (int i = 0; i < midlertidig.size(); i++) {
                System.out.println(midlertidig.get(i).toString());
            }
        } else {
            System.out.println("Fant ingen menyer mellom disse prisene");
        }
    }
}
