package challenges.desafio_06;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChecaNumeroEscondidoTest {

  @Test
  public void verificaSeONumeroEstaOcultoEmOutro_01() {
    boolean expectativa = true;
    boolean resultado = Desafio.checaNumeroEscondido(12345, 235);

    Assertions.assertEquals(expectativa, resultado);
  }

  @Test
  public void verificaSeONumeroEstaOcultoEmOutro_02() {
    boolean expectativa = false;
    boolean resultado = Desafio.checaNumeroEscondido(2468, 149);

    Assertions.assertEquals(expectativa, resultado);
  }

  @Test
  public void verificaSeONumeroEstaOcultoEmOutro_03() {
    boolean expectativa = false;
    boolean resultado = Desafio.checaNumeroEscondido(12345, 154);

    Assertions.assertEquals(expectativa, resultado);
  }
}
