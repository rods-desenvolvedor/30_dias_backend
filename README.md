# 30 dias de desafios no backend

## dia 01
### API de ferramentas 

Descrição do desafio conforme o readme oficial : Sua tarefa é construir uma API e banco de dados para a aplicação VUTTR (Very Useful Tools to Remember). A aplicação é um simples repositório para gerenciar ferramentas com seus respectivos nomes, links, descrições e tags.

A aplicação pode ser construída utilizando qualquer linguagem, banco de dados, frameworks, libraries e ferramentas de sua preferência (Ex: Node + Express + Mongoose + MongoDB, PHP + Lumen + RedBean + PostgreSQL, etc). Apesar disso, a stack mais comum para squads aqui na BossaBox é **Node.js,** seguida por **PHP. Ruby** é incomum, mas aparece em raros casos.

A API deverá ser documentada utilizando o formato API Blueprint ou Swagger.

O que eu consegui implementar :
- Integração com o postgresql
- Rota para listar todas as ferramentas cadastradas
- Rota para cadastrar uma nova ferramenta
- Rota para apagar uma ferramenta a partir do id
- Rota para filtrar ferramentas a partir de tags

-----------------------------------------------------------------

## dia 02
### ATUALIZAÇÃO da API de ferramentas 

Nesse segundo desafio, refiz a api de ferramentas utilizando a mesma arquitetura do dia 01.
Entretanto, adicionei uma rota para deletar todas as ferramentas cadastradas.
Como evolução para o dia de hoje, dei os primeiros passos utilizando o Swagger para documentar minha API.

Futuras implementações :
- Sistema de autenticação para as rotas onde dados são apagados.
