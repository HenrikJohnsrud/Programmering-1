import java.util.ArrayList;

public class Meny {

    private ArrayList<Rett> menyRetter;

    public Meny(ArrayList<Rett> menyRetter) {
        this.menyRetter = menyRetter;
    }

    public ArrayList<Rett> getMenyRetter() {
        return menyRetter;
    }

    // Hent totalprisen til menyen
    public double getTotalpris() {
        double pris = 0;
        for (int i = 0; i < getMenyRetter().size(); i++) {
            pris = pris + getMenyRetter().get(i).getPRIS();
        }
        return pris;
    }

    @Override
    public String toString() {
        String retter = "";
        for (int i = 0; i<menyRetter.size();i++){
            if (retter.equals("")){
                retter = menyRetter.get(i).litenToString();
            }
            else {
                retter += ", " + menyRetter.get(i).litenToString();
            }
        }
        return "Denne menyen består av følgende: "+retter+". Med totalpris på: "+getTotalpris();
    }
}
