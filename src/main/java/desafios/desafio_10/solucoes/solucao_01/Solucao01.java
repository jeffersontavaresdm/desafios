package desafios.desafio_10.solucoes.solucao_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solucao01 {

  public static List<Integer> solucao(List<Integer> musicasTocadas) {
    if (musicasTocadas.size() == 0) return Collections.emptyList();
    if (musicasTocadas.size() == 1) return musicasTocadas;

    var x = musicasTocadas.size() % 2 != 0 ? (musicasTocadas.size() / 2) + 1 : musicasTocadas.size() / 2;

    return embaralhar(x, 0, musicasTocadas, new ArrayList<>(musicasTocadas.size()));
  }

  private static List<Integer> embaralhar(int z, int y, List<Integer> musicasTocadas, List<Integer> musicasEmbaralhadas) {
    if (z > 0) {
      musicasTocadas.sort(Comparator.reverseOrder());
      musicasEmbaralhadas.add(musicasTocadas.get(y));
      musicasTocadas.sort(Comparator.naturalOrder());
      musicasEmbaralhadas.add(musicasTocadas.get(y));

      embaralhar(z - 1, y + 1, musicasTocadas, musicasEmbaralhadas);
    }

    List<Integer> resultado = new ArrayList<>(musicasTocadas.size());

    for (int i = 0; i < musicasTocadas.size(); i++) {
      resultado.add(musicasEmbaralhadas.get(i));
    }

    return resultado;
  }
}
