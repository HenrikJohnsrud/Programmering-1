import java.util.Scanner;

public class Program {

    public static void main(String[]args){

        String navn1 = "Henrik";
        int antOppg1 = 3;
        String navn2 = "Trym";
        int antOppg2 = 8;

        Oppgaveoversikt register = new Oppgaveoversikt();

        register.registrerStudent(navn1,antOppg1);

        Scanner inn = new Scanner(System.in);


        boolean loop = true;
        while (loop) {
            System.out.println("Velg opppgave du vil utføre");
            System.out.println("Tast 1: Få antall studenter i systemet");
            System.out.println("Tast 2: Registere en ny student");
            System.out.println("Tast 3: Få antall godkjente oppgaver til en bestemt student");
            System.out.println("Tast 4: Øke antall oppgaver til en bestemt student");
            System.out.println("Tast 5: Avslutt program");
            int valg = inn.nextInt();
            switch (valg) {
                case 1:
                    System.out.println(register.toString());
                    break;
                case 2:
                    System.out.println("Skriv inn navnet på han/hun du vil registrere:");
                    String navn = "";
                    navn += inn.next();
                    System.out.println("Skriv inn antall godkjente oppgaver:");
                    int antOppg = inn.nextInt();
                    System.out.println(register.registrerStudent(navn, antOppg));
                    break;
                case 3:
                    System.out.println("Skriv inn navnet på han/hun du vil få antall oppgaver fra:");
                    String studentAntOppgaver = "";
                    studentAntOppgaver += inn.next();
                    System.out.println("\n" + studentAntOppgaver + " har " + register.antOppgStudent(studentAntOppgaver) + " registrerte oppgaver");
                    break;
                case 4:
                    System.out.println("Skriv inn navnet på han/hun du vil øke antall godkjente oppgaver til:");
                    String studentOek = inn.next();
                    System.out.println("Hvor mange registrerte oppgaver vil du øke med?");
                    int antOppgOek = inn.nextInt();
                    register.oekAntOppgStudent(studentOek,antOppgOek);
                    System.out.println(studentOek + " har nå " + register.antOppgStudent(studentOek) + " registrerte oppgaver");
                    break;
                case 5:
                    System.out.println("Programmet er avsluttet");
                    loop = false;
                    break;
                default:
                    System.out.println("Venligst tast inn et tall mellom 1 og 5");
                    break;
            } // Switch
        }// While
    }
}
