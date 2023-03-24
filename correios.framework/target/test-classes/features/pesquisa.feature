#Author: Queila2000@hotmail.com
Feature: Consultar avenida
Como usuario irei consultar avenida

  @Positive
  Scenario:  Digitar 
    Given que entre no site "https://www.correios.com.br/"
    When digito avenida
    And clico na lupa
    Then resultados validos





    