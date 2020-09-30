import static javax.swing.JOptionPane.*;

public class ValutaTest{

    public static void main(String[] args){

        double[] rate = {8.91, 10.56, 1.02}; //Array over de ulike ratene til valutaene
        String[] navn = {"Dollar", "EURO", "SEK"}; //Array med navn til de ulike valutaene

        boolean avslutt = false; //brukes for å enten avslutte eller kjøre programmet videre
        String navnRetning = "";
        double resultat = 0;

        int rateRes = 0;
        int retningRes = 0;

        do {
            String input = showInputDialog("Velg valuta du vil benytte: \n Dollar (tast 1) \n EURO (tast 2) \n Svenske kroner (tast 3) \n AVSLUTT (tast 4)");
            int tallStart= Integer.parseInt(input); //Hva vil du konvertere? eller avslutte?
            if (tallStart == 4) {// avslutter om man velger 4(avslutt)
                avslutt = true;
            }
            else if(tallStart >= 1 && tallStart <= 3){
                for (int i=1; i<4; i++){ //finner navn på valgt valuta for å bruke den i neste inputboks
                    if (i == tallStart){
                        navnRetning = navn[i-1];
                    }
                }
                String inputRetning = showInputDialog(String.format("Hva vil du konvertere? \n NOK til %s (tast 1) \n %s til NOK (tast 2)", navnRetning,navnRetning));
                int tallRetning= Integer.parseInt(inputRetning); //Fra etter til NOK
                if (tallRetning < 0 || tallRetning > 2){showMessageDialog(null, "Kun 1 og 2 er gyldige svar");}
                else{
                    String inputSvar = showInputDialog("Hvor mange av gitt valuta vil du konvertere?");
                    double inputAntall= Double.parseDouble(inputSvar);//Hvor mange av gitt valuta skal komverteres

                    for (int j=1; j<3; j++){ //teller gjennom for nok til valuta eller motsatt
                        for (int k=1; k<4; k++){ //sjekker for første input-boks
                            if (j == tallRetning){ //om tallRetning er det samme som løkken
                                if (k == tallStart){ //om tallStart er det samme som løkken
                                    rateRes = k; //resultatet for hvilke rate som skal brukes
                                    retningRes = j;//resultatet for hvilke retning som skal brukes
                                }
                            }
                        }
                    }
                    double valgRate = rate[rateRes-1]; //finner hvilken rate jeg skal bruke fra lista "rate", ut i fra inputStart
                    Valuta Valuta = new Valuta(valgRate, inputAntall); //Lager objekt som sender data til klasse-siden

                    if (retningRes == 1){ //Om "valgt valuta til nok" ble valgt i inputRetning
                        double svar = Valuta.currency_to_nok(); //Lager en vaiabel som bruker objektet og metode fra klasse-side
                        resultat = svar; //setter utskriftsvariabelen lik den lokale variabelen i if-setningen
                    }
                    else {
                        double svar = Valuta.nok_to_currency();
                        resultat = svar;
                    }
                    showMessageDialog(null, "Resultatet etter konvertering er; " + resultat);
                }
            }
            else {
                showMessageDialog(null, "Kun input mellom 1 og 4 er gyldig");
            }
        }
        while (avslutt == false);{ //avslutter programmet hvis avslutt ble satt til true i do-delen
            showMessageDialog(null, "Programmet er avsluttet");
        }
    }
}
