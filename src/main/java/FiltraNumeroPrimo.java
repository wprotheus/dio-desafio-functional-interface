import java.util.Arrays;
import java.util.List;

/*
Desafio 17 - Filtrar os números primos da lista:
Com a ajuda da Stream API, filtre os números primos da lista e exiba o resultado no console.
*/

public class FiltraNumeroPrimo {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosPrimos = numeros.stream()
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
                .toList();

        System.out.println("\nOs números primos contidos na lista são -> " +
                (!numerosPrimos.isEmpty() ?
                numerosPrimos.toString().replaceAll("[\\[\\]]", "") :
                        "'não há números primos na lista.'"));
    }
}
