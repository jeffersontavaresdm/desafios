package desafios.desafio_10.solucoes.solucao_02;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Solucao02 {

  public static List<Integer> solucao(List<Integer> musicasTocadas) {
    List<No> listaLigada = new LinkedList<>();

    System.out.println("\nLISTA ATUAL: " + musicasTocadas);

    ordenarDesc(musicasTocadas);

    System.out.println("LISTA ORDENADA (DESCENDENTE): " + musicasTocadas);

    popularListaLigada(musicasTocadas, listaLigada);

    System.out.println("\nLISTA-LIGADA POPULADA:");
    imprimir(listaLigada);

    manipularListaLigada(listaLigada);

    System.out.println("\nLISTA-LIGADA EMBARALHADA:");
    imprimir(listaLigada);

    Collections.fill(musicasTocadas, null);

    No no = null;
    for (int i = 0; i < musicasTocadas.size(); i++) {
      if (no == null) no = listaLigada.get(i);
      else no = listaLigada.get(no.getProximoIdx());

      musicasTocadas.set(i, no.getValor());
    }

    return musicasTocadas;
  }

  private static void manipularListaLigada(List<No> listaLigada) {
    int iteracoes;
    if (listaLigada.size() % 2 == 0) {
      iteracoes = listaLigada.size() / 2;
    } else {
      iteracoes = listaLigada.size() / 2 + 1;
    }

    for (int i = 0; i < iteracoes; i++) {
      var aux01 = listaLigada.get(i);
      var aux02 = listaLigada.get((listaLigada.size() - 1) - i);

      if (i == 0) {
        aux01.setAnteriorIdx(null);

        if (listaLigada.size() - 1 > 0) {
          aux02.setProximoIdx(1);
          aux02.setAnteriorIdx(0);

          aux01.setProximoIdx(aux02.getIdx());
        } else {
          aux01.setProximoIdx(null);
        }
      } else {
        aux01.setAnteriorIdx(aux02.getProximoIdx());

        aux02.setAnteriorIdx(aux01.getIdx());
        aux02.setProximoIdx(aux01.getProximoIdx());

        aux01.setProximoIdx((listaLigada.size() - 1) - i);

        if (Objects.equals(aux01.getAnteriorIdx(), aux01.getProximoIdx())) aux01.setProximoIdx(null);
      }
    }
  }

  private static void imprimir(List<No> listaLigada) {
    listaLigada.forEach(no ->
      System.out.println(
        "index = " + no.getIdx()
          + ", valor = " + no.getValor()
          + ", index anterior = " + no.getAnteriorIdx()
          + ", proximo index = " + no.getProximoIdx()
      )
    );
  }

  private static void popularListaLigada(List<Integer> musicasTocadas, List<No> listaLigada) {
    for (int i = 0; i < musicasTocadas.size(); i++) {
      if (i == 0) {
        if (musicasTocadas.size() - 1 >= i + 1) {
          listaLigada.add(new No(i, musicasTocadas.get(i), null, i + 1));
        } else {
          listaLigada.add(new No(i, musicasTocadas.get(i), null, null));
        }
      } else {
        if (musicasTocadas.size() - 1 >= i + 1) {
          listaLigada.add(new No(i, musicasTocadas.get(i), i - 1, i + 1));
        } else {
          listaLigada.add(new No(i, musicasTocadas.get(i), i - 1, null));
        }
      }
    }
  }

  private static void ordenarAsc(List<Integer> valores) {
    for (int i = 0; i < valores.size(); i++) {
      for (int k = i + 1; k < valores.size(); k++) {
        if (valores.get(i) > valores.get(k)) {
          var aux = valores.get(i);
          valores.set(i, valores.get(k));
          valores.set(k, aux);
        }
      }
    }
  }

  private static void ordenarDesc(List<Integer> valores) {
    for (int i = valores.size() - 1; i >= 0; i--) {
      for (int k = i - 1; k >= 0; k--) {
        if (valores.get(i) > valores.get(k)) {
          var aux = valores.get(i);
          valores.set(i, valores.get(k));
          valores.set(k, aux);
        }
      }
    }
  }
}