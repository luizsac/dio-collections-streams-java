package one.digitalinnovation.comparatorsComparables;

import java.util.Comparator;

public class AnoComparator implements Comparator<Carro> {

    @Override
    public int compare(Carro c1, Carro c2) {
        return c1.getAno().compareTo(c2.getAno());
    }
}
