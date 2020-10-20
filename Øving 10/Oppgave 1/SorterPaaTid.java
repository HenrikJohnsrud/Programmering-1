import java.util.Comparator;

public class SorterPaaTid implements Comparator<Arrangement>{
    @Override
    public int compare(Arrangement o1, Arrangement o2) {
        long objekt1 = o1.getDATO();
        long objekt2 = o2.getDATO();

        if(objekt1 > objekt2){
            return 1;
        }
        else if(objekt1 == objekt2){
            return 0;
        }
        else{
            return -1;
        }
    }

}
