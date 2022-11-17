package desafios.desafio_02.solucoes.solucao_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solucao02 {

  public static List<Integer> solucao(List<List<Integer>> tickets) {
    List<Integer> vendas = new ArrayList<>();

    for (int i = 0; i < tickets.size(); i++) {
      for (int j = 0; j < tickets.get(i).size(); j++) {
        if (tickets.get(i).get(j) >= 20 && tickets.get(i).get(j) <= 500) {
          vendas.add(tickets.get(i).get(j));
        }
      }
    }

    if (vendas.size() == 1) {
      return List.of(vendas.stream().findFirst().get());
    } else if (vendas.size() >= 2) {
      Integer valorMinimo = -1;
      Integer valorMaximo = -1;

      for (int i = vendas.size() - 1; i >= 0; i--) {
        for (int j = vendas.size() - 1; j >= 0; j--) {
          if (vendas.get(i) > vendas.get(j)) {
            var tmp = vendas.get(i);
            vendas.set(i, vendas.get(j));
            vendas.set(j, tmp);
          }
        }

        if (i == 0) {
          valorMinimo = vendas.get(i);
        }
      }

      for (int i = 0; i < vendas.size(); i++) {
        for (int j = 0; j < vendas.size(); j++) {
          if (vendas.get(i) > vendas.get(j)) {
            var tmp = vendas.get(i);
            vendas.set(i, vendas.get(j));
            vendas.set(j, tmp);
          }
        }

        if (i == vendas.size() - 1) {
          valorMaximo = vendas.get(0);
        }
      }

      return List.of(valorMinimo, valorMaximo);
    } else {
      return Collections.emptyList();
    }
  }
}