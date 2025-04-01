import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
Desafio 1 - Mostre a lista na ordem numérica:
Crie um programa que utilize a Stream API para ordenar a lista de números em ordem crescente e a exiba no console.
*/

public class OrdenaListaNumero {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Collections.sort(numeros);
        System.out.println("A ordem crescente dos números é: " + numeros);

        List<Integer> nrOrdenados = numeros
                .stream()
                .sorted()
                .toList();
        nrOrdenados.forEach(System.out::print);
    }
}
