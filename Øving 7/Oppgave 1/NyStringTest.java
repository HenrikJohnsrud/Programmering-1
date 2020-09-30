import java.util.Scanner;

public class NyStringTest {
    public static void main(String[]args){

        System.out.println("Skriv inn teksten du vil bruke:");
        Scanner inn = new Scanner(System.in);
        String tekst = "";
        tekst += inn.nextLine();

        NyString analyse = new NyString(tekst);

        System.out.println("Den forkortede versjonen av teksten er:");
        System.out.println(analyse.forkortString());
        String tegn = "e";
        System.out.println(analyse.fjernTegn(tegn));

    }

}
