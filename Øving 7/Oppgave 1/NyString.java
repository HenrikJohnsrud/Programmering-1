import java.util.Scanner;
public class NyString {

    private String tekst;

    public NyString(String tekst){
        this.tekst = tekst;
    }

    public String forkortString(){
        String[] splittet = tekst.split("\\s+");
        String output = "";
        for (int i = 0; i < splittet.length; i++) {
            String forsteBokstav = String.valueOf(splittet[i].charAt(0));
            output += forsteBokstav;
        }
        return output;
    }

    public String fjernTegn(String tegn){
        String nyStr = tekst.replaceAll(tegn, "");
        return nyStr;
    }


}
