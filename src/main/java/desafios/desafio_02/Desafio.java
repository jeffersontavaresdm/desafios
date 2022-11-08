package desafios.desafio_02;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Você está trabalhando para uma empresa que fornece materiais escolares e precisa da sua ajuda para entrar no mundo digital.
 * Como primeira atividade, você identificou que não existe uma funcionalidade que é muito importante para a empresa ter mais controle sobre os valores dos produtos vendidos.
 * Esta funcionalidade consiste em descobrir o maior e o menor valor dos produtos vendidos em um período de tempo, para cada vendedor.
 * <p>
 * Os valores das vendas que devem ser consideradas podem variar entre 20 e 500 reais e estão agrupados por vendedores.
 * Além disso, deve-se ignorar as devoluções, que estão indicadas com o valor 0.
 * <p>
 * A sua função/método deverá receber uma lista de vendas agrupadas por vendedores, (e.g. [[200, 100], [300]])
 * e retornar um array onde a primeira posição contém o menor valor e a segunda posição o maior valor (e.g. [100, 300]).
 * <p>
 * Mas preste atenção! Algum vendedor pode não ter realizado vendas no período.
 */
public class Desafio {

  public static List<Integer> retornaMenorEMaiorValorDeVendas(List<List<Integer>> tickets) {
    List<Integer> vendas = tickets
      .stream()
      .flatMap(list -> list.stream().filter(valor -> valor >= 20 && valor <= 500))
      .toList();

    if (vendas.size() == 1) {
      return List.of(vendas.stream().findFirst().get());
    } else if (vendas.size() >= 2) {
      Integer valorMinimo = vendas.stream().min(Comparator.naturalOrder()).get();
      Integer valorMaximo = vendas.stream().max(Comparator.naturalOrder()).get();

      return List.of(valorMinimo, valorMaximo);
    } else {
      return Collections.emptyList();
    }
  }
}