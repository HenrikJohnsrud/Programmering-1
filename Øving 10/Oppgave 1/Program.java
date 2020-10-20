import java.util.ArrayList;
import java.util.Scanner;

public class Program {

    private static Scanner inn = new Scanner(System.in);
    private static ArrangementRegister register = new ArrangementRegister();


    public static void main(String[]args){

        boolean loop = true;
        while (loop) {
            System.out.println("Velg opppgave du vil utføre");
            System.out.println("Tast 1: Registrere et nytt arrangement");
            System.out.println("Tast 2: Finne alle arrangementene på et bestemt sted");
            System.out.println("Tast 3: Finne alle arrangementene på en bestemt dato");
            System.out.println("Tast 4: Finne alle arrangementene mellom to datoer");
            System.out.println("Tast 5: Få en liste over alle arrangementene");
            System.out.println("Tast 6: Avslutt program");
            int valg = inn.nextInt();
            switch (valg) {
                case 1:
                    registrerArrangement();
                    break;
                case 2:
                    System.out.println("Skriv inn navnet på stedet du vil hente arrangementer fra");
                    String sted = inn.next();
                    skrivUtArrangementer(register.finnArrangementPaaSted(sted));
                    break;
                case 3:
                    System.out.println("Skriv inn dato på stedet du vil hente arrangementer fra");
                    System.out.println("på formen (ååååmmdd)");
                    int dato = inn.nextInt();
                    skrivUtArrangementer(register.finnArrangementPaaDato(dato));
                    break;
                case 4:
                    mellomDatoArrangementer();
                    break;
                case 5:
                    alleArrangenter();
                    break;
                case 6:
                    System.out.println("Programmet er avsluttet");
                    loop = false;
                    break;
                default:
                    System.out.println("Venligst tast inn et tall mellom 1 og 5");
                    break;
            } // Switch
        }// While
    }

    public static void skrivUtArrangementer(ArrayList<Arrangement> liste) {
        System.out.println("");
        if (liste.size() > 0) {
            for (int i = 0; i < liste.size(); i++) {
                System.out.println(liste.get(i).toString());
            }
        } else {
            System.out.println("Fant ingen arrangementer");
        }
    }

    private static void registrerArrangement(){
        System.out.println("Fyll inn følgenede info om arrangementet som skal registreres:");
        System.out.println("Navnet på arrangement:");
        String navn = inn.next();
        System.out.println("Navnet på stedet");
        String sted = inn.next();
        System.out.println("Navnet på arrangøren");
        String arrangor = inn.next();
        System.out.println("Type arrangement");
        String type = inn.next();
        System.out.println("Dato (ååååmmdd)");
        long dato = inn.nextLong();

        System.out.println(register.registrerArrangement(navn, sted, arrangor, type, dato));
    }

    private static void mellomDatoArrangementer() {
        System.out.println("Skriv inn den startdato (ååååmmdd)");
        long dato1 = inn.nextLong();
        System.out.println("Skriv inn den sluttdato (ååååmmdd)");
        long dato2 = inn.nextLong();
        if (dato1 < dato2) {
            skrivUtArrangementer(register.listeMellomDatoerArrangementer(dato1, dato2));
        } else {
            System.out.println("Sluttdatoen må komme etter startdatoen!");
        }
    }

    private static void alleArrangenter(){
        System.out.println("Tast 1: Sorter etter tid \nTast 2: Sorter etter navn \nTast 3: Etter sted");
        int valg = inn.nextInt();

        switch (valg){
            case 1:
                skrivUtArrangementer(register.sorterAllePaaTid());
                break;
            case 2:
                skrivUtArrangementer(register.sorterAllePaaNavn());
                break;
            case 3:
                skrivUtArrangementer(register.sorterAllePaaSted());
                break;
            default: System.out.println("Kun 1,2 og 3 er gyldige input");
                break;
        }
    }
}
