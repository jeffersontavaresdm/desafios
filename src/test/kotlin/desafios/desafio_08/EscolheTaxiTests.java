package desafios.desafio_08;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EscolheTaxiTests {

  @Test
  public void escolheTaxi_01() {
    String expectativa = "Empresa 1 quando a distância < 10.0, Tanto faz quando a distância = 10.0, Empresa 2 quando a distância > 10.0";
    String resultado = Desafio.escolheTaxi("2.5", "1.0", "5.0", "0.75");

    Assertions.assertEquals(expectativa, resultado);
  }
}
