import java.util.Scanner;
public class MatriseTest {

    private static Matrise matriseRegning = new Matrise();
    private static Scanner inn = new Scanner(System.in);

    public static void main(String[]args) {


        System.out.println("Lag matrise 1");
        System.out.println("Hvor mange rader skal den ha?");
        int rad1 = inn.nextInt();
        System.out.println("Hvor mange kolonner skal den ha?");
        int kolonne1 = inn.nextInt();
        double[][] n = fyllMatrise(rad1,kolonne1);

        double[][] m;
        
        System.out.println("Addisjon (tast1), Multiplikasjon (tast 2), transformasjon (tast 3)");

        int valg = inn.nextInt();

        switch (valg){
            case 1:
                System.out.println("Lag matrise 2, som skal adderes med matrise 1");
                System.out.println("Begge matrisene må ha samme dimmensjon");
                m = konstruerMatrise();
                double[][] resultat1 = matriseRegning.addere(n, m);
                skrivUtMatrise(resultat1);

                break;
            case 2:
                System.out.println("Lag matrise 2, som skal multipliseres med matrise 1");
                System.out.println("PS. Antall rader i matrise 1 og kolonner i matrise 2 MÅ være likt");
                m = konstruerMatrise();
                double[][] resultat2 = matriseRegning.multiplikasjon(n, m);
                skrivUtMatrise(resultat2);
                break;
            case 3:
                double[][] resultat3 = matriseRegning.transponere(n);
                skrivUtMatrise(resultat3);
                break;
            default: System.out.println("Kun 1, 2 og 3 er gyldige input");
                break;

        }
    }
    public static void skrivUtMatrise(double[][] t) {
        if (t != null) {
            for (int i = 0; i < t.length; i++) {
                for (int j = 0; j < t[i].length; j++) {
                    System.out.print(t[i][j] + " ");
                }
                System.out.println();
            }
        }
        else {
            System.out.print("Utregningen var ikke mulig");
        }
    }

    public static double[][] konstruerMatrise(){
        System.out.println("Hvor mange rader skal den ha?");
        int rad2 = inn.nextInt();
        System.out.println("Hvor mange kolonner skal den ha?");
        int kolonne2 = inn.nextInt();
        double[][] m = fyllMatrise(rad2,kolonne2);
        return m;
    }

    public static double[][] fyllMatrise(int rader, int kolonner) {
        double[][] m = new double[rader][kolonner];

        System.out.println("Fyll inn matrisen: ");
        for(int i = 0; i < rader; i++) {
            for(int j = 0; j < kolonner; j++) {
                System.out.print("[" + i + "]" + "[" + j + "]: ");
                m[i][j] = inn.nextDouble();
            }
        }
        return m;
    }
}

