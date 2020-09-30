
public class BroekKalkulator{

    private double teller, nevner, resTeller, resNevner;
    private String resTotal, resUtskrift;

    public BroekKalkulator(double teller, double nevner) {
        if (nevner == 0) {
            throw new IllegalArgumentException("Nevneren kan ikke være lik 0");
        } else {
            this.teller = teller;
            this.nevner = nevner;
        }
    }

    public BroekKalkulator(double teller) {
        this.teller = teller;
        this.nevner = 1;
    }

    public void addere(BroekKalkulator b){
        double utvidetTeller1 = this.teller * b.nevner;
        double utvidetTeller2 = b.teller * this.nevner;
        this.resTeller = utvidetTeller1 + utvidetTeller2;
        this.resNevner = this.nevner * b.nevner;
        this.resTotal = this.resTeller + "/" + this.resNevner;
        this.resUtskrift = "(" + this.teller + "/" + this.nevner + ") + (" + b.teller + "/" + b.nevner + ")";
    }

    public void subtrahere(BroekKalkulator b){
        double utvidetTeller1 = this.teller * b.nevner;
        double utvidetTeller2 = b.teller * this.nevner;
        this.resTeller = utvidetTeller1 - utvidetTeller2;
        this.resNevner = this.nevner * b.nevner;
        this.resTotal = this.resTeller + "/" + this.resNevner;
        this.resUtskrift = "(" + this.teller + "/" + this.nevner + ") - (" + b.teller + "/" + b.nevner + ")";
    }

    public void multiplisere(BroekKalkulator b){
        this.resTeller = this.teller * b.teller;
        this.resNevner = this.nevner * b.nevner;
        this.resTotal = this.resTeller + "/" + this.resNevner;
        this.resUtskrift = "(" + this.teller + "/" + this.nevner + ") * (" + b.teller + "/" + b.nevner + ")";
    }

    public void dividere(BroekKalkulator b){
        this.resTeller = this.teller * b.nevner;
        this.resNevner = this.nevner * b.teller;
        if (this.resNevner == 0){
            this.resTotal = "Teller / 0 er ikke et gyldig tall";}
        else{
            this.resTotal = this.resTeller + "/" + this.resNevner;}
        this.resUtskrift = "(" + this.teller + "/" + this.nevner + ") / (" + b.teller + "/" + b.nevner + ")";
    }

    public String getResultat(){
        return this.resUtskrift + " = " + this.resTotal;
    }


    public static void main(String [] args){

        BroekKalkulator a = new BroekKalkulator(1,1); //en metode for hver av brøkene
        BroekKalkulator b = new BroekKalkulator(1,2);

        a.addere(b);//bruker a som this.teller og nevner og b i metoden som brøk nummer 2
        System.out.println(a.getResultat());
        a.subtrahere(b);
        System.out.println(a.getResultat());
        a.multiplisere(b);
        System.out.println(a.getResultat());
        a.dividere(b);
        System.out.println(a.getResultat());
    }
}

