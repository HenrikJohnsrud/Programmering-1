import static javax.swing.JOptionPane.*;
public class Oppgave3 {
    public static void main(String[] args) {
        String tidSekunder = showInputDialog("Sekunder");

        double sekunderStart= Double.parseDouble(tidSekunder);
        int verdi = (int)sekunderStart;
        
        int senderTime=3600;
        int senderMin=60;

        double resultatTimerHeltallsdiv = verdi/senderTime;
        int restResultatTimer= verdi%senderTime;

        double resultatMinHeltallsdiv= restResultatTimer/senderMin;
        int restResultatMin= restResultatTimer%senderMin;

        double resultatSek=restResultatMin%senderMin;

        

        showMessageDialog(null, resultatTimerHeltallsdiv + "Timer, "+resultatMinHeltallsdiv+ " Minutter og "+resultatSek+" sekunder");
    }
}
