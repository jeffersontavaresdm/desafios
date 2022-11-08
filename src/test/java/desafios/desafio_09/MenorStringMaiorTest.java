package desafios.desafio_09;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MenorStringMaiorTest {

  @Test
  public void teste_01() {
    String expectativa = "abced";
    String resultado = Desafio.menorStringMaior("abcde");

    Assertions.assertEquals(expectativa, resultado);
  }

  @Test
  public void teste_02() {
    String expectativa = "ba";
    String resultado = Desafio.menorStringMaior("ab");

    Assertions.assertEquals(expectativa, resultado);
  }

  @Test
  public void teste_03() {
    String expectativa = "sem resposta";
    String resultado = Desafio.menorStringMaior("ba");

    Assertions.assertEquals(expectativa, resultado);
  }

  @Test
  public void teste_04() {
    String expectativa = "Qualiidef";
    String resultado = Desafio.menorStringMaior("Qualified");

    Assertions.assertEquals(expectativa, resultado);
  }

  @Test
  public void teste_05() {
    String expectativa = "nextgne";
    String resultado = Desafio.menorStringMaior("nextgen");

    Assertions.assertEquals(expectativa, resultado);
  }

  @Test
  public void teste_06() {
    String expectativa = "dede";
    String resultado = Desafio.menorStringMaior("ddee");

    Assertions.assertEquals(expectativa, resultado);
  }
}
