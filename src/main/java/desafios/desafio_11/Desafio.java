package desafios.desafio_11;

import desafios.desafio_11.solucoes.solucao_01.Solucao01;

/**
 * Para uma determinada matriz de números inteiros, execute operações na matriz.
 * Retorna o array resultante após todas as operações terem sido aplicadas na ordem dada.
 * Cada operação contém dois índices.
 * Inverta o subarray entre esses índices baseados em zero, inclusive.
 * <p>
 * Exemplo:
 * array = [9, 8, 7, 6, 5, 4, 3, 2, 1, 0]
 * operações = [[0, 9], [4, 5], [3, 6]]
 * <p>
 * após operação 01: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
 * após operação 02: [0, 1, 2, 3, 5, 4, 6, 7, 8, 9]
 * após operação 03: [0, 1, 2, 6, 4, 5, 3, 7, 8, 9]
 * <p>
 * Na primeira operação, todos os elementos são invertidos.
 * Não há elementos à direita ou à esquerda. Na segunda operação, apenas os elementos da coluna "To Reverse" são invertidos.
 * Aqueles à esquerda e à direita permanecem os mesmos.
 * Lógica semelhante é aplicada para outras operações.
 * <p>
 * Descrição da função:
 * A função tem o(s) seguinte(s) parâmetro(s):
 * int arr[n]: uma matriz de inteiros
 * operações int[q][2]: uma matriz bidimensional de índices iniciais e finais
 * Retorna:
 * int[n]: o array final após todas as operações terem sido executadas
 * <p>
 * Restrições
 * 1 ≤ n
 * q ≤ 103
 * <p>
 * Explicação:
 * arr = [1, 2, 3]
 * operations = [[0, 2], [1, 2], [0, 2]]
 * <p>
 * Inverta arr[0] a arr[2]: arr = [3, 2, 1].
 * Inverta arr[1] a arr[2]: arr = [3, 1, 2].
 * Inverta arr[0] até arr[2]: arr = [2, 1, 3].
 */
public class Desafio {

  public static Integer[] realizarOperacoes(Integer[] vetor, Integer[][] operacoes) {
    return Solucao01.solucao(vetor, operacoes);
  }
}
