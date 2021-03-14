package one.digitalinnovation.optionals;

import java.util.Optional;

public class OptionalsPrograma {

    public static void main(String[] args) {
        Optional<String> opVazio = Optional.empty();
        Optional<String> opPresente = Optional.of("Estou aqui");
        Optional<String> opNulo = Optional.ofNullable(null);

        opPresente.ifPresentOrElse(System.out::println, () -> System.out.println("Não está presente"));
        opNulo.ifPresentOrElse(System.out::println, () -> System.out.println("Não está presente"));
        opVazio.ifPresentOrElse(System.out::println, () -> System.out.println("Optional vazio"));

        // System.out.println(opVazio.orElseThrow(IllegalStateException::new));

        opPresente.map((texto) -> texto.concat(" mais um dia")).ifPresent(System.out::println);

        if (opPresente.isPresent()) {
            String texto = opPresente.get();
            System.out.println(texto);
        }

        System.out.println(opPresente.filter((texto) -> texto.contains("a")));
        System.out.println(opPresente.filter((texto) -> texto.contains("x")));
    }

}
