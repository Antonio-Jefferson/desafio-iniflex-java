# Teste Prático - Iniflex

## Descrição

Este é um teste prático de programação para a Iniflex. O objetivo é criar um projeto Java que atenda aos requisitos especificados abaixo.

## Requisitos

### Classe Pessoa

- Atributos:
  - `nome` (String)
  - `dataNascimento` (LocalDate)

### Classe Funcionário

- Esta classe deve estender a classe Pessoa.

- Atributos adicionais:
  - `salario` (BigDecimal)
  - `funcao` (String)

### Classe Principal

Crie uma classe chamada "Principal" para executar as seguintes ações:

1. Inserir todos os funcionários, seguindo a mesma ordem e informações da tabela abaixo.
2. Remover o funcionário "João" da lista.
3. Imprimir todos os funcionários com todas as suas informações, seguindo as regras abaixo:
   - A informação de data deve ser exibida no formato "dd/mm/aaaa".
   - A informação de valor numérico deve ser exibida no formato com separador de milhar como ponto e decimal como vírgula.
4. Dar um aumento de 10% no salário de todos os funcionários e atualizar a lista de funcionários com os novos valores.
5. Agrupar os funcionários por função em um MAP, onde a chave é a "função" e o valor é a lista de funcionários.
6. Imprimir os funcionários agrupados por função.
7. Imprimir os funcionários que fazem aniversário nos meses 10 e 12.
8. Imprimir o funcionário com a maior idade, exibindo os atributos "nome" e "idade".
9. Imprimir a lista de funcionários em ordem alfabética.
10. Imprimir o total dos salários dos funcionários.
11. Imprimir quantos salários mínimos cada funcionário ganha, considerando que o salário mínimo é R$1212.00.

## Tabela de Funcionários

| Nome      | Data de Nascimento | Salário   | Função    
| --------- | ------------------ | --------- | --------- 
|Maria      | 18/10/2000         | 2.009,44  | Operador  
|Caio       | 02/04/1961         | 9.836,14  | Coordenador 
|Miguel     | 14/10/1988         | 19.119,88 | Diretor   
|Alice      | 05/12/1975         | 1.900,00  | Recepcionísta 
|Heitor     | 19/11/1999         | 1.582,72  | Operador  
|Arthur     | 31/03/1993         | 4.071,84  | Contador  
|Laura      | 08/08/1994         | 3.017,45  | Gerente   
|Heloísa    | 24/04/2003         | 1.606,85  | Eletricista 
|Helena     | 02/09/1996         | 2.799,93  | Gerente  

## Lista de Requisitos

- [x] Classe Pessoa com atributos definidos.
- [x] Classe Funcionário estendendo a classe Pessoa com atributos adicionais.
- [x] Classe Principal criada.
- [x] Funcionários inseridos na lista.
- [x] Funcionário "João" removido da lista.
- [x] Lista de funcionários impressa com formatação adequada.
- [x] Aumento de 10% no salário dos funcionários e lista atualizada.
- [x] Funcionários agrupados por função em um MAP.
- [x] Funcionários agrupados por função impressos.
- [ ] Funcionários que fazem aniversário em outubro e dezembro impressos.
- [ ] Funcionário com a maior idade impresso.
- [ ] Lista de funcionários impressa em ordem alfabética.
- [ ] Total dos salários dos funcionários impresso.
- [ ] Salários mínimos dos funcionários impressos.
