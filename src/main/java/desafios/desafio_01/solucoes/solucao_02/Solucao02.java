package desafios.desafio_01.solucoes.solucao_02;

import java.util.List;

public class Solucao02 {

  public static Integer solucao(
    Integer combustivel,
    Integer consumo,
    List<Integer> postosDeGasolina
  ) {
    var distanciaMaximaAPercorrer = combustivel * consumo;

    for (int i = 0; i < postosDeGasolina.size(); i++) {
      for (int j = 0; j < postosDeGasolina.size(); j++) {
        if (postosDeGasolina.get(i) > postosDeGasolina.get(j)) {
          var tmp = postosDeGasolina.get(i);
          postosDeGasolina.set(i, postosDeGasolina.get(j));
          postosDeGasolina.set(j, tmp);
        }
      }
    }

    Integer resultado = null;

    for (Integer distanciaPosto : postosDeGasolina) {
      if (distanciaMaximaAPercorrer >= distanciaPosto) {
        resultado = distanciaPosto;
        break;
      }
    }

    return resultado == null ? -1 : resultado;
  }
}
