package one.digitalinnovation.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaPrograma {

    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        lista.add("Juliana");
        lista.add("Pedro");
        lista.add("Carlos");
        lista.add("Larissa");
        lista.add("João");

        for (String nome: lista) {
            System.out.println(nome);
        }

        int index = lista.indexOf("Carlos");
        lista.set(index, "Roberto");

        System.out.println(lista.get(1));
        System.out.println(lista.get(4));

        lista.remove("João");

        System.out.println("Tamanho da lista: " + lista.size());
        System.out.println("Juliano está na lista: " + lista.contains("Juliano"));

        List<String> lista2 = new ArrayList<>();

        lista2.add("Ismael");
        lista2.add("Rodrigo");

        lista.addAll(lista2);

        System.out.println(lista);

        Collections.sort(lista);

        System.out.println(lista);
        System.out.println("Lista está vazia: " + lista.isEmpty());
    }

}
