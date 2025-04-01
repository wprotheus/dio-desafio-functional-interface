import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*
Desafio 2 - Imprima a soma dos números pares da lista:
Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.
*/

public class SomaNumeroPar {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

//        Predicate<Integer> isSoma = numero -> numero % 2 == 0;
//        int soma = numeros.stream().filter(isSoma).reduce(0, Integer::sum);
//        System.out.println("A soma dos números pares é: " + soma);

        Optional<Integer> somaPar = numeros.stream()
                .filter(n -> n % 2 == 0)
                .reduce(Integer::sum);

        System.out.println("A soma dos números pares é: " + somaPar.get());

//        numeros.stream()
//                .filter(n -> n % 2 == 0)
//                .reduce(Integer::sum)
//                .ifPresent(System.out::println);
    }
}
