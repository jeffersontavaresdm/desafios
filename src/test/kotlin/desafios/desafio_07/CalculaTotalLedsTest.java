package desafios.desafio_07;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculaTotalLedsTest {

  @Test
  public void calculaTotalLeds_01() {
    Integer expectativa = 12;
    Integer resultado = Desafio.calculaTotalLeds(2, 3);

    Assertions.assertEquals(expectativa, resultado);
  }

  @Test
  public void calculaTotalLeds_02() {
    Integer expectativa = 15;
    Integer resultado = Desafio.calculaTotalLeds(2, 4);

    Assertions.assertEquals(expectativa, resultado);
  }

  @Test
  public void calculaTotalLeds_03() {
    Integer expectativa = 0;
    Integer resultado = Desafio.calculaTotalLeds(0, 1000);

    Assertions.assertEquals(expectativa, resultado);
  }
}