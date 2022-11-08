
#

<h3>DESAFIO:</h3>

**Você está trabalhando para uma empresa que fornece materiais escolares e precisa da sua ajuda para entrar no mundo digital.**
<br>
**Como primeira atividade, você identificou que não existe uma funcionalidade que é muito importante para a empresa ter mais controle sobre os valores dos produtos vendidos.**
<br>
**Esta funcionalidade consiste em descobrir o maior e o menor valor dos produtos vendidos em um período de tempo, para cada vendedor.**

**Os valores das vendas que devem ser consideradas podem variar entre 20 e 500 reais e estão agrupados por vendedores.**
<br>
**Além disso, deve-se ignorar as devoluções, que estão indicadas com o valor 0.**

**A sua função/método deverá receber uma lista de vendas agrupadas por vendedores, (e.g. [[200, 100], [300]])**
<br>
**e retornar um array onde a primeira posição contém o menor valor e a segunda posição o maior valor (e.g. [100, 300]).**

**Mas preste atenção! Algum vendedor pode não ter realizado vendas no período.**

<h3>Exemplos:</h3>

- _retornaMenorEMaiorValorDeVendas(Arrays.asList(List.of(200, 100), List.of(300)))_ → **[100]**
- _retornaMenorEMaiorValorDeVendas(Arrays.asList(List.of(200, 10), List.of(3000)))_ → **[200]**
- _retornaMenorEMaiorValorDeVendas(retornaMenorEMaiorValorDeVendas(Collections.emptyList())_ → **[]**

#

**Caminho para os testes deste desafio:** _src/test/kotlin/desafios/desafio_02/RetornaMenorEMaiorValorDeVendasTests.java_