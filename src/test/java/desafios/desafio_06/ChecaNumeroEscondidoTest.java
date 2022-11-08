package desafios.desafio_06;

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
    boolean resultado = Desafio.checaNumeroEscondido(12345, 153);

    Assertions.assertEquals(expectativa, resultado);
  }

  @Test
  public void verificaSeONumeroEstaOcultoEmOutro_03() {
    boolean expectativa = true;
    boolean resultado = Desafio.checaNumeroEscondido(12345, 135);

    Assertions.assertEquals(expectativa, resultado);
  }
}
