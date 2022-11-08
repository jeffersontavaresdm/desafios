package desafios.desafio_07;

/**
 * Uma empresa fabrica painéis de LED compostos por quadrados de 1 cm de lado.
 * Nos vértices de cada quadrado fica um LED, sendo que o tamanho de cada painel é escolhido pelo cliente conforme a sua necessidade.
 * A imagem abaixo mostra um painel de 2 cm por 4 cm, composto por 15 LEDs no total.
 * <p>
 * Os funcionários da fábrica perdem muito tempo (que poderia ser utilizado para inovação) com o cálculo manual desses painéis.
 * A diretoria decidiu então contratar você para evoluir e construir um cálculo automatizado, modernizando assim os sistemas deles.
 * <p>
 * Considerando um painel de 'n' por 'm' centímetros, desenvolva um código para calcular o número total de LEDs no painel.
 * <p>
 * IMAGEM: src/main/resources/desafio_07-img.png
 * <p>
 * OBS: Os valores da altura e da largura devem ser recebidos por parâmetros
 */
public class Desafio {

  public static Integer calculaTotalLeds(Integer altura, Integer largura) {
    int ledsPorAltura;
    int ledsPorLargura;

    if (altura == 1) ledsPorAltura = 2;
    else if (altura > 1) ledsPorAltura = altura + 1;
    else ledsPorAltura = 0;

    if (largura == 1) ledsPorLargura = 2;
    else if (largura > 1) ledsPorLargura = largura + 1;
    else ledsPorLargura = 0;

    return ledsPorAltura * ledsPorLargura;
  }
}