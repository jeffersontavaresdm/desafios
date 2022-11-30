package desafios.desafio_11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class RealizarOperacoesTest {

  @Test
  public void realizarOperacoesTest_01() {
    var vetor = new Integer[]{5, 4, 3, 2, 1};
    var operacoes = new Integer[][]{{0, 4}};

    Integer[] expectativa = new Integer[]{1, 2, 3, 4, 5};
    Integer[] resultado = Desafio.realizarOperacoes(vetor, operacoes);

    Assertions.assertEquals(Arrays.stream(expectativa).toList(), Arrays.stream(resultado).toList());
  }

  @Test
  public void realizarOperacoesTest_02() {
    var vetor = new Integer[]{5, 4, 3, 2, 1};
    var operacoes = new Integer[][]{{0, 1}, {1, 2}};

    Integer[] expectativa = new Integer[]{4, 3, 5, 2, 1};
    Integer[] resultado = Desafio.realizarOperacoes(vetor, operacoes);

    Assertions.assertEquals(Arrays.stream(expectativa).toList(), Arrays.stream(resultado).toList());
  }

  @Test // 54321 = [54312 -> 54132 -> 51432 -> 15432 -> 12345]
  public void realizarOperacoesTest_03() {
    var vetor = new Integer[]{5, 4, 3, 2, 1};
    var operacoes = new Integer[][]{{3, 4}, {2, 3}, {1, 2}, {0, 1}, {1, 4}};

    Integer[] expectativa = new Integer[]{1, 2, 3, 4, 5};
    Integer[] resultado = Desafio.realizarOperacoes(vetor, operacoes);

    Assertions.assertEquals(Arrays.stream(expectativa).toList(), Arrays.stream(resultado).toList());
  }
}
