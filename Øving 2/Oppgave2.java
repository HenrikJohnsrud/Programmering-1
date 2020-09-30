import static javax.swing.JOptionPane.*;

import java.text.Format;

class Oppgave2 { 
    public static void main(String[] args) {
       double kjottA_vekt = 450;
       double kjottB_vekt = 500;

       double kjottA_pris = 35.90;
       double kjottB_pris = 39.50;

       double kjottA_forhold = kjottA_vekt / kjottA_pris;
       double kjottB_forhold = kjottB_vekt / kjottB_pris;


       if (kjottA_forhold > kjottB_forhold){ //Hvis A har lavere pris/gram
        showMessageDialog(null, "Kjøttdeig fra merke A har lavest pris per gram, som er: " + kjottA_forhold);
       }

       else { //Hvis B har lavere pris/gram
        showMessageDialog(null, "Kjøttdeig fra merke B har lavest pris per gram, som er: " + kjottB_forhold);
       }
    }
}
