package desafios.desafio_12;

import desafios.desafio_12.solucoes.Solucao1;

import java.util.List;

/**
 * Sua equipe está trabalhando em um aplicativo de busca de filmes e uma das funcionalidades é permitir que o usuário
 * pesquise por filmes de um determinado gênero. Para isso, foi proposto um experimento para testar diferentes
 * algoritmos
 * de busca por filmes de um gênero específico.
 * <p>
 * Sua tarefa é desenvolver um desses algoritmos de busca por filmes de um gênero específico.
 * <p>
 * Você deve criar uma função que recebe uma lista de filmes (título, gênero) e um gênero específico. A função deve
 * retornar uma lista com os títulos dos filmes que pertencem ao gênero especificado. Por exemplo:
 * <p>
 * Dada a lista de filmes:
 * [
 *   ("Matrix", "ação"),
 *   ("O Senhor dos Anéis", "fantasia"),
 *   ("De Volta para o Futuro", "ficção científica"),
 *   ("Star Wars", "ficção científica"),
 *   ("Jurassic Park", "aventura")
 * ]
 * e o gênero "ficção científica", a função deve retornar a lista:
 * ["De Volta para o Futuro", "Star Wars"]
 * <p>
 * Exemplos:
 * buscarFilmesPorGenero([
 *   ("Matrix", "ação"),
 *   ("O Senhor dos Anéis", "fantasia"),
 *   ("De Volta para o Futuro", "ficção científica"),
 *   ("Star Wars", "ficção científica"),
 *   ("Jurassic Park", "aventura")
 * ], "ficção científica") → ["De Volta para o Futuro", "Star Wars"]
 * <p>
 * buscarFilmesPorGenero([
 *   ("Matrix", "ação"),
 *   ("O Senhor dos Anéis", "fantasia"),
 *   ("De Volta para o Futuro", "ficção científica"),
 *   ("Star Wars", "ficção científica"),
 *   ("Jurassic Park", "aventura")
 * ], "aventura") → ["Jurassic Park"]
 * <p>
 * buscarFilmesPorGenero([], "ação") → []
 */
public class Desafio {

  public static List<String> buscarFilmePorGenero(List<Pair<String, String>> filmes, String genero) {
    return Solucao1.solucao(filmes, genero);
  }
}
