package desafios.desafio_05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class CalculaPorcentagemSorteioTests {

  @Test
  public void testeAssinanteENaoAssinante() {
    List<Boolean> assinantes = Arrays.asList(true, false);
    List<Integer> minutosAssistidos = Arrays.asList(60, 120);

    List<Integer> expectativa = Arrays.asList(50, 50);
    List<Integer> resultado = Desafio.calculaPorcentagemSorteio(assinantes, minutosAssistidos);

    Assertions.assertEquals(expectativa, resultado);
  }

  @Test
  public void testeAssinanteENaoAssinante_02() {
    List<Boolean> assinantes = List.of(false, false, false, false, false, false, false, false, false, false);
    List<Integer> minutosAssistidos = List.of(10, 10, 10, 10, 10, 10, 10, 10, 10, 10);

    List<Integer> expectativa = Arrays.asList(10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
    List<Integer> resultado = Desafio.calculaPorcentagemSorteio(assinantes, minutosAssistidos);

    Assertions.assertEquals(expectativa, resultado);
  }

  @Test
  public void testeAssinanteENaoAssinante_03() {
    List<Boolean> assinantes = List.of(true, false, true);
    List<Integer> minutosAssistidos = List.of(10, 10, 10);

    List<Integer> expectativa = Arrays.asList(40, 20, 40);
    List<Integer> resultado = Desafio.calculaPorcentagemSorteio(assinantes, minutosAssistidos);

    Assertions.assertEquals(expectativa, resultado);
  }
}
