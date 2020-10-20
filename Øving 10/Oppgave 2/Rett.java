public class Rett {

    private final String NAVN;
    private final String TYPE;
    private final double PRIS;
    private final String OPPSKRIFT;

    public Rett(String navn, String type, double pris, String oppskrift){
        this.NAVN = navn;
        this.TYPE = type;
        this.PRIS = pris;
        this.OPPSKRIFT = oppskrift;
    }

    public String getNAVN() {
        return NAVN;
    }

    public String getTYPE() {
        return TYPE;
    }

    public double getPRIS() {
        return PRIS;
    }

    public String getOPPSKRIFT() {
        return OPPSKRIFT;
    }

    @Override
    public String toString() {
        return "Rett{" +
                "Navn='" + NAVN + '\'' +
                ", Type='" + TYPE + '\'' +
                ", Pris=" + PRIS + '\'' +
                ", Oppskrift=" + OPPSKRIFT +
                '}';
    }

    public String litenToString(){
        return "Navn:"+NAVN+", Pris:"+PRIS;
    }
}
