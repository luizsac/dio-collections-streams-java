package one.digitalinnovation.comparatorsComparables;

import java.util.Comparator;

public class MarcaComparator implements Comparator<Carro> {

    @Override
    public int compare(Carro c1, Carro c2) {
        return c1.getMarca().compareTo(c2.getMarca());
    }
}
