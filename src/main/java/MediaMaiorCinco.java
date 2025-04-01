import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

/*
Desafio 5 - Calcule a média dos números maiores que 5:
Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.
*/

public class MediaMaiorCinco {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        OptionalDouble mediaMaioresQueCinco = numeros.stream()
                .filter(n -> n > 5)
                .mapToInt(Integer::intValue) //n -> n.intValue
                .average();

        System.out.println("A média dos números maiores que 5 é: " +
                (mediaMaioresQueCinco.isPresent() ?
                        mediaMaioresQueCinco.getAsDouble() : "Não há números > 5."));
    }
}
