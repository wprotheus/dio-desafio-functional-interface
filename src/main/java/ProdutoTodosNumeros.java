import java.util.Arrays;
import java.util.List;

/*
Encontre o produto de todos os números da lista:
Com a ajuda da Stream API, encontre o produto de todos os números da lista e exiba o resultado no console.
*/

public class ProdutoTodosNumeros {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Integer produtoNumeros = numeros.stream()
                .reduce(1, (a, b) -> a * b);

        System.out.println("\nO resultado do produto dos números da lista é -> " +
                produtoNumeros + ".");
    }
}
