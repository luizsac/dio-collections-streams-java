package one.digitalinnovation.comparatorsComparables;

import java.util.*;
import java.util.stream.Collectors;

public class ComparatorComparablePrograma {

    public static void main(String[] args) {
        List<Carro> carros = new ArrayList<>();

        carros.add(new Carro("Fiat", "Bravo", 2012));
        carros.add(new Carro("Fiat", "Punto", 2008));
        carros.add(new Carro("Fiat", "Argo", 2018));
        carros.add(new Carro("Volkswagen", "Fox", 2013));
        carros.add(new Carro("Volkswagen", "Fusca", 1973));
        carros.add(new Carro("Ford", "Ka", 2004));

        // TreeSet que ordena carros pela marca e trata carros da mesma marca como duplicados
        TreeSet<Carro> tsCarrosMarca = new TreeSet<>(new MarcaComparator());
        tsCarrosMarca.addAll(carros);

        // TreeSet que ordena carros pelo ano e trata carros do mesmo ano como duplicados
        TreeSet<Carro> tsCarrosAno = new TreeSet<>(new AnoComparator());
        tsCarrosAno. addAll(carros);

        System.out.println("\n");

        System.out.println("--------------- ARRAYLIST --------------");
        System.out.println("Inicial: " + carros);

        Collections.sort(carros);
        System.out.println("Comparable por ano: " + carros);

        MarcaComparator comparator = new MarcaComparator();

        carros.sort(comparator);
        System.out.println("Comparator por marca: " + carros);

        carros.sort((c1, c2) -> c1.getModelo().compareTo(c2.getModelo()));
        System.out.println("Expressão lambda por modelo: " + carros);

        carros.sort(Comparator.comparing(Carro::getAno));
        System.out.println("Comparator usando referência a método por ano: " + carros);

        System.out.println("\n--------------- TREESET --------------");
        System.out.println("Carros por marca: " + tsCarrosMarca);
        System.out.println("Carros por ano: " + tsCarrosAno);
    }

}
