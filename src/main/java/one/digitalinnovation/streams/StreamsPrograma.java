package one.digitalinnovation.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsPrograma {

    public static void main(String[] args) {
        List<Estudante> estudantes = new ArrayList<>();

        estudantes.add(new Estudante("Joel", 53));
        estudantes.add(new Estudante("Silvia", 16));
        estudantes.add(new Estudante("Giuliana", 20));
        estudantes.add(new Estudante("Marco", 13));
        estudantes.add(new Estudante("Gilson", 25));
        estudantes.add(new Estudante("Lívia", 37));
        estudantes.add(new Estudante("Dana", 33));
        estudantes.add(new Estudante("Renata", 42));

        // Imprime nova lista de Strings gerada a partir da manipulação de cada item da lista estudantes
        System.out.println("\n" + estudantes.stream().map((estudante) -> estudante.getNome().concat(" : ")
                .concat(String.valueOf(estudante.getIdade()))).collect(Collectors.toList()));

        System.out.println("\nEstudantes na lista: " + estudantes.stream().count());
        System.out.println("Estudantes com mais de 18 anos: " + estudantes.stream()
                .filter((estudante) -> estudante.getIdade() > 18).collect(Collectors.toList()));

        System.out.println();
        estudantes.stream().forEach(System.out::println);

        System.out.println("\nEstudantes que possuem a letra B no nome: " + estudantes.stream()
                .filter((estudante) -> estudante.getNome().contains("B")).collect(Collectors.toList()));

        // Usando letra G no lugar de B
        System.out.println("Estudantes que possuem a letra G no nome: " + estudantes.stream()
                .filter((estudante) -> estudante.getNome().contains("G")).collect(Collectors.toList()));

        System.out.println("\nHá estudantes com a letra D no nome: " + estudantes.stream()
                .anyMatch((estudante) -> estudante.getNome().contains("D")));

        System.out.println("\nEstudante mais velho: " + estudantes.stream()
                .max(Comparator.comparingInt(Estudante::getIdade)).get());
        System.out.println("Estudante mais velho: " + estudantes.stream()
                .min(Comparator.comparingInt(Estudante::getIdade)).get());
    }

}
