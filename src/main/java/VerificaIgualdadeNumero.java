import java.util.Arrays;
import java.util.List;

/*
Desafio 18 - Verifique se todos os números da lista são iguais:
Utilizando a Stream API, verifique se todos os números da lista são iguais e exiba o resultado no console.
*/

public class VerificaIgualdadeNumero {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
//        List<Integer> numeros = Arrays.asList(3, 3, 3, 3, 3);

        boolean igualdade = numeros.stream()
                .allMatch(n -> n.equals(numeros.get(0)));

        System.out.println("\nA lista fornecida -> " +
                (igualdade ? "'tem todos os números iguais.'" :
                        "'não tem todos os números iguais."));
    }
}
