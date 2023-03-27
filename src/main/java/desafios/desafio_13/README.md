# DESAFIO:

Sua equipe está trabalhando em um sistema de gerenciamento de estoque e precisa implementar uma funcionalidade que
calcule o valor total do estoque de produtos.

Para isso, foi proposto um experimento para testar diferentes algoritmos de cálculo de valor total de estoque.

Sua tarefa é desenvolver um desses algoritmos de cálculo de valor total de estoque. Você deve criar uma função que
recebe uma lista de produtos (nome, preço, quantidade) e retorne o valor total do estoque, ou seja, a soma dos valores
de todos os produtos. Por exemplo:

Dada a lista de produtos:

- "Caneta", 1.50, 100
- "Caderno", 5.00, 50
- "Lápis", 0.50, 200
- "Borracha", 0.30, 150

A função deve retornar o valor total do estoque, que é: 325.00

Exemplos:

calcularValorTotalEstoque([("Caderno", 5.00, 50), ("Lápis", 0.50, 200), ("Borracha", 0.30, 150)]) → 325.00

calcularValorTotalEstoque([("Smartphone", 1200.00, 10), ("Notebook", 2500.00, 5)]) → 21500.00

calcularValorTotalEstoque([]) → 0.00