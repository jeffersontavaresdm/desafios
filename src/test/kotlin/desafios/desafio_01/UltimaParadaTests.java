package desafios.desafio_01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class UltimaParadaTests {

  @Test
  void calculaOUltimoPostoDeCombustivelNaAutonomia_01() {
    Integer combustivel = 2;
    Integer consumo = 8;
    List<Integer> postosDeGasolina = Arrays.asList(2, 15, 22, 10);

    Integer expectativa = 15;
    Integer resultado = Desafio.ultimaParada(combustivel, consumo, postosDeGasolina);

    Assertions.assertEquals(expectativa, resultado);
  }

  @Test
  void calculaOUltimoPostoDeCombustivelNaAutonomia_02() {
    Integer combustivel = 5;
    Integer consumo = 10;
    List<Integer> postosDeGasolina = Arrays.asList(5, 25, 45, 100, 55);

    Integer expectativa = 45;
    Integer resultado = Desafio.ultimaParada(combustivel, consumo, postosDeGasolina);

    Assertions.assertEquals(expectativa, resultado);
  }

  @Test
  void calculaOUltimoPostoDeCombustivelNaAutonomia_03() {
    Integer combustivel = 2;
    Integer consumo = 10;
    List<Integer> postosDeGasolina = Arrays.asList(21, 25, 45, 100, 55);

    Integer expectativa = -1;
    Integer resultado = Desafio.ultimaParada(combustivel, consumo, postosDeGasolina);

    Assertions.assertEquals(expectativa, resultado);
  }
}