#

<h3>DESAFIO:</h3>

**Um grande amigo seu mora numa cidade pequena, onde existem apenas duas empresas de táxi, a Empresa 1 e a Empresa 2.**
<br>
**Ambas mudam taxas a cada dia e calculam o valor das corridas da seguinte forma: uma taxa fixa mais um valor por quilômetro rodado.**
<br>
**Seu amigo é fisioterapeuta e pega táxis diariamente para visitar seus clientes ao redor da cidade.**
<br>
**Você decidiu escrever um código para ajudá-lo a decidir qual empresa escolher para cada uma das corridas, baseado no preço.**

**Sua função receberá 4 valores:**
<br>
**TF1 (a taxa fixa da empresa 1),**
<br>
**VQR1 (o valor por quilômetro rodado da empresa 1),**
<br>
**TF2 (a taxa fixa da empresa 2),**
<br>
**VQR2 (o valor por quilômetro rodado da empresa 2).**
<br>
**Todos em formato string.**
<br>
**Seu retorno deve ser uma string em uma das seguintes formas:**
<br>
**“Tanto faz” - para o caso de o valor das duas empresas para qualquer corrida ser igual**
**“Empresa 1” - se o valor da Empresa 1 for sempre menor que o da Empresa 2**
**“Empresa 2” - para o caso contrário do citado acima**
**“Empresa Xpto quando a distância < N,**
<br>
**Tanto faz quando a distância = N,**
<br>
**Empresa Ypto quando a distância > N”**
<br>
**para o caso de a escolha depender da distância a ser percorrida (onde Xpto e Ypto representa 1 ou 2 e N representa a distância).**

**Exemplo:**
**TF1 = 2,50**
**VQR1 = 1,00**
**TF2 = 5,00**
**VQR2 = 0,75**
**Output:**
**“Empresa 1 quando a distância < 10.0, Tanto faz quando a distância = 10.0, Empresa 2 quando a distância > 10.0”**

<h3>Exemplos:</h3>

- _escolheTaxi("2.5", "1.0", "5.0", "0.75")_ → **"Empresa 1 quando a distância < 10.0, Tanto faz quando a distância = 10.0, Empresa 2 quando a distância > 10.0"**
- _escolheTaxi("0.0", "0.0", "0.0", "0.0")_ → **""**
- _escolheTaxi("0.0", "0.0", "0.0", "0.0")_ → **""**

#

**Caminho para os testes deste desafio:** _src/test/kotlin/desafios/desafio_08/EscolheTaxiTests.java_
