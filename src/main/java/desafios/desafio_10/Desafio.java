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

    return embaralhar(musicasTocadas);
  }

  private static List<Integer> embaralhar(List<Integer> musicasTocadas) {
    List<Integer> musicasOrganizadas = new ArrayList<>(musicasTocadas.size());

    int size = musicasTocadas.size() / 2;
    if (musicasTocadas.size() % 2 != 0) size = (musicasTocadas.size() / 2) + 1;
    for (int i = 0; i < size; i++) {
      musicasTocadas.sort(Comparator.reverseOrder());
      musicasOrganizadas.add(musicasTocadas.get(i));
      musicasTocadas.sort(Comparator.naturalOrder());
      musicasOrganizadas.add(musicasTocadas.get(i));
    }

    List<Integer> resultado = new ArrayList<>(musicasTocadas.size());

    for (int i = 0; i < musicasTocadas.size(); i++) {
      resultado.add(musicasOrganizadas.get(i));
    }

    return resultado;
  }
}