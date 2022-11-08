package desafios.desafio_10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShuffleMusicasTests {

  @Test
  public void shuffleMusicasTest_01() {
    List<Integer> expectativa = Arrays.asList(10, 2, 5, 3);
    List<Integer> resultado = Desafio.shuffleMusicas(Arrays.asList(2, 10, 5, 3));

    Assertions.assertEquals(expectativa, resultado);
  }

  @Test
  public void shuffleMusicasTest_02() {
    List<Integer> expectativa = Arrays.asList(1, 0, 1, 0);
    List<Integer> resultado = Desafio.shuffleMusicas(Arrays.asList(0, 0, 1, 1));

    Assertions.assertEquals(expectativa, resultado);
  }

  @Test
  public void shuffleMusicasTest_03() {
    List<Integer> expectativa = Arrays.asList(4, 1, 3, 2);
    List<Integer> resultado = Desafio.shuffleMusicas(Arrays.asList(1, 2, 3, 4));

    Assertions.assertEquals(expectativa, resultado);
  }

  @Test
  public void shuffleMusicasTest_04() {
    List<Integer> expectativa = Arrays.asList(10, 2, 5, 3);
    List<Integer> resultado = Desafio.shuffleMusicas(Arrays.asList(2, 3, 5, 10));

    Assertions.assertEquals(expectativa, resultado);
  }

  @Test
  public void shuffleMusicasTest_05() {
    List<Integer> expectativa = Arrays.asList(5, 1, 4, 2, 3);
    List<Integer> resultado = Desafio.shuffleMusicas(Arrays.asList(1, 2, 3, 4, 5));

    Assertions.assertEquals(expectativa, resultado);
  }

  @Test
  public void shuffleMusicasTest_06() {
    List<Integer> expectativa = Collections.emptyList();
    List<Integer> resultado = Desafio.shuffleMusicas(List.of());

    Assertions.assertEquals(expectativa, resultado);
  }

  @Test
  public void shuffleMusicasTest_07() {
    List<Integer> expectativa = Arrays.asList(2, 1);
    List<Integer> resultado = Desafio.shuffleMusicas(Arrays.asList(2, 1));

    Assertions.assertEquals(expectativa, resultado);
  }
}
