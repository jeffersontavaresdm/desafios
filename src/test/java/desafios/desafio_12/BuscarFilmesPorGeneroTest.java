package desafios.desafio_12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BuscarFilmesPorGeneroTest { // romance (3), ação (1), fantasia (1), ficção científica (3), drama (2)

  @Test
  public void buscarFilmePorGeneroTest_01() {
    var genero = "ficção científica";
    List<Pair<String, String>> filmes = List.of(
      new Pair<>("De Volta para o Futuro", "ficção científica"),
      new Pair<>("Querido John", "romance"),
      new Pair<>("Matrix", "ação"),
      new Pair<>("O Senhor dos Anéis", "fantasia"),
      new Pair<>("Titanic", "romance"),
      new Pair<>("Star Wars", "ficção científica"),
      new Pair<>("Em Busca da Felicidade", "drama"),
      new Pair<>("Interstellar", "ficção científica"),
      new Pair<>("O Resgate do Soldado Ryan", "drama"),
      new Pair<>("Um Dia", "romance")
    );

    List<String> expected = Arrays.asList("De Volta para o Futuro", "Star Wars", "Interstellar");
    List<String> result = Desafio.buscarFilmePorGenero(filmes, genero);

    Assertions.assertTrue(expected.containsAll(result) && result.containsAll(expected));
  }

  @Test
  public void buscarFilmePorGeneroTest_02() {
    var genero = "romance";
    List<Pair<String, String>> filmes = List.of(
      new Pair<>("De Volta para o Futuro", "ficção científica"),
      new Pair<>("Querido John", "romance"),
      new Pair<>("Matrix", "ação"),
      new Pair<>("O Senhor dos Anéis", "fantasia"),
      new Pair<>("Titanic", "romance"),
      new Pair<>("Star Wars", "ficção científica"),
      new Pair<>("Em Busca da Felicidade", "drama"),
      new Pair<>("Interstellar", "ficção científica"),
      new Pair<>("O Resgate do Soldado Ryan", "drama"),
      new Pair<>("Um Dia", "romance")
    );

    List<String> expected = Arrays.asList("Um Dia", "Titanic", "Querido John");
    List<String> result = Desafio.buscarFilmePorGenero(filmes, genero);

    Assertions.assertTrue(expected.containsAll(result) && result.containsAll(expected));
  }

  @Test
  public void buscarFilmePorGeneroTest_03() {
    var genero = "ação";
    List<Pair<String, String>> filmes = List.of(
      new Pair<>("De Volta para o Futuro", "ficção científica"),
      new Pair<>("Querido John", "romance"),
      new Pair<>("Matrix", "ação"),
      new Pair<>("O Senhor dos Anéis", "fantasia"),
      new Pair<>("Titanic", "romance"),
      new Pair<>("Star Wars", "ficção científica"),
      new Pair<>("Em Busca da Felicidade", "drama"),
      new Pair<>("Interstellar", "ficção científica"),
      new Pair<>("O Resgate do Soldado Ryan", "drama"),
      new Pair<>("Um Dia", "romance")
    );

    List<String> expected = List.of("Matrix");
    List<String> result = Desafio.buscarFilmePorGenero(filmes, genero);

    Assertions.assertTrue(expected.containsAll(result) && result.containsAll(expected));
  }

  @Test
  public void buscarFilmePorGeneroTest_04() {
    var genero = "fantasia";
    List<Pair<String, String>> filmes = Collections.emptyList();

    List<String> expected = List.of();
    List<String> result = Desafio.buscarFilmePorGenero(filmes, genero);

    Assertions.assertTrue(expected.containsAll(result) && result.containsAll(expected));
  }
}