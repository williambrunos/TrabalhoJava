# TrabalhoJava

*** === TRABALHO 1 JAVA TÉCNICAS DE PROGRAMAÇÃO === ***

Este é um arquivo readme que irá explicar como a aplicação em java funciona, o que é necessário
fazer para rodá-la em sua máquina e o passo a passo de como o programa funciona.

Primeiro, você recebeu um arquivo .zip com este readme e uma pasta chamada "trabalho-01-Java".
Portanto, copie esta pasta e cole em sua pasta de projetos do NetBeans ou ambiente de desenvolvimento.

Após isso, abra seu ambiente de desenvolvimento e procure a pasta do projeto, abra-a e você poderá ver
várias outras pastas e arquivos .XML. Abra a pasta source(src), você poderá observar que há quatro classes:
classe Contas, ContaPoupanca, ContaEspecial e Principal. Você pode estudar cada classe, pois há comentários
que explicam cada método e cada atributo. No entanto, basicamente a classe Contas serve de molde para as
outras classes, exceto a Principal, e serve para a criação da instância conta-comum(cc) e seus atributos e
métodos são trasnferidos por herança para as classes ContaPoupanca(cp) e ContaEspecial(ce).

	*** ============================= MANUAL DE USO =============================  ***

 === PARTE 1 - COLETA DE DADOS === 

Após colar a pasta "trablho-01-Java" no path onde seus projetos da IDE são guardados, abra a classe Principal,
compile e execute a aplicação.

Logo após a execução, aparecerá uma janela informando que se iniciará a coleta de informações a respeito do
correntista da conta-comum, coletando seu nome, número da conta e saldo inicial, todas em janelas diferentes.
Quaisquer dados inseridos de forma incorreta acarretará em uma janela de erro e forçará o usuário a digitar o
dado requisitado corretamente.

Após essa coleta de dados da conta-comum, uma janela informará o usuário que a coleta de dados a respeito da 
conta-poupança se iniciará. Da mesma forma, será coletado o nome do correntista, número da conta, taxa(em decimais)
de reajuste e saldo inicial, todas em janelas diferentes. Caso algum dado seja informado de forma incorreta, uma janela 
de erro irá aparecer forçando o usuário a digitar os dados corretamente. Além disso, a taxa de reajuste irá aumentar o 
salário inicial posteriormente, mas por padrão a taxa de reajuste adotada pelo sistema é de 10% ou 0.1.

Posterior a essa coleta, uma janela informará ao usuário que a coleta de dados a respeito da conta especial irá iniciar.
Em janelas diferentes, será coletado o nome do correntista, número da conta, multa caso o dinheiro do saque seja retirado
do limite da conta especial, o limite da conta e o saldo inicial da conta. Da mesma forma, caso algum dado seja informado com
erro, então uma janela de erro irá aparecer e forçará o usuário a digitar os dados corretamente.

* === PARTE 2 - TELA PRINCIPAL === *:

A tela principal feita com swing, é uma tela com alguns botões com certas funcionalidades a respeito das três instâncias
de contas criadas, conta-comum, popança e especial. Em todas as operações, o usuário é levado de volta à tela principal
com as operações, saindo apenas quando clicar em "sair".


* 2.1) Saque: 

O botão de saque, quando clicado, perguntará ao usuário o número da conta
especial de onde deseja realizar o saque. Caso o número de conta seja inváido, uma mensagem de erro será informada e retornará
a tela principal. Caso seja válido, será perguntado um valor para ser sacado, aparecendo uma tela de confirmação do saque.
Caso o saldo na conta for suficiente para cobrir o saque informado, o saldo é apenas reduzido do valor informado e uma mensagem
de confirmação do saque aparecerá com os dados da conta especial, incluindo o novo saldo. 
Caso o saldo na conta seja insuficiente para cobrir o saque, aparcerá uma mensagem de confirmação se for desejado a retirada do restante
saque - saldo do limite da conta, aplicando uma multa do que foi retirado do limite. A operação de saque pode ser cancelada a qualquer
momento durante a operação, bastante clicar em "cancelar". Vale ressaltar que, caso o usuário possua uma multa em sua conta e clique no
botão sacar, uma mensagem de erro aparecerá informando ao usuário que ele possui uma multa em sua conta e que deverá realizar um depósito
para anulá-la. Ademais, caso o valor do saque seja tão grande que nem o limite da conta possa cobrí-lo, uma mensagem será direcionada ao 
usuário informando esta situação e o saque não será realizado. Após o final do saque sucedido, uma mensagem de confirmação aparece
para o usuário informando os dados da conta, incluindo o saldo com a multa aplicada.

* 2.2) Depósito: 

O botão depósito, quando clicado, perguntará ao usuário o número da conta da qual deseja realizar a operação, seja ela uma
conta-comum, poupança ou especial. Após isso, é solicitado o valor a ser depositado na conta informada e uma janela de 
confirmação com os dados do correntista, saldo na conta ,número da conta e valor a ser depositado. Se a operação for, confirmada
o valor é depositado na conta informada e o novo saldo é informado ao usuário. Caso seja cancelado, uma mensagem de sucesso de
cancelamento é mostrada ao usuário. 

* 2.3) Transferência: 


* 2.4) Reajustar: 

O botão "reajustar", quando clicado, pede ao usuário o número de uma conta poupança para realizar o reajuste no saldo.
Se o número for inválido, uma mensagem de erro aparecerá para o usuário e ele retornará a tela principal. Se o número for
válido, ele perguntará se o usuário deseja realizar o reajuste com a taxa informada no início do programa. Se sim, uma mensagem
de confirmação informará os dados da conta e a taxa de reajuste adotada e pedirá a confirmação do correntista. Se for confirmado,
o reajuste é realizado e uma mensagem de confirmação é mostrada na tela com os dados da conta, incluindo o novo saldo. Se for cancelado,
uma mensagem de reajuste cancelado é mostrada ao usuário. Se ele clicar em "cancelar" na janela de confirmar a taxa informada, outra janela
aparece com os dados da conta poupança e pedindo a confirmação para realizar o reajuste padrão de 10%(0.1). Se for confirmado, o
reajuste de 10% é realizado na conta e uma janela de "reajuste realizado com sucesso" aparece com os novos dados da conta poupança.
Assim como anteriormente, se a opção "cancelar" for escolhida, então uma mensagem de "reajuste cancelado com sucesso" aparece e o usuário
é redirecionado para a tela principal de opções.

* 2.5) Ver Saldos: 

O botão "ver saldos", quando clicado, mostra em uma janela os dados a respeito das contas instanciadas no programa, conta-comum,
poupança, especial. Nessa janela, é possível ver o nome dos correntistas, números das contas e saldos atualizados de cada uma.


* 2.6) Sair: 

O botão sair simplesmente faz a tela principal ser fechada. Essa janela principal é fechada se, e somente se esse botão for clicado.

