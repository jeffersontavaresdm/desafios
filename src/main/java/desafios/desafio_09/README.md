#

<h3>DESAFIO:</h3>

**Ao se comparar se uma string é maior que outra, considera-se a ordem alfabética ou lexicográfica.**
<br>
**No caso, “abcd” < “adbc” < “bacd”.**
<br>
**Escreva uma função que receba uma string A e retorne uma string B, sendo que B é composta pelos mesmos caracteres que A
reordenados.**

**B deve obedecer às seguintes condições:**
- **Ser maior que A**
- **Ser a menor string possível que cumpra as condições acima.**
- **Caso não seja possível encontrar uma string que cumpra as condições, retorne a string “sem reposta”.**

**Por exemplo:**
<br>
**A = “ab”**
<br>
**Logo, o resultado será “ba”**

**A = “abcde”**
<br>
**Logo, o resultado será “abced”**

**A = “ba”**
**Nesse caso, o resultado será “sem resposta"**

<h3>Exemplos:</h3>

- _menorStringMaior("abcde")_ → **"abced"**
- _menorStringMaior("ab")_ → **"ba"**
- _menorStringMaior("ba")_ → **"sem resposta"**

#

**Caminho para os testes deste desafio:** [_só clicar aqui :D_](https://github.com/jeffersontavaresdm/desafios/tree/main/src/test/java/desafios/desafio_09)