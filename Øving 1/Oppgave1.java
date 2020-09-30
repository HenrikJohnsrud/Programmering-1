import static javax.swing.JOptionPane.*;
class Oppgave1 {
    public static void main(String[] args) {
        String lengdeLest = showInputDialog("Lengde (Tommer): ");
        double lengde= Double.parseDouble(lengdeLest);
        double resultat = lengde * 2.54;
        showMessageDialog(null, lengde + " tommer = " + resultat + " centimeter");
    }
}
