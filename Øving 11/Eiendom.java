import java.util.concurrent.BrokenBarrierException;

/**
 * En klasse som representerer en Eiendom.
 * @version 29.10.2020
 * @author Henrik Johnsrud
 */

public class Eiendom {

    private final int KOMMUNENUMMER;
    private final String KOMMUNENAVN;
    private final int GAARDSNUMMER;
    private final int BRUKSNUMMER;
    private String bruksnavn;
    private final double AREAL;
    private String navnEier;

    /**
     *  Konstruktør
     * @param kommunenummer Nummer til kommunen eiendommen ligger i
     * @param kommunenavn Kommunen eiendommer ligger i
     * @param gaardsnummer Gaardsnummer
     * @param bruksnummer Bruksnummer
     * @param bruksnavn Navnet eieren har gitt bruket
     * @param areal Areal av tomten i m^2
     * @param navnEier Navnet til han/hun eiendommer er registrert på
     */

    public Eiendom(int kommunenummer, String kommunenavn, int gaardsnummer, int bruksnummer, String bruksnavn, double areal, String navnEier){
        this.KOMMUNENUMMER = kommunenummer;
        this.KOMMUNENAVN = kommunenavn;
        this.GAARDSNUMMER = gaardsnummer;
        this.BRUKSNUMMER = bruksnummer;
        this.bruksnavn = bruksnavn;
        this.AREAL = areal;
        this.navnEier = navnEier;
    }
    /**
     * @return returnerer kommunenummeret til eiendommen
     */
    public int getKOMMUNENUMMER() {
        return KOMMUNENUMMER;
    }

    /**
     * @return returner navnet på kommunen
     */
    public String getKOMMUNENAVN() {
        return KOMMUNENAVN;
    }

    /**
     * @return returner gaardsnummeret til eiendommen
     */
    public int getGAARDSNUMMER() {
        return GAARDSNUMMER;
    }

    /**
     * @return returner bruksnummeret til eiendommen
     */
    public int getBRUKSNUMMER() {
        return BRUKSNUMMER;
    }

    /**
     * @return returner navnet på bruket
     */
    public String getBruksnavn() {
        return bruksnavn;
    }

    /**
     * @return returner tomtearealet til eiendommen
     */
    public double getAREAL() {
        return AREAL;
    }

    /**
     * @return returner navnet til eieren av eiendommen
     */
    public String getNavnEier() {
        return navnEier;
    }

    /**
     * @param bruksnavn nytt navn på bruket
     */
    public void setBruksnavn(String bruksnavn) {
        this.bruksnavn = bruksnavn;
    }

    /**
     * @param navnEier nytt navn på eier av eiendommen
     */
    public void setNavnEier(String navnEier) {
        this.navnEier = navnEier;
    }

    /**
     * Gir ID-en til eiendommen. Som skrives på formen kommuneNr-gaardsNr/bruksNr
     */
    public String eiendomsId(){
        return KOMMUNENUMMER+"-"+GAARDSNUMMER+"/"+ BRUKSNUMMER;
    }

    @Override
    public String toString() {
        return "Eiendom{" +
                "Kommunenummer=" + KOMMUNENUMMER +
                ", Kommunenavn='" + KOMMUNENAVN + '\'' +
                ", Gårdsnumer=" + GAARDSNUMMER +
                ", Bruksnummer=" + BRUKSNUMMER +
                ", Bruksnavn='" + bruksnavn + '\'' +
                ", Areal=" + AREAL +
                ", Navn på eier='" + navnEier + '\'' +
                '}';
    }
}
