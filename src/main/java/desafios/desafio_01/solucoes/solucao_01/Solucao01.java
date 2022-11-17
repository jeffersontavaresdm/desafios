package desafios.desafio_01.solucoes.solucao_01;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Solucao01 {

  public static Integer solucao(
    Integer combustivel,
    Integer consumo,
    List<Integer> postosDeGasolina
  ) {
    Optional<Integer> posto = postosDeGasolina
      .stream()
      .sorted(Comparator.reverseOrder())
      .filter(distancia -> distancia <= (combustivel * consumo))
      .findFirst();

    return posto.orElse(-1);
  }
}