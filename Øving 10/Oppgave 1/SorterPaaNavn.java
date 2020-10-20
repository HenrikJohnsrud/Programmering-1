import java.util.Comparator;

public class SorterPaaNavn implements Comparator<Arrangement> {
    @Override
    public int compare(Arrangement o1, Arrangement o2) {
        String navnArrangement1 = o1.getNAVN().toLowerCase();
        String navnArrangement2 = o2.getNAVN().toLowerCase();

        return navnArrangement1.compareTo(navnArrangement2);//sortere alfabetisk
    }
}


