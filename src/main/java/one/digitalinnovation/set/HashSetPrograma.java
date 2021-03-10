package one.digitalinnovation.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetPrograma {

    public static void main(String[] args) {
        Set<Integer> conjunto = new HashSet<>();

        conjunto.add(3);
        conjunto.add(88);
        conjunto.add(20);
        conjunto.add(44);
        conjunto.add(3);

        for(int numero: conjunto) {
            System.out.println(numero);
        }
        System.out.println();

        Iterator<Integer> iterator = conjunto.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();

        conjunto.remove(3);
        System.out.println(conjunto + "\n");

        conjunto.add(23);
        System.out.println(conjunto + "\n");

        System.out.println("Tamanho do conjunto: " + conjunto.size());
        System.out.println("Conjunto está vazio: " + conjunto.isEmpty());
    }

}
