import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:
Utilize a Stream API para agrupar os valores ímpares múltiplos de 3 ou de 5 e
exiba o resultado no console.
*/

public class AgrupaImparMultiplos {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Map<String, List<Integer>> multiTresCinco = numeros.stream()
                .filter(n -> n % 3 == 0 || n % 5 == 0)
                .collect(Collectors.groupingBy(n -> n % 3 == 0 ?
                        "Os múltiplos de 3 são -> " : "Os múltiplos de 5 são -> "));

        System.out.println(multiTresCinco.toString().replaceAll("[{=\\[\\]}]", ""));
    }
}
