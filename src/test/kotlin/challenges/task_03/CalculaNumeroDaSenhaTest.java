package challenges.task_03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class CalculaNumeroDaSenhaTest {

  @Test
  public void retornaSenhaCorreta_01() {
    List<String> senha = Arrays.asList(
      "0110100000",
      "1001011111",
      "1110001010",
      "0111010101",
      "0011100110",
      "1010011001",
      "1101100100",
      "1011010100",
      "1001100111",
      "1000011000"
    );

    Integer expectativa = 724;
    Integer resultado = Challenge.calculaNumeroDaSenha(senha);

    Assertions.assertEquals(expectativa, resultado);
  }

  @Test
  public void retornaSenhaCorreta_02() {
    List<String> senha = Arrays.asList(
      "1111100000",
      "1111100000",
      "1111100000",
      "1111100000",
      "1111100000",
      "1111100000",
      "1111100000",
      "1111100000",
      "1111100000",
      "1111100000"
    );

    Integer expectativa = 992;
    Integer resultado = Challenge.calculaNumeroDaSenha(senha);

    Assertions.assertEquals(expectativa, resultado);
  }

  @Test
  public void retornaSenhaCorreta_03() {
    List<String> senha = Arrays.asList(
      "1010101010",
      "1010101010",
      "1010101010",
      "1010101010",
      "1010101010",
      "0101010101",
      "0101010101",
      "0101010101",
      "0101010101",
      "0101010101"
    );

    Integer expectativa = 1023;
    Integer resultado = Challenge.calculaNumeroDaSenha(senha);

    Assertions.assertEquals(expectativa, resultado);
  }
}