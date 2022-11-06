package desafios.desafio_08;

import java.text.DecimalFormat;

/**
 * Um grande amigo mora numa cidade pequena, onde existem apenas duas empresas de táxi, a Empresa 1 e a Empresa 2.
 * Ambas mudam as taxas a cada dia e calculam o valor das corridas da seguinte forma: uma taxa fixa mais um valor por KM rodado.
 * Seu amigo é fisioterapeuta e pega táxis diariamente para visitar seus clientes ao redor da cidade.
 * Você decidiu escrever um código para ajudá-lo a decidir qual empresa escolher para cada uma das corridas, baseado no preço.
 * <p>
 * Sua função receberá 4 valores:
 * TF1 (a taxa fixa da empresa 1), VQR1 (o valor por quilômetro rodado da empresa 1),
 * TF2 (a taxa fixa da empresa 2), VQR2 (o valor por quilômetro rodado da empresa 2),
 * Todos em formato string.
 * O retorno deve ser uma string em uma das seguintes formas:
 * “Tanto faz” - para o caso de o valor das duas empresas para qualquer corrida ser igual
 * “Empresa 1” - se o valor da Empresa 1 for sempre menor que o da Empresa 2
 * “Empresa 2” - para o caso contrário do citado acima
 * “Empresa Xpto quando a distância < N, Tanto faz quando a distância = N, Empresa Ypto quando a distância > N”
 * para o caso de a escolha depender da distância a ser percorrida (onde Xpto e Ypto representa 1 ou 2 e N representa a distância).
 * <p>
 * Exemplo:
 * TF1 = 2,50
 * VQR1 = 1,00
 * TF2 = 5,00
 * VQR2 = 0,75
 * Output:
 * “Empresa 1 quando a distância < 10.0, Tanto faz quando a distância = 10.0, Empresa 2 quando a distância > 10.0”
 */
public class Desafio {

  public static String escolheTaxi(String tf1, String vqr1, String tf2, String vqr2) {
    double TF1 = Double.parseDouble(tf1);
    double VQR1 = Double.parseDouble(vqr1);
    double TF2 = Double.parseDouble(tf2);
    double VQR2 = Double.parseDouble(vqr2);

    String resultado;
    double distancia = 0.0;

    if (TF1 < TF2 && VQR1 > VQR2 || TF1 > TF2 && VQR1 < VQR2) {
      while (TF1 + (VQR1 * distancia) < TF2 + (VQR2 * distancia)) {
        distancia = distancia + 0.001;
      }

      distancia = Double.parseDouble(new DecimalFormat("0.00").format(distancia));

      if (distancia < distancia + 0.01) {
        resultado = "Empresa 1 quando a distância < " + distancia + ", Tanto faz quando a distância = " + distancia + ", Empresa 2 quando a distância > " + distancia;
      } else {
        resultado = "Empresa 2 quando a distância < " + distancia + ", Tanto faz quando a distância = " + distancia + ", Empresa 1 quando a distância > " + distancia;
      }
    } else {
      if (TF1 < TF2 && VQR1 < VQR2) {
        resultado = "Empresa 1";
      } else if (TF1 > TF2 && VQR1 > VQR2) {
        resultado = "Empresa 2";
      } else {
        resultado = "Tanto faz";
      }
    }

    return resultado;
  }
}