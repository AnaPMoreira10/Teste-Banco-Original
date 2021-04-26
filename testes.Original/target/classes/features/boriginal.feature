#Author: ana.tana@hotmail.com

@executa
Feature: Cadastrar conta digital
  Eu como usuario quero criar uma conta digital para realizar transacoes
   
  Scenario: Abertura de conta digital   
    Given que eu acesse "https://www.original.com.br"
    And clicar no botao abrir conta
    When preencher os campos obrigatórios
    Then formulário de conta enviado com sucesso
  