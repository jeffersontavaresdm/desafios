package challenges.task_06;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChecaNumeroEscondidoTest {

  @Test
  public void verificaSeONumeroEstaOcultoEmOutro_00() {
    boolean expectativa = true;
    boolean resultado = Challenge.checaNumeroEscondido(2131313, 21);

    Assertions.assertEquals(expectativa, resultado);
  }

  @Test
  public void verificaSeONumeroEstaOcultoEmOutro_01() {
    boolean expectativa = true;
    boolean resultado = Challenge.checaNumeroEscondido(12345, 235);

    Assertions.assertEquals(expectativa, resultado);
  }

  @Test
  public void verificaSeONumeroEstaOcultoEmOutro_02() {
    boolean expectativa = false;
    boolean resultado = Challenge.checaNumeroEscondido(2468, 149);

    Assertions.assertEquals(expectativa, resultado);
  }

  @Test
  public void verificaSeONumeroEstaOcultoEmOutro_03() {
    boolean expectativa = false;
    boolean resultado = Challenge.checaNumeroEscondido(12345, 154);

    Assertions.assertEquals(expectativa, resultado);
  }
}
