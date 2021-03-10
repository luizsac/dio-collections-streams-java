package one.digitalinnovation.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetPrograma {

    public static void main(String[] args) {
        TreeSet<Integer> arvore = new TreeSet<>();

        arvore.add(3);
        arvore.add(88);
        arvore.add(20);
        arvore.add(44);
        arvore.add(3);

        for(int numero: arvore) {
            System.out.println(numero);
        }
        System.out.println();

        Iterator<Integer> iterator = arvore.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();

        arvore.pollFirst();
        System.out.println(arvore + "\n");

        arvore.add(23);
        System.out.println(arvore + "\n");

        System.out.println("Tamanho do conjunto: " + arvore.size());
        System.out.println("Conjunto está vazio: " + arvore.isEmpty());
    }

}
