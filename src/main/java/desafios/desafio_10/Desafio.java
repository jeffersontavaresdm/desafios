package desafios.desafio_10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Sua equipe está trabalhando em um app de streaming de músicas e uma das funcionalidades é criar um embaralhador de músicas.
 * Uma pesquisa feita pela equipe de UX mostrou que essa é uma das funcionalidades mais importantes para os usuários.
 * Por isso foi priorizada a criação de um experimento para testar a melhor solução.
 * <p>
 * A ideia é criar vários embaralhadores diferentes e realizar um teste com partes dos usuários (chamado de teste A/B),
 * onde cada grupo de usuários selecionado recebe uma versão e através de pesquisas e métricas de utilização saberemos qual terá a maior aceitação.
 * <p>
 * Sua tarefa será desenvolver um desses embaralhadores.
 * Você deve criar uma função que receberá uma lista de pesos que representa as músicas mais ouvidas pelo usuário.
 * Sua função deve retornar uma lista organizada intercalando as músicas mais ouvidas com as músicas menos ouvidas. Por exemplo:
 * <p>
 * Na situação onde a lista de pesos é: [2, 10, 5, 3] sua função deverá retornar [10, 2, 5, 3]
 */
public class Desafio {

  public static List<Integer> shuffleMusicas(List<Integer> musicasTocadas) {
    if (musicasTocadas.size() == 0) return Collections.emptyList();
    if (musicasTocadas.size() == 1) return musicasTocadas;

    var x = musicasTocadas.size() % 2 != 0 ? (musicasTocadas.size() / 2) + 1 : musicasTocadas.size() / 2;

    return embaralhar(x, 0, musicasTocadas, new ArrayList<>(musicasTocadas.size()));
  }

  private static List<Integer> embaralhar(
    int z,
    int y,
    List<Integer> musicasTocadas,
    List<Integer> musicasEmbaralhadas
  ) {
    if (z > 0) {
      musicasTocadas.sort(Comparator.reverseOrder());
      musicasEmbaralhadas.add(musicasTocadas.get(y));
      musicasTocadas.sort(Comparator.naturalOrder());
      musicasEmbaralhadas.add(musicasTocadas.get(y));

      embaralhar(z - 1, y + 1, musicasTocadas, musicasEmbaralhadas);
    }

    List<Integer> resultado = new ArrayList<>(musicasTocadas.size());

    for (int i = 0; i < musicasTocadas.size(); i++) {
      resultado.add(musicasEmbaralhadas.get(i));
    }

    return resultado;
  }
}