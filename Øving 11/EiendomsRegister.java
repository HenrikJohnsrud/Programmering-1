import java.util.ArrayList;
/**
 * En klasse som administrerer et eiendoms-register.
 * @version 29.10.2020
 * @author Henrik Johnsrud
 */
public class EiendomsRegister {

    /**
     * Liste av eiendommer
     * Bruker ArrayList fordi den er veldig enkel å utvide med flere eiendommer, i motsetning til et fixed Array
     */
    private ArrayList<Eiendom> eiendommer;
    private int antallEiendommer = 0;

    /**
     * Oppretter en ny tom ArrayList
     */
    public EiendomsRegister(){
        eiendommer = new ArrayList<Eiendom>();
    }

    /**
     *lager en ny eiendom og legger den til i registeret
     * @param kNr kommunenummer
     * @param kNavn kommunenavn
     * @param gnr gaardsnummer
     * @param bnr bruksnummer
     * @param bNavn bruksnavn
     * @param areal Areal i m^2
     * @param eier navn på eier
     *
     * @return en boolean = true om registreringen er vellykket
     */
    public boolean registrerEiendom(int kNr, String kNavn, int gnr, int bnr, String bNavn, double areal, String eier){
        Eiendom nyEiendom = new Eiendom(kNr, kNavn, gnr, bnr, bNavn, areal, eier);
        eiendommer.add(nyEiendom);
        antallEiendommer++;
        return true;
    }

    /**
     * @return null hvis ingen eiendommer er registrert, eiendom-ArrayListen hvis den inneholder noe
     */
    public ArrayList<Eiendom> alleEiendommer(){
        if (eiendommer.size()==0){
            return null;
        }
        return eiendommer;
    }

    /**
     * @return antall eiendommer i registeret
     */
    public int getAntallEiendommer() {
        return antallEiendommer;
    }

    /**
     * Sletter en gitt eiendom fra ArrayListen
     * @param kNr kommunenummer
     * @param gNr gaardsnummer
     * @param bNr bruksnummer
     *
     * @return returnerer true dersom en eiendom i registeret matcher og er slettet, ellers returerer den false
     */
    public boolean slettEiendom(int kNr, int gNr, int bNr){
        for (int i = 0; i<eiendommer.size(); i++){
            int eiendomKommunenummer = eiendommer.get(i).getKOMMUNENUMMER();
            int eiendomGaardsnummer = eiendommer.get(i).getGAARDSNUMMER();
            int eiendiomBruksnummer = eiendommer.get(i).getBRUKSNUMMER();
            if (kNr==eiendomKommunenummer && gNr==eiendomGaardsnummer && bNr==eiendiomBruksnummer){
                eiendommer.remove(i);
                return true;
            }
        }
        return false;
    }

    /**
     * Finner en spesifikk eiendom i listen
     * @param kNr kommunenummer
     * @param gNr gaardsnummer
     * @param bNr bruksnummer
     * @return Eiendom om funnet, ellers returnerer den null
     */
    public String finnEiendom(int kNr, int gNr, int bNr){
        String eiendom = "";
        for (int i = 0; i<eiendommer.size(); i++){
            int eiendomKommunenummer = eiendommer.get(i).getKOMMUNENUMMER();
            int eiendomGaardsnummer = eiendommer.get(i).getGAARDSNUMMER();
            int eiendiomBruksnummer = eiendommer.get(i).getBRUKSNUMMER();
            if (kNr==eiendomKommunenummer && gNr==eiendomGaardsnummer && bNr==eiendiomBruksnummer){
                eiendom = eiendommer.get(i).toString();
                return eiendom;
            }
        }
        return null;
    }

    /**
     * Finn gjennomsnittarealet på alle eiendommene i listen
     * @return gjennomsnittsareal på alle tomtene i registeret
     */
    public double tomtGjennomsnittAreal(){
        double totalareal = 0;
        for (int i = 0; i<eiendommer.size(); i++){
            totalareal += eiendommer.get(i).getAREAL();
        }
        return totalareal/eiendommer.size();
    }

    /**
     * Finn alle eiendommene med et gitt gaardsnummer
     * @param gNr gaardsnummer
     * @return en ArrayList med alle eiendommene med matchende gaardsnummer, null hvis det ikke fantes noen match
     */
    public ArrayList<Eiendom> eiendommerMedGaardsnummer(int gNr){
        ArrayList<Eiendom> midlertidigArrayList = new ArrayList<Eiendom>();

        for (int i = 0; i<eiendommer.size(); i++){
            if (eiendommer.get(i).getGAARDSNUMMER()==gNr){
                midlertidigArrayList.add(eiendommer.get(i));
            }
        }
        if (midlertidigArrayList.size()==0){
            return null;
        }
        return midlertidigArrayList;
    }

}
