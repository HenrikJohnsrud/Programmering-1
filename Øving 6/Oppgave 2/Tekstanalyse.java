
public class Tekstanalyse {

    private String tekst;
    private int [] antallTegn = new int[30];
    private char [] bokstaver = new char[] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','æ','ø','å'};

    public Tekstanalyse(String tekst){
        //Gjør om til små bokstaver
        this.tekst = tekst.toLowerCase();
        for (int a = 0; a < 30; a++){
            antallTegn[a] = 0;
        }
        //Legger karakterene i teksten inn i en tabell
        for (int i = 0; i < tekst.length(); i++){
            char result = tekst.charAt(i);
            int test = 0;
            for (int a = 0; a < 29; a++){
                if (result == bokstaver[a]) {
                    antallTegn[a] += 1;
                    test = 1;
                }
            }
            if (test == 0){
                antallTegn[29]++;
            }
        }
    }


    public int antForskjellige(){
        int teller = 0;
        for (int i = 0; i < 29; i++){
            if (antallTegn[i] > 0){
                teller++;
            }
        }
        return teller;
    }

    public int antBokstaverTotalt() {
        int teller = 0;
        for (int i = 0; i < 29; i++) {
            teller += antallTegn[i];
        }
        return teller;
    }

    public double prosentIkkeBokstaver(){
        double resultat;
        double ikkeBokstav = antallTegn[29];
        double bokstaverTotalt = antBokstaverTotalt();
        if (bokstaverTotalt == 0){
            resultat = 100;
        }
        else {
            resultat = (ikkeBokstav / tekst.length()) * 100;
        }
        return resultat;
    }

    public int antForekomster(char bokstav){
        int antall = 0;
        for (int i = 0; i < bokstaver.length; i++){
            if (bokstav == bokstaver[i]){ // Hvis parameter == bokstav fra bokstav-tabell
                antall = antallTegn[i];
            }
        }
        return antall;
    }

    public String flestForekomster(){
        String output = "";
        int antTopp = 0;
        for (int i = 0; i < 29; i++){
            if (antallTegn[i] > antTopp){ //finner det høyeste antallet en bokstav forekommer
                antTopp = antallTegn[i];
            }
        }
        for (int j = 0; j < 29; j++){
            if(antallTegn[j]==antTopp){
                char bokstav = bokstaver[j];
                String ut = String.valueOf(bokstav); //gjør om char(fra tabell) til string (output)
                output += " " + ut;
            }
        }
        return output;
    }
}
