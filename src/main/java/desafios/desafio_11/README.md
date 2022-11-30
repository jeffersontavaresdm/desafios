#

<h3>DESAFIO:</h3>

**Para uma determinada matriz de números inteiros, execute operações na matriz.**
<br>
**Retorna o array resultante após todas as operações terem sido aplicadas na ordem dada.**
<br>
**Cada operação contém dois índices.**
<br>
**Inverta o subarray entre esses índices baseados em zero, inclusive.**

**Exemplo:**
<br>
**array = [9, 8, 7, 6, 5, 4, 3, 2, 1, 0]**
<br>
**operações: [[0, 9], [4, 5], [3, 6], [2, 7], [1, 8], [0, 9]]**

![imagem do desafio 11](https://github.com/jeffersontavaresdm/desafios/blob/main/src/main/resources/desafio_11-img.png)

**Na primeira operação, todos os elementos são invertidos.**
<br>
**Não há elementos à direita ou à esquerda. Na segunda operação, apenas os elementos da coluna "To Reverse" são invertidos.**
<br>
**Aqueles à esquerda e à direita permanecem os mesmos.**
<br>
**Lógica semelhante é aplicada para outras operações.**
<br>

**Descrição da função:**
<br>
**A função tem o(s) seguinte(s) parâmetro(s):**
<br>
**int arr[n]: uma matriz de inteiros**
<br>
**operações int[q][2]: uma matriz bidimensional de índices iniciais e finais**
<br>
**Retorna:**
<br>
**int[n]: o array final após todas as operações terem sido executadas**

**Restrições**<br>
**1 ≤ n**<br>
**q ≤ 103**<br>

**Explicação:**<br>
**arr = [1, 2, 3]**<br>
**operations = [[0, 2], [1, 2], [0, 2]]**

**Inverta arr[0] a arr[2]: arr = [3, 2, 1].**<br>
**Inverta arr[1] a arr[2]: arr = [3, 1, 2].**<br>
**Inverta arr[0] até arr[2]: arr = [2, 1, 3].**<br>

<h3>Exemplos:</h3>

- _realizarOperacoes([5, 4, 3, 2, 1], [[0, 4]])_ → **[1, 2, 3, 4, 5]**
- _realizarOperacoes([5, 4, 3, 2, 1], [[0, 1], [1, 2]])_ → **[4, 3, 5, 2, 1]**
- _realizarOperacoes([5, 4, 3, 2, 1], [[3, 4], [2, 3], [1, 2], [0, 1], [1, 4]])_ → **[1, 2, 3, 4, 5]**

#

**Caminho para os testes deste desafio:** [_só clicar aqui :
D_](https://github.com/jeffersontavaresdm/desafios/tree/main/src/test/java/desafios/desafio_11)