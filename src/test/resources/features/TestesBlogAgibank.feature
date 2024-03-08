# language: pt
# Author: Danilo Silva Tempos
# encoding UTF-8
Funcionalidade: Realizar testes no blog do Agibank

  @TestesAgibank @CT01
  Esquema do Cenário: CT01 - Realizar uma pesquisa no blog do Agibank
    Dado que acesso a tela inicial do blog Agibank
    Quando realizar pesquisa sobre "<assunto>"
    Entao validar que pesquisou com sucesso sobre "<assunto>"

    Exemplos:
      | assunto |
      | agibank |
      | teste   |

  @TestesAgibank @CT02
  Cenário: CT02 - Acessar o conteúdo sobre Empréstimo Pessoal no blog do Agibank
    Dado que acesso a tela inicial do blog Agibank
    Quando acessar o submenu sobre Empréstimo Pessoal no menu de Produtos da tela principal
    E acessar conteúdo sobre Empréstimo Pessoal
    Entao validar acesso com sucesso ao conteúdo sobre Empréstimo Pessoal
