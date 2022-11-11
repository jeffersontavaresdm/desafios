#

<h3>DESAFIO:</h3>

**Durante uma expedição tecnológica, sua equipe encontrou o que parece ser a senha que lhes dá acesso a um grande tesouro digital.**
<br>
**Por sorte, sua equipe é formada pelas pessoas mais feras em programação e vocês rapidamente descobriram como decifrá-la.**

**Com a possibilidade de que vocês encontrem mais códigos contendo outras senhas,**
<br>
**você foi designado à tarefa de desenvolver um algoritmo que decifra os códigos para não precisarem fazer isso de forma manual.**

**A senha é representada por um número binário de 10 dígitos formado pelo dígito predominante de cada coluna.**
<br>
**Caso a coluna tenha a mesma quantidade de dígitos 0 e 1, deve se considerar o número 1.**

**Exemplo:**
<br>
**A primeira coluna da lista tem como dígito predominante o número 1, sendo assim, o primeiro dígito - dos 10 - da senha é 1.**

**Desenvolva um algoritmo que receba um array de valores binários (como o exemplo acima) e retorne a representação decimal da senha.**

<h3>Exemplos:</h3>

**List<String> senha01 = Arrays.asList(
"0110100000",
"1001011111",
"1110001010",
"0111010101",
"0011100110",
"1010011001",
"1101100100",
"1011010100",
"1001100111",
"1000011000"
);**

**List<String> senha02 = Arrays.asList(
"1111100000",
"1111100000",
"1111100000",
"1111100000",
"1111100000",
"1111100000",
"1111100000",
"1111100000",
"1111100000",
"1111100000"
);**

**List<String> senha03 = Arrays.asList(
  "1010101010",
  "1010101010",
  "1010101010",
  "1010101010",
  "1010101010",
  "0101010101",
  "0101010101",
  "0101010101",
  "0101010101",
  "0101010101"
);**

- _calculaNumeroDaSenha(senha01)_ → **724**
- _calculaNumeroDaSenha(senha02)_ → **992**
- _calculaNumeroDaSenha(senha03)_ → **1023**

#

**Caminho para os testes deste desafio:** [_só clicar aqui :D_](https://github.com/jeffersontavaresdm/desafios/tree/main/src/test/java/desafios/desafio_03)