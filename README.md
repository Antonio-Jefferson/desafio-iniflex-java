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

| Nome      | Data de Nascimento | Salário   | Função    |
| --------- | ------------------ | --------- | --------- |
| João      | 01/05/1980         | 1500,00   | Analista  |
| Maria     | 15/08/1990         | 2000,00   | Gerente   |
| José      | 22/03/1985         | 1800,00   | Analista  |
| Ana       | 10/10/2000         | 2500,00   | Supervisor|
| Carlos    | 05/12/1975         | 1900,00   | Analista  |
| Paula     | 30/06/1995         | 2100,00   | Supervisor|
| Pedro     | 20/04/1992         | 2200,00   | Gerente   |
| Laura     | 12/11/1988         | 1900,00   | Analista  |
| Sofia     | 08/02/2005         | 2300,00   | Supervisor|

## Como Marcar os Requisitos Concluídos

- [x] Classe Pessoa com atributos definidos.
- [x] Classe Funcionário estendendo a classe Pessoa com atributos adicionais.
- [x] Classe Principal criada.
- [ ] Funcionários inseridos na lista.
- [ ] Funcionário "João" removido da lista.
- [ ] Lista de funcionários impressa com formatação adequada.
- [ ] Aumento de 10% no salário dos funcionários e lista atualizada.
- [ ] Funcionários agrupados por função em um MAP.
- [ ] Funcionários agrupados por função impressos.
- [ ] Funcionários que fazem aniversário em outubro e dezembro impressos.
- [ ] Funcionário com a maior idade impresso.
- [ ] Lista de funcionários impressa em ordem alfabética.
- [ ] Total dos salários dos funcionários impresso.
- [ ] Salários mínimos dos funcionários impressos.
