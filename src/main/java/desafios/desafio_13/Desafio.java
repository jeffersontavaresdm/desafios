package desafios.desafio_13;

import desafios.desafio_13.solucoes.Solucao01;

import java.util.List;

/**
 * Sua equipe está trabalhando em um sistema de gerenciamento de estoque e precisa implementar uma funcionalidade que
 * calcule o valor total do estoque de produtos.
 * <p>
 * Para isso, foi proposto um experimento para testar diferentes algoritmos de cálculo de valor total de estoque.
 * <p>
 * Sua tarefa é desenvolver um desses algoritmos de cálculo de valor total de estoque. Você deve criar uma função que
 * recebe uma lista de produtos (nome, preço, quantidade) e retorne o valor total do estoque, ou seja, a soma dos
 * valores
 * de todos os produtos. Por exemplo:
 * <p>
 * Dada a lista de produtos:
 * <p>
 * "Caneta", 1.50, 100
 * "Caderno", 5.00, 50
 * "Lápis", 0.50, 200
 * "Borracha", 0.30, 150
 * A função deve retornar o valor total do estoque, que é:
 * <p>
 * 475.00
 * <p>
 * Exemplos:
 * <p>
 * calcularValorTotalEstoque([("Caneta", 1.50, 100), ("Caderno", 5.00, 50), ("Lápis", 0.50, 200), ("Borracha", 0.30, 150)])
 * → 475.00
 * <p>
 * calcularValorTotalEstoque([("Smartphone", 1200.00, 10), ("Notebook", 2500.00, 5)])
 * → 21500.00
 * <p>
 * calcularValorTotalEstoque([], 5.00) → 0.00
 */
public class Desafio {

  public static Double calcularValorTotalEstoque(List<Produto> produtos) {
    return Solucao01.solucao(produtos);
  }
}
