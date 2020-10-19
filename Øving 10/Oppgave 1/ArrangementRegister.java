import java.util.*;

public class ArrangementRegister {

    private ArrayList<Arrangement> arrangementer;
    private int antArrangementer = 0;

    public ArrangementRegister(){
        arrangementer = new ArrayList<Arrangement>();
    }

    public String registrerArrangement(String navn, String sted, String arrangor, String type, long dato){
        String Navn = navn.toLowerCase();
        String Sted = sted.toLowerCase();
        String Arrangor = arrangor.toLowerCase();
        String Type = type.toLowerCase();

        Arrangement registrer = new Arrangement(antArrangementer, Navn, Sted, Arrangor, Type, dato);//første er arrangement-nummer
        arrangementer.add(registrer);
        antArrangementer++;
        return "Registrering fullført";
    }

    public ArrayList<Arrangement> finnArrangementPaaSted(String sted){
        ArrayList<Arrangement> stedArr = new ArrayList<Arrangement>();
        for (int i = 0; i < arrangementer.size(); i++){
            if (arrangementer.get(i).getSTED().equals(sted)){
                stedArr.add(arrangementer.get(i));
            }
        }
        return stedArr;
    }

    public ArrayList<Arrangement> finnArrangementPaaDato(int dato){ // må sende inn en dato på samme måte som det er registrert (de 8 første tegnene) ikke med klokkeslett
        ArrayList<Arrangement> datoArr = new ArrayList<Arrangement>();

        for (int i = 0; i < arrangementer.size(); i++){
            long a = arrangementer.get(i).getDATO();
            int arrangementDato = Integer.parseInt((""+a).substring(0, 8));//får de første 8 tegnene, altså datoen
            if (arrangementDato == dato){
                datoArr.add(arrangementer.get(i));
            }
        }
        return datoArr;
    }

    public ArrayList<Arrangement> listeMellomDatoerArrangementer(long dato1, long dato2) {
        ArrayList<Arrangement> datoArr = new ArrayList<Arrangement>();

        for (int i = 0; i < arrangementer.size(); i++) {
            long a = arrangementer.get(i).getDATO();
            //int arrangementDato = arrangementer.get(i).getDATO();
            int arrangementDato = Integer.parseInt((""+a).substring(0, 8));//får de første 8 tegnene, altså datoen
            if (arrangementDato >= dato1 && arrangementDato <= dato2) {
                datoArr.add(arrangementer.get(i));
            }
        }
        Collections.sort(datoArr, new SorterPaaTid());

        return datoArr;
    }

    public ArrayList<Arrangement> sorterAllePaaTid(){
        ArrayList<Arrangement> kopi = (ArrayList<Arrangement>) arrangementer.clone();
        Collections.sort(kopi, new SorterPaaTid());
        return kopi;
    }

    public ArrayList<Arrangement> sorterAllePaaNavn(){
        ArrayList<Arrangement> kopi = (ArrayList<Arrangement>) arrangementer.clone();
        Collections.sort(kopi, new SorterPaaNavn());
        return kopi;
    }

    public ArrayList<Arrangement> sorterAllePaaSted(){
        ArrayList<Arrangement> kopi = (ArrayList<Arrangement>) arrangementer.clone();
        Collections.sort(kopi, new SorterPaaSted());
        return kopi;
    }

}
