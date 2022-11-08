#

<h3>DESAFIO:</h3>

**Sua equipe está trabalhando em um app de streaming de músicas e uma das funcionalidades é criar um embaralhador de músicas.**
<br>
**Uma pesquisa feita pela equipe de UX mostrou que essa é uma das funcionalidades mais importantes para os usuários.**
<br>
**Por isso foi priorizada a criação de um experimento para testar a melhor solução.**

**A ideia é criar vários embaralhadores diferentes e realizar um teste com partes dos usuários (chamado de teste A/B),**
<br>
**onde cada grupo de usuários selecionado recebe uma versão e através de pesquisas e métricas de utilização saberemos qual terá a maior
aceitação.**

**Sua tarefa será desenvolver um desses embaralhadores.**
<br>
**Você deve criar uma função que receberá uma lista de pesos que representa as músicas mais ouvidas pelo usuário.**
<br>
**Sua função deve retornar uma lista organizada intercalando as músicas mais ouvidas com as músicas menos ouvidas. Por exemplo:**

**Na situação onde a lista de pesos é: [2, 10, 5, 3] sua função deverá retornar [10, 2, 5, 3]**

<h3>Exemplos:</h3>

- _shuffleMusicas(Arrays.asList(2, 10, 5, 3)_ → **[10, 2, 5, 3]**
- _shuffleMusicas(Arrays.asList(1, 2, 3, 4, 5))_ → **[5, 1, 4, 2, 3]**
- _shuffleMusicas(Arrays.asList())_ → **[]**

#

**Caminho para os testes deste desafio:** _src/test/kotlin/desafios/desafio_10/ShuffleMusicasTests.java_