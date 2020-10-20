import java.util.Comparator;

public class SorterPaaSted implements Comparator<Arrangement> {

    @Override
    public int compare(Arrangement o1, Arrangement o2) {
        String stedArrangement1 = o1.getSTED().toLowerCase();
        String stedArrangement2 = o2.getSTED().toLowerCase();

        return stedArrangement1.compareTo(stedArrangement2);//sortere alfabetisk
    }
}
