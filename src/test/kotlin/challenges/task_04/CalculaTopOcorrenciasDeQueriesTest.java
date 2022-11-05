package challenges.task_04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class CalculaTopOcorrenciasDeQueriesTest {

  @Test
  public void testaLoremIpsum() {
    String string = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua";
    List<String> termos = Arrays.asList("a", "em", "i", "el");

    List<String> expectativa = Arrays.asList("i", "a");
    List<String> resultado = Challenge.calculaTopOcorrenciasDeQueries(string, termos, 2);

    Assertions.assertEquals(expectativa, resultado);
  }

  @Test
  public void calculaTopOcorrenciasTest_02() {
    String string = "1 BC 1 123 AA BC";

    List<String> termos = Arrays.asList("A", "1", "BC");
    List<String> expectativa = Arrays.asList("1", "A");
    List<String> resultado = Challenge.calculaTopOcorrenciasDeQueries(string, termos, 2);

    Assertions.assertEquals(expectativa, resultado);
  }
}
