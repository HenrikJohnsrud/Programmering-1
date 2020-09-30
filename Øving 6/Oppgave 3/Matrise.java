import javax.swing.*;

public class Matrise {


    public Matrise (){
    }


    public double[][] addere(double[][] m, double[][] n){ //m og n må ha samme dim for å kunne gjennomføres
        int rader = m.length;
        int kolonner = m[0].length;
        double[][] resultat = new double[rader][kolonner];
        if (m.length == n.length && m[0].length == n[0].length){
            for (int i = 0; i < rader; i++) {
                for (int j = 0; j < kolonner; j++) {
                    resultat[i][j] = m[i][j] + n[i][j];
                }
            }
        }
        else {
            resultat = null;
        }
        return resultat;
    }

    public double[][] multiplikasjon(double[][] matrise1, double[][] matrise2) {
        double[][] resultat = new double[matrise1.length][matrise2[0].length];
        if (matrise1[0].length == matrise2.length) {
            for (int rad = 0; rad < resultat.length; rad++) {
                for (int kol = 0; kol < resultat[rad].length; kol++) {
                    resultat[rad][kol] = multiplyMatricesCell(matrise1, matrise2, rad, kol);
                }
            }
        }
        else {
            resultat = null;
        }
        return resultat;
    }
    public double multiplyMatricesCell(double[][] matrise1, double[][] matrise2, int rad, int kol) {
        double cell = 0;
        for (int i = 0; i < matrise2.length; i++) {
            cell += matrise1[rad][i] * matrise2[i][kol];
        }
        return cell;
    }

    public double[][] transponere(double[][] a) {
        int rader = a.length;
        int kolonner = a[0].length;
        double[][] reultat = new double[kolonner][rader];
        for (int i = 0; i < rader; i++) {
            for (int j = 0; j < kolonner; j++) {
                reultat[j][i] = a[i][j];
            }
        }
        return reultat;
    }
}
