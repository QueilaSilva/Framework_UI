#Author: 
Feature: Consulta cep
Como usuario irei consultar cep

@Negative
  Scenario: Cep inexistente
    Given que esteja no site  "https://www.correios.com.br/"
    But digito cep enexistente
    When clicar na lupa
    Then mensagem informa dados nao encontrados


