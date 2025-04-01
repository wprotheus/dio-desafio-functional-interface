import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/*
Desafio 14 - Encontre o maior número primo da lista:
Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.
*/

public class MaiorNumeroPrimo {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> maiorPrimo = numeros.stream()
                .filter(n -> {
                    if (n <= 2)
                        return true;
                    if (n % 2 == 0)
                        return false;
                    for (int j = 2; j < n; j++)
                        if (n % j == 0)
                            return false;
                    return true;
                })
                .max(Comparator.naturalOrder());
        System.out.println("O maior número primo presente na lista é -> " +
                (maiorPrimo.isPresent() ? maiorPrimo.get() : "Não foi encontrado número primo."));
    }
}
