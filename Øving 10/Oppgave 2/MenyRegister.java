import java.util.ArrayList;

public class MenyRegister {

    private ArrayList<Rett> retter;
    private ArrayList<Meny> menyer;

    public MenyRegister(){
        retter = new ArrayList<Rett>();
        menyer = new ArrayList<Meny>();
    }

    public ArrayList<Meny> getMenyer() {
        return menyer;
    }

    public ArrayList<Rett> getRetter() {
        return retter;
    }

    public Rett registrerRett(String navn, String type, double pris, String oppskrift){
        String navnLower = navn.toLowerCase();
        String typeLower = type.toLowerCase();
        String oppskriftLower = oppskrift.toLowerCase();
        Rett nyRett = new Rett(navnLower,typeLower,pris, oppskriftLower);
        retter.add(nyRett);
        return nyRett;
    }

    public String finnRettPaaNavn(String navn){
        String navnLower = navn.toLowerCase();
        for (int i = 0; i < retter.size(); i++){
            if (retter.get(i).getNAVN().equals(navnLower)){
                return retter.get(i).toString();
            }
        }
        return "Fant ingen rett med det navnet";
    }

    public ArrayList<Rett> finnRettPaaType(String type){
        String typeLower = type.toLowerCase();
        ArrayList<Rett> midlertidigArray = new ArrayList<Rett>();
        for (int i = 0; i < retter.size(); i++){
            if(retter.get(i).getTYPE().equals(typeLower)){
                midlertidigArray.add(retter.get(i));
            }
        }
        return midlertidigArray;
    }

    public Meny registrerMeny(ArrayList<Rett> nyMeny){
        Meny meny = new Meny(nyMeny);
        menyer.add(meny);
        return meny;
    }

    public ArrayList<Meny> menyerMellomToPriser(double startPris, double sluttPris){
        ArrayList<Meny> midlertidigArrayList = new ArrayList<Meny>();
        for (int i = 0; i<menyer.size(); i++){
            if (menyer.get(i).getTotalpris() >= startPris && menyer.get(i).getTotalpris() < sluttPris){
                midlertidigArrayList.add(menyer.get(i));
            }
        }
        return midlertidigArrayList;
    }
}
