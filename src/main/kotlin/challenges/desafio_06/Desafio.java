package challenges.desafio_06;

/**
 * Dizemos que um número natural X esconde o Y quando, ao apagar alguns algarismos de X, o número Y aparece.
 * Por exemplo, o número 12345 esconde o número 235, dado que pode ser obtido ao apagar os números 1 e 4.
 * Por outro lado, ele não esconde o número 154.
 * <p>
 * IMAGEM: [{1}, 2, 3, {4}, 5]. Os numeros nas chaves estão com riscos vermelhos.
 * A imagem demonstra números: [1, 2, 3, 4, 5] todos estão em azul, mas o número 1 e 4 estão com um risco vermelho.
 * <p>
 * Escreva um código que recebe dois números e que retorna um booleano dizendo se o primeiro esconde o segundo.
 */
public class Desafio {

  public static boolean checaNumeroEscondido(Integer numero, Integer numeroOculto) {
    var numeros = validar(numero, numeroOculto);

    return numeros.equals(numeroOculto.toString());
  }

  private static String validar(Integer numero, Integer numeroOculto) {
    StringBuilder numeros = new StringBuilder(numero.toString());

    int index = 0;
    for (int k = 0; k < numero.toString().length(); k++) {
      if (index < numeroOculto.toString().length()) {
        char caractereNumeroOculto = numeroOculto.toString().charAt(index);
        char caractereNumero = numero.toString().charAt(k);

        if (caractereNumero != caractereNumeroOculto) {
          var indexOf = numeros.toString().indexOf(caractereNumero);

          if (indexOf != -1) {
            numeros.deleteCharAt(indexOf);
          }
        } else {
          index++;
        }
      } else {
        return numeros.substring(0, index);
      }
    }

    return numeros.toString();
  }
}