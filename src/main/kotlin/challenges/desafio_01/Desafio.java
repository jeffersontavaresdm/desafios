package challenges.desafio_01;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * Você e seu time estão desenvolvendo um sistema de indicações de postos de gasolina que ficam próximos da localização atual do veículo.
 * No modo de direção “viagem”, a funcionalidade a ser desenvolvida é de indicar ao condutor o posto mais distante possível dentro do limite atual de combustível.
 * E caso não exista posto de gasolina, retornar -1
 * <p>
 * A pessoa responsável por fazer a especificação do sistema informou que você terá as seguintes informações:
 * consumo médio de combustível, quantidade de combustível restante no veículo e um array contendo distâncias dos postos de gasolinas.
 * <p>
 * Exemplo:
 * Combustivel (em litros): 2
 * Consumo médio (km/l): 8
 * Postos de Gasolina (km): [2, 15, 22, 10.2]
 */
public class Desafio {

  public static Integer ultimaParada(
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