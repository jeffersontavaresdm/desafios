#

<h3>PROBLEM:</h3>

**Você e seu time estão desenvolvendo um sistema de indicações de postos de gasolina que ficam próximos da localização atual do veículo.**
**No modo de direção “viagem”, a funcionalidade a ser desenvolvida é de indicar ao condutor o posto mais distante possível dentro do limite atual de combustível.**
**E caso não exista posto de gasolina, retornar -1**

**A pessoa responsável por fazer a especificação do sistema informou que você terá as seguintes informações:**
**consumo médio de combustível, quantidade de combustível restante no veículo e um array contendo distâncias dos postos de gasolinas.**

**Exemplo:**
**Combustivel (em litros): 2**
**Consumo médio (km/l): 8**
**Postos de Gasolina (km): [2, 15, 22, 10.2]**
#

<h3>Exemplos:</h3>

- _ultimaParada(2, 8, Arrays.asList(2, 15, 22, 10))_ → **15**
- _ultimaParada(2, 8, Arrays.asList(2, 15, 22, 10))_ → **45**
- _ultimaParada(2, 8, Arrays.asList(2, 15, 22, 10))_ → **-1**

#

**Caminho para os testes deste desafio:** _src/test/kotlin/challenges/task_01/UltimaParadaTests.java_