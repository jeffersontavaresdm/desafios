package desafios.desafio_07;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculaTotalLedsTest {

  @Test
  public void calculaTotalLeds_01() {
    Integer expectativa = 12;
    Integer resultado = Challenge.calculaTotalLeds(2, 3);

    Assertions.assertEquals(expectativa, resultado);
  }
}