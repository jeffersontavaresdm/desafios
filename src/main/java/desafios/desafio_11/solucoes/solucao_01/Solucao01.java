package desafios.desafio_11.solucoes.solucao_01;

import java.util.ArrayList;
import java.util.Arrays;

public class Solucao01 {

  public static Integer[] solucao(Integer[] vetor, Integer[][] operacoes) {
    if (vetor.length <= 1 || operacoes.length >= 103) return vetor;

    System.out.println();
    System.out.println("Vetor antes de reverter: " + String.join(" - ", Arrays.stream(vetor).map(Object::toString).toList()));

    for (Integer[] operacao : operacoes) {
      if (operacao.length <= 1 || operacao[0] >= operacao[1]) break;

      var esquerda = new ArrayList<Integer>();
      var reverter = new ArrayList<Integer>();
      var direita = new ArrayList<Integer>();

      for (int i = 0; i < vetor.length; i++) {
        if (i < operacao[0]) {
          esquerda.add(vetor[i]);
        } else if (i > operacao[1]) {
          direita.add(vetor[i]);
        } else {
          reverter.add(vetor[i]);
        }
      }

      System.out.println("Vetor da esquerda: " + String.join(" - ", esquerda.stream().map(Object::toString).toList()));
      System.out.println("Vetor para reverter: " + String.join(" - ", reverter.stream().map(Object::toString).toList()));
      System.out.println("Vetor da direita: " + String.join(" - ", direita.stream().map(Object::toString).toList()));

      for (int i = 0; i < reverter.size(); i++) {
        for (int w = i + 1; w < reverter.size(); w++) {
          var tmp = reverter.get(i);
          reverter.set(i, reverter.get(w));
          reverter.set(w, tmp);
        }
      }

      var i = 0;
      var contador = 0;
      while (contador < esquerda.size()) {
        vetor[i] = esquerda.get(contador);
        contador++;
        i++;
      }

      contador = 0;

      while (contador < reverter.size()) {
        vetor[i] = reverter.get(contador);
        contador++;
        i++;
      }

      contador = 0;

      while (contador < direita.size()) {
        vetor[i] = direita.get(contador);
        contador++;
        i++;
      }

      System.out.println("Vetor após reverter: " + String.join(" - ", Arrays.stream(vetor).map(Object::toString).toList()) + "\n");
    }

    return vetor;
  }
}
