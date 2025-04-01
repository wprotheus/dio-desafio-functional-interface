import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/*
Desafio 7 - Encontrar o segundo número maior da lista:
Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.
 */

public class SegundoMaiorNumero {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> segundoMaior = numeros.stream()
                .sorted(Collections.reverseOrder())
                .skip(1)
                .findFirst();

        System.out.println("\nO segundo maior número da lista é -> " +
                (segundoMaior.isPresent() ?
                        segundoMaior.get() : "a lista está vazia ou só tem um elemento."));
    }
}
