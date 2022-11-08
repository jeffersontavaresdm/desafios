#

<h3>DESAFIO:</h3>

**Dada um texto qualquer e um lista de termos de pesquisa (sequencia de caracteres),**
<br>
**retorne os primeiros K termos mais recorrentes na string, onde K é um parâmetro configurável.**

**Exemplo:**
**String: "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua"**

**Lista de termos: ["a", "em", "i", "el"]**

**K: 2**

**Resultado: ["i", "a"]**

**Explicação:**
<br>
**Ocorrências de cada termo,"i": 11, "a": 7, "em": 2, "el": 1, com K = 2, retornamos "i" e "a" ordenados conforme a quantidade de ocorrências de cada termo.**

**OBS: Quando houver termos com quantidades iguais, priorizar o retorno de acordo com a ordem de ocorrência do termo na string.**

<h3>Exemplos:</h3>

**String string01 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua";**
<br>
**List<String> termos01 = Arrays.asList("a", "em", "i", "el");**

**String string02 = "1 BC 1 123 AA BC";**
<br>
**List<String> termos02 = Arrays.asList("A", "1", "BC");**

- _calculaTopOcorrenciasDeQueries(string01, termos01, 2)_ → **["i", "a"]**
- _calculaTopOcorrenciasDeQueries(string02, termos02, 2)_ → **["1", "A"]**

#

**Caminho para os testes deste desafio:** _src/test/kotlin/desafios/desafio_04/CalculaTopOcorrenciasDeQueriesTest.java_