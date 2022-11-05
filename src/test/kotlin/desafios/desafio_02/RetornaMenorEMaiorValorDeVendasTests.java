package desafios.desafio_02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RetornaMenorEMaiorValorDeVendasTests {

  @Test
  void retornaOMenorEMaiorValorDeVendas_menorEMaiorVenda() {
    List<Integer> expectativa = Arrays.asList(100, 300);
    List<Integer> resultado = Desafio.retornaMenorEMaiorValorDeVendas(Arrays.asList(List.of(200, 100), List.of(300)));

    Assertions.assertEquals(expectativa, resultado);
  }

  @Test
  void retornaOMenorEMaiorValorDeVendas_apenasUmaVendaASerConsiderada() {
    List<Integer> expectativa = List.of(200);
    List<Integer> resultado = Desafio.retornaMenorEMaiorValorDeVendas(Arrays.asList(List.of(200, 10), List.of(3000)));

    Assertions.assertEquals(expectativa, resultado);
  }

  @Test
  void retornaOMenorEMaiorValorDeVendas_semVendas() {
    List<Integer> expectativa = List.of();
    List<Integer> resultado = Desafio.retornaMenorEMaiorValorDeVendas(Collections.emptyList());

    Assertions.assertEquals(expectativa, resultado);
  }

  @Test
  void retornaOMenorEMaiorValorDeVendas_apenasUmaVenda() {
    List<Integer> expectativa = List.of(250);
    List<Integer> resultado = Desafio.retornaMenorEMaiorValorDeVendas(List.of(List.of(250)));

    Assertions.assertEquals(expectativa, resultado);
  }

  @Test
  void retornaOMenorEMaiorValorDeVendas_duasVendasComOMesmoValor() {
    List<Integer> expectativa = List.of(250, 250);
    List<Integer> resultado = Desafio.retornaMenorEMaiorValorDeVendas(List.of(List.of(250), List.of(700, 250)));

    Assertions.assertEquals(expectativa, resultado);
  }
}