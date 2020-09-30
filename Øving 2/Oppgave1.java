import static javax.swing.JOptionPane.*;
class Oppgave1 { 
    public static void main(String[] args) {
        String arstall = showInputDialog("Hvilke år skal du teste?");
        double ar= Double.parseDouble(arstall);
        double arFire=ar%4;
        double arHundre=ar%100;
        double arFirehundre=ar%400;

        boolean result;

        if (arFire==0){ //Ser om År er et skuddår
            if (arHundre==0){ //Ser om År er et århundre
                if (arFirehundre==0){ //Ser om År er et skuddår
                    result = true;
                }
                else {result = false;} //Dersom År er skuddår, og et århundre men ikke kan deles på 400
            }
            else {result = true;}//År er et skuddår (ikke århundre)
        }
        else {result = false;}//Kan ikke deles på 4 --> ikke skuddår

        if (result == true){
            showMessageDialog(null, (int)ar + " er et skuddår");
        }
        else{
            showMessageDialog(null, (int)ar + " er ikke et skuddår");

        }

    }
}
