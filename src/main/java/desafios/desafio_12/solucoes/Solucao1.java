package desafios.desafio_12.solucoes;

import desafios.desafio_12.Pair;

import java.util.List;
import java.util.Objects;

public class Solucao1 {

  public static List<String> solucao(List<Pair<String, String>> filmes, String genero) {
    return filmes
      .stream()
      .filter(filme -> Objects.equals(filme.second(), genero))
      .map(Pair::first)
      .toList();
  }
}
