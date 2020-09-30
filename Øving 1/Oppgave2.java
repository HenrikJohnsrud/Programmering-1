import static javax.swing.JOptionPane.*;
class Oppgave2 {
    public static void main(String[] args) {
        String tidTimer = showInputDialog("timer:");
        String tidMinutter = showInputDialog("minutter:");
        String tidSekunder = showInputDialog("sekunder:");

        double timer= Double.parseDouble(tidTimer);
        double minutter= Double.parseDouble(tidMinutter);
        double sekunder= Double.parseDouble(tidSekunder);

        double resultatTimer = timer * 3600;
        double resultatMinutter = minutter * 60;

        double resultatTotalt = resultatTimer + resultatMinutter + sekunder;

        showMessageDialog(null, timer + " timer, " + minutter + " minutter og " + sekunder + " sekunder er totalt " + resultatTotalt + "sekunder");
    }
}
