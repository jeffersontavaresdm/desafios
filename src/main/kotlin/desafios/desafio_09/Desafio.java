package desafios.desafio_09;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Desafio {

  public static String menorStringMaior(String input) {
    if (input.length() == 2 && input.charAt(0) < input.charAt(1)) {
      return new StringBuilder(input).reverse().toString();
    }

    Set<String> combinacoes = new HashSet<>();

    try {
      permutacoes(input.length(), input.toCharArray(), combinacoes);
    } catch (StackOverflowError error) {
      return "sem resposta";
    }

    var lista = new ArrayList<>(combinacoes);

    lista.sort(String::compareTo);

    var index = lista.indexOf(input);

    if (index >= 0 && index + 1 < lista.size()) {
      return lista.get(index + 1);
    } else {
      return "sem resposta";
    }
  }

  private static void permutacoes(int n, char[] chars, Set<String> combinacoes) {
    if (n == 1) {
      combinacoes.add(String.valueOf(chars));
    } else {
      for (int i = 0; i < n - 1; i++) {
        permutacoes(n - 1, chars, combinacoes);

        if (n % 2 == 0) {
          troca(chars, i, n - 1);
        } else {
          troca(chars, 0, n - 1);
        }
      }

      permutacoes(n - 1, chars, combinacoes);
    }
  }

  private static void troca(char[] input, int a, int b) {
    char tmp = input[a];
    input[a] = input[b];
    input[b] = tmp;
  }
}