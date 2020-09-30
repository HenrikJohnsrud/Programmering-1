import java.net.PortUnreachableException;

public class Person {

    private final String FORNAVN;
    private final String ETTERNAVN;
    private final int FODSELSAAR;

    public Person (String fornavn, String etternavn, int fodelsaar){
        this.FORNAVN = fornavn;
        this.ETTERNAVN = etternavn;
        this.FODSELSAAR = fodelsaar;
    }
    public String getFornavn() {
        return FORNAVN;
    }

    public String getEtternavn() {
        return ETTERNAVN;
    }

    public int getFodelsaar() {
        return FODSELSAAR;
    }
}
