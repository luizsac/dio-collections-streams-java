package one.digitalinnovation.fila;

import java.util.LinkedList;
import java.util.Queue;

public class FilaPrograma {

    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        fila.add("Juliana");
        fila.add("Pedro");
        fila.add("Carlos");
        fila.add("Larissa");
        fila.add("João");

        for(String nome: fila) {
            System.out.println(nome);
        }

        // Retorna null se a fila estiver vazia
        System.out.println("Primeiro da fila: " + fila.peek()); // ou
        // Lança exceção se a fila estiver vazia
        System.out.println("Primeiro da fila: " + fila.element());
        // Retorna e remove primeiro elemento da fila
        System.out.println("Retirado da fila: " + fila.poll());

        fila.add("Daniel");

        int indexDaniel = 0;
        for (String nome: fila) {
            if (nome.equals("Daniel")) {
                break;
            }
            indexDaniel++;
        }

        // Quando implementa Queue, LinkedList não possui método indexOf()
        System.out.println("Daniel está na posição " + indexDaniel);
        System.out.println("Fila: " + fila);
        System.out.println("Tamanho da fila: " + fila.size());
        System.out.println("Fila está vazia: " + fila.isEmpty());
        System.out.println("Carlos está na fila: " + fila.contains("Carlos"));
    }

}
