public class Student {

    private final String NAVN;
    private int antOppg;

    public Student(String navn, int antOppg){
        this.NAVN = navn;
        this.antOppg = antOppg;
    }

    public String getNAVN() {
        return NAVN;
    }

    public int getAntOppg() {
        return antOppg;
    }

    public void setAntOppg(int antOppg) {
        this.antOppg += antOppg;
    }

    @Override
    public String toString() {
        return "Navn = '" + NAVN + '\'' + "Antall godkjente oppgaver =" + antOppg;
    }
}
