package desafios.desafio_02.solucoes.solucao_01;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solucao01 {

  public static List<Integer> solucao(List<List<Integer>> tickets) {
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