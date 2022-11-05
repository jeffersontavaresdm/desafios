package challenges.desafio_05;

import java.util.ArrayList;
import java.util.List;

/**
 * Uma famosa empresa de streams de jogos quer fornecer para seus streamers um mecanismo para que eles possam realizar sorteios
 * nas suas lives de formas a dar mais chances para seus fãs mais fiéis.
 * Você foi contratado com a missão de ajudar a automatizar esse sorteio, sendo que ele deve seguir as seguintes regras:
 * <p>
 * A chance de uma pessoa ser sorteada é diretamente proporcional às horas de conteúdo que ela assistiu naquele canal.
 * Assim sendo, uma pessoa que ficou 20 horas acompanhando esse streamer tem o dobro de chances de ser sorteado
 * do que uma pessoa que o assistiu durante 10 horas, se ambas não forem assinantes pagos.
 * O número de horas é recebido em minutos e é sempre arredondado para cima, ou seja:
 * 181 minutos = 4 horas
 * 239 min = 4h
 * 180 min = 3h
 * <p>
 * Se possui uma assinatura paga da plataforma, as chances são dobradas.
 * No caso acima, se a pessoa que assistiu 10 horas for assinante premium e a que assistiu 20 horas não, ambos terão a mesa chance.
 * <p>
 * Assuma que vai receber os dados de horas assistidas e de assinaturas em dois vetores, no modelo mostrado abaixo:
 * <p>
 * assinante = [True, False, False, False, True, False, True, True, False, False, False]
 * minutos_assistidos = [6144, 2742, 330, 30, 1500, 4032, 24036, 3288, 2076, 24540, 4716]
 * Considere que as mesmas posições do vetor representam a mesma pessoa. Ex:
 * A pessoa número 1 é assinante e viu 103 horas de conteúdo
 * A pessoa número 4 não é assinante e viu meia hora de conteúdo
 * Escreva um código que retorne um vetor com o percentual de chances de cada uma das pessoas ser sorteada.
 * Retorne os valores arredondados para o inteiro mais próximo.
 * <p>
 * Exemplo:
 * assinante = [True, False]
 * horas_assistidas = [60, 120]
 * <p>
 * Output:
 * [50, 50]
 */
public class Desafio {

  public static List<Integer> calculaPorcentagemSorteio(List<Boolean> assinantes, List<Integer> minutosAssistidos) {
    List<Integer> minutosAssistidosArredondados = new ArrayList<>(assinantes.size());

    for (int i = 0; i < assinantes.size(); i++) {
      if (assinantes.get(i)) {
        minutosAssistidosArredondados.add(arredondar(minutosAssistidos.get(i)) * 2);
      } else {
        minutosAssistidosArredondados.add(arredondar(minutosAssistidos.get(i)));
      }
    }

    int minutosTotais = 0;
    for (Integer minutos : minutosAssistidosArredondados) {
      minutosTotais = minutosTotais + minutos;
    }

    List<Integer> porcentagens = new ArrayList<>(assinantes.size());
    for (Integer minutos : minutosAssistidosArredondados) {
      porcentagens.add(Math.toIntExact(Math.round((100.0 * minutos) / minutosTotais)));
    }

    return porcentagens;
  }

  /**
   * Para arredondar, fiz da seguinte forma:
   * ((65 + 59) / 60) * 60
   * (124 / 60) * 60
   * 2 * 60 = 120
   * Primeiro adiciono 59 aos minutos passados, por exemplo: minutosPassados (65) + 59 = 124
   * Depois divido o resultado por 60, que ficaria 2.066666667, mas o Java arredonda para 2.
   * Então multiplico o novo resultado por 60 (2 * 60) que fica = 120.
   * Dessa forma, entre 61 a 119 minutos será arredondado para 2 horas.
   */
  private static Integer arredondar(Integer minutos) {
    return ((minutos + 59) / 60) * 60;
  }
}