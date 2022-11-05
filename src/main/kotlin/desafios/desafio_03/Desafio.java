package desafios.desafio_03;

import java.util.LinkedList;
import java.util.List;

/**
 * Durante uma expedição tecnológica, sua equipe encontrou o que parece ser a senha que lhes dá acesso a um grande tesouro digital.
 * Por sorte, sua equipe é formada pelas pessoas mais feras em programação e vocês rapidamente descobriram como decifrá-la.
 * <p>
 * Com a possibilidade de que vocês encontrem mais códigos contendo outras senhas,
 * você foi designado à tarefa de desenvolver um algoritmo que decifra os códigos para não precisarem fazer isso de forma manual.
 * <p>
 * A senha é representada por um número binário de 10 dígitos formado pelo dígito predominante de cada coluna.
 * Caso a coluna tenha a mesma quantidade de dígitos 0 e 1, deve se considerar o número 1.
 * <p>
 * Exemplo: A primeira coluna da lista tem como dígito predominante o número 1, sendo assim, o primeiro dígito - dos 10 - da senha é 1.
 * <p>
 * 0110100000
 * 1001011111
 * 1110001010
 * 0111010101
 * 0011100110
 * 1010011001
 * 1101100100
 * 1011010100
 * 1001100111
 * 1000011000
 * <p>
 * Desenvolva um algoritmo que receba um array de valores binários (como o exemplo acima) e retorne a representação decimal da senha.
 */
class Desafio {

  public static Integer calculaNumeroDaSenha(List<String> senha) {
    StringBuilder resultado = new StringBuilder();

    for (int i = 0; i < senha.size(); i++) {
      List<Integer> valores = new LinkedList<>();

      for (String lista : senha) {
        valores.add(Integer.parseInt(String.valueOf(lista.charAt(i))));
      }

      int count0 = Math.toIntExact(valores.stream().filter(valor -> valor == 0).count());
      int count1 = Math.toIntExact(valores.stream().filter(valor -> valor == 1).count());

      if (count1 >= count0) {
        resultado.append('1');
      } else {
        resultado.append('0');
      }
    }

    return Integer.parseInt(resultado.toString(), 2);
  }
}