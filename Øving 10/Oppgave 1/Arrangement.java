import java.util.Comparator;

public class Arrangement{

    private final int NUMMER;
    private final String NAVN;
    private final String STED;
    private final String ARRANGOR;
    private final String TYPE;
    private final long DATO;

    public Arrangement(int nummer, String navn, String sted, String arrangor, String type, long dato){
        this.NUMMER = nummer;
        this.NAVN = navn;
        this.STED = sted;
        this.ARRANGOR = arrangor;
        this.TYPE = type;
        this.DATO = dato;
    }

    public int getNUMMER() {
        return NUMMER;
    }
    public String getNAVN() {
        return NAVN;
    }
    public String getSTED() {
        return STED;
    }
    public String getARRANGOR() {
        return ARRANGOR;
    }
    public String getTYPE() {
        return TYPE;
    }
    public long getDATO() {
        return DATO;
    }


    @Override
    public String toString() {
        return "Arrangement-nummer=" + NUMMER +
                ", Navn='" + NAVN + '\'' +
                ", Sted='" + STED + '\'' +
                ", Arrangør='" + ARRANGOR + '\'' +
                ", Type='" + TYPE + '\'' +
                ", Dato=" + DATO;
    }
}
