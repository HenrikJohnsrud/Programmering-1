package Oving5;

import java.util.Random;
import java.util.Scanner;


public class MinRandom{

    private java.util.Random random;

    public MinRandom(){
        this.random = new Random();
    }

    public int nesteHeltall(int nedre, int ovre){
        int differnase = ovre - nedre + 1;
        int resultat = random.nextInt(differnase); //Lager tall fra 0 til differansen mellom grensene
        resultat = resultat + nedre; //Legger til nedre grense
        return resultat;
    }

    public double nesteDesimaltall(double nedre, double ovre){
        double differnase = ovre - nedre + 1;
        double resultat = random.nextDouble(); //Lager tilfeldig double mellom 0 og 1 (1 er ikke med)
        resultat = nedre + (resultat * differnase); //Legger til grense og ganger med differanse for å få mellom grensene
        return resultat;
    }

    public static void main(String [] args){
        System.out.println("Tast 1 for heltall, Tast 2 for demaltall");
        Scanner inn = new Scanner(System.in);
        int valg = inn.nextInt();
        MinRandom klasse = new MinRandom();

        System.out.println("Tast inn nedre og øvre grense");
        Scanner input = new Scanner(System.in);

        if (valg < 0 || valg > 2){
            System.out.println("Kun 1 og 2 er gyldige input");
        }
        else {
            if (valg==1){
                int nedre = input.nextInt();
                int ovre = input.nextInt();
                if (nedre < ovre){
                    int resultat = klasse.nesteHeltall(nedre, ovre);
                    System.out.println("Det tilfeldige heltallet innenfor intervallet ble: " + resultat);
                }
                else{
                    System.out.println("Den nedre grensen må være mindre enn den øvre");
                }
            }
            else {
                double nedre = input.nextDouble();
                double ovre = input.nextDouble();
                if (nedre < ovre){
                    double resultat = klasse.nesteDesimaltall(nedre, ovre);
                    System.out.println("Det tilfeldige desimaltallet innenfor intervallet ble: " + resultat);
                }
                else{
                    System.out.println("Den nedre grensen må være mindre enn den øvre");
                }
            }
        }
    }
}
