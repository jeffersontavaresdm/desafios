package desafios.desafio_10;

import desafios.desafio_10.solucoes.solucao_01.Solucao01;

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
    return Solucao01.solucao(musicasTocadas);
    //    return Solucao02.solucao(musicasTocadas);
  }
}