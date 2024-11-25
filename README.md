<p>O projeto consiste em criar um ranking de autores com os melhores livros a partir de um banco de dados já existente com dados de livros (título, autores, nota, isbn, isbn13, linguagem, número de páginas, avaliações e avaliações com texto). </p>

## Funcionalidades do Sistema:
### Menu Principal: 
O sistema terá um menu com as seguintes opções:

### Funcionalidades de Livros
As funcionalidades de livros permitirão que o sistema exiba, filtre e ordene os livros disponíveis no banco de dados:
- ### Listagem dos Melhores Livros:
  Exibe uma lista de livros ordenada pela nota ou classificação média, com destaque para os mais bem avaliados.
- ### Filtros de Pesquisa:
  Permite filtrar os livros por linguagem, número de páginas, ano de publicação e autor.
- ### Informações Detalhadas:
  Para cada livro na lista, exibir informações detalhadas como:
  - Título
  - Título
  - Autor(es)
  - Nota média
  - Número de avaliações
  - Número de avaliações com texto (resenhas)
  - ISBN 
  - ISBN-13
  - Idioma
  - Número de páginas

- ### Classificação por nota:
  Ordena a lista de livros com base na nota média, das mais altas para as mais baixas.

## Funcionalidades de Autores
As funcionalidades de autores possibilitarão a classificação e exibição dos melhores autores no banco de dados:

- ### Ranking dos Melhores Autores: 
  Exibe uma lista de autores, classificados pela média das avaliações dos livros que escreveram.
- ### Detalhes dos Autores: 
  Para cada autor listado, exibir dados como:
  - Nome do autor
  - Número de livros bem avaliados
  - Nota média geral dos livros
- ### Filtragem de Autores: 
  Permite filtrar a lista de autores com base no número de livros ou na nota média mínima de suas obras.

## Funcionalidades do Banco de Dados
O banco de dados servirá como o armazenamento central para os dados de livros e autores:
- ### Carregar Dados:
  Ao iniciar o sistema, carregar todos os dados de livros e autores a partir de um arquivo serializado ou banco de dados.
- ### Salvar Dados:
  Permitir a atualização dos dados e salvar qualquer alteração no banco de dados de forma persistente.
- ### Sair
  Encerrar o sistema.

- ### Interação do Usuário:
  As buscas realizadas pelo usuário serão exibidas no terminal, com formatação clara e intuitiva, permitindo uma fácil compreensão dos resultados por base de tabelas.

- ### Tratamento de Erros:
  O sistema incluirá mecanismos para lidar com entradas inválidas, garantindo que o usuário receba mensagens informativas caso uma busca não retorne resultados.

- ### Exemplos de Uso:
  O usuário poderá interagir com o sistema através do menu, podendo selecionar as opções desejadas e visualizar as informações diretamente no terminal.

- ### Melhorias Futuras:
  Futuramente, planejamos implementar uma interface gráfica e um sistema de recomendação para aprimorar a experiência do usuário, ou uma página na web

- ### Testes:
  O sistema será testado para garantir que todas as funcionalidades operem corretamente, com validação de dados e tratamento de erros.

____
