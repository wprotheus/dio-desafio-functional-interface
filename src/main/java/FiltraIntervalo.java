import java.util.Arrays;
import java.util.List;

/*
Desafio 13 - Filtrar os números que estão dentro de um intervalo:
Utilize a Stream API para filtrar os números que estão dentro de um intervalo específico
(por exemplo, entre 5 e 10) e exiba o resultado no console.
*/

public class FiltraIntervalo {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> intervaloSolicitado = numeros.stream()
                .filter(n -> n > 5 && n < 10)
                .toList();

        System.out.println("\nOs números dentro do intervalo informado são -> " +
                intervaloSolicitado.toString().replaceAll("[\\[\\]]", "") + ".");
    }
}
