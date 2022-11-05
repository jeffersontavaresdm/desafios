package challenges.desafio_04;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Dada um texto qualquer e um lista de termos de pesquisa (sequencia de caracteres),
 * retorne os primeiros K termos mais recorrentes na string, onde K é um parâmetro configurável.
 * <p>
 * Exemplo:
 * String: "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua"
 * <p>
 * Lista de termos: ["a", "em", "i", "el"]
 * <p>
 * K: 2
 * <p>
 * Resultado: ["i", "a"]
 * <p>
 * Explicação:
 * Ocorrências de cada termo,"i": 11, "a": 7, "em": 2, "el": 1, com K = 2, retornamos "i" e "a" ordenados conforme a quantidade de ocorrências de cada termo.
 * <p>
 * Obs: Quando houver termos com quantidades iguais, priorizar o retorno de acordo com a ordem de ocorrência do termo na string.
 */
class Desafio {

  public static List<String> calculaTopOcorrenciasDeQueries(String texto, List<String> queries, Integer k) {
    Map<String, Integer> resultados = new HashMap<>(queries.size());

    for (String termo : queries) {
      int count = 0;

      for (int i = 0; i < texto.length(); i++) {
        if (texto.substring(i).startsWith(termo)) {
          count++;
        }
      }

      resultados.put(termo, count);
    }

    return resultados
      .entrySet()
      .stream()
      .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
      .limit(k)
      .map(Map.Entry::getKey)
      .toList();
  }
}