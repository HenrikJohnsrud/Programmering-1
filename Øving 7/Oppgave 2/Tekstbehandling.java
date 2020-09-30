public class Tekstbehandling {

    private String tekst;
    private String[] splittet;
   // private String[] periodeSplitt;



    public Tekstbehandling(String tekst){
        this.tekst = tekst;
    }

    public int antOrd(){
        splittet = tekst.split("\\s+");
        if (splittet[0].length()==0){
            throw new IllegalArgumentException("Du må sende inn en tekst");
        }
        else {
            return splittet.length;
        }
    }

    public double averageOrdlengde(){
        double total = 0;
        for (int i = 0; i < antOrd(); i++){
            total += splittet[i].length();
        }
        double antOrd = antOrd();
        return total/antOrd;
    }

    public double averageOrdPerPeiode(){
        String[]periodeSplitt=tekst.split("[!,?.]");//splitter på ! ? . ,
        double antallOrd=0;
        for(int i=0;i<periodeSplitt.length;i++ ){
            String[]ord=periodeSplitt[i].split("\\s+");//legger antall ord i perioden inn i nytt array
            antallOrd+=ord.length;
        }
        double antPerioder = periodeSplitt.length;
        return antallOrd/antPerioder;
    }

    public String byttOrd(String byttFra, String byttTil){
        String resultat = tekst;
        resultat = resultat.replace(" "+byttFra+" ", " "+byttTil+" ");
        return resultat;
    }

    public String getTekst(){
        return tekst;
    }

    public String getTekstStore(){
        String ut = tekst.toUpperCase();
        return ut;
    }
}
