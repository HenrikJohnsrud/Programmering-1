
public class ArbTaker {


    private int arbtakernr;
    private int ansettelsesaar;
    private double maanedslonn;
    private double skattProsent;
    private Person personlia;

    private int aar;


    public ArbTaker(Person personlia, int arbtakernr, int ansettelsesaar, double maanedslonn, double skattProsent){
        this.arbtakernr = arbtakernr;
        this.ansettelsesaar = ansettelsesaar;
        this.maanedslonn = maanedslonn;
        this.skattProsent = skattProsent;
        this.personlia = personlia;

        java.util.GregorianCalendar kalender = new java.util.GregorianCalendar();
        this.aar = kalender.get(java.util.Calendar.YEAR);


    }

    public int getArbtakernr() {
        return arbtakernr;
    }
    public int getAnsettelsesaar() {
        return ansettelsesaar;
    }
    public double getMaanedslonn() {
        return maanedslonn;
    }
    public double getSkattProsent() {
        return skattProsent;
    }

    public void setAnsettelsesaar(int ansettAar) { this.ansettelsesaar = ansettAar; }
    public void setArbtakernr(int arbTakerNr) { this.arbtakernr = arbTakerNr; }
    public void setMaanedslonn(double lonn) { this.maanedslonn = lonn; }
    public void setSkattProsent(double skatt) {
        this.skattProsent = skatt;
    }

    public double skattetrekkPerMaaned(){
        return maanedslonn * (skattProsent / 100);
    }

    public double bruttoLonnPerAar(){
        return maanedslonn * 12;
    }

    public double skattetrekkPerAar(){
        double totalt = 10 * skattetrekkPerMaaned();//alle månedene untatt desember og juni (ikke skatt i juni)
        totalt += 0.5 * skattetrekkPerMaaned(); //halv skatt i desember
        return totalt;
    }

    public String navnString(){
        return personlia.getEtternavn() + ", " + personlia.getFornavn();
    }

    public int personAlder(){
        return aar - personlia.getFodelsaar();
    }

    public int aarIBedrift(){
        return aar-ansettelsesaar;
    }

    public String ansattAarTest(int aar){
        if (aarIBedrift() > aar){
            return "Personen har vært ansatt i flere år enn " + aar + " år";
        }
        else if (aarIBedrift()==aar){
            return "Personen har vært ansatt i " + aar;
        }
        else{
            return "Personen har vært ansatt i færre enn " + aar + " år";
        }
    }
}
