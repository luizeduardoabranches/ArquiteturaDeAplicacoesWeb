# Arquitetura de aplicações WEB - Sistema de Autenticação e Autorização

Esta API permite que você controle acessos a determinadas partes do sistema a partir de ROLES de usuários.

## Sumário

- [Endpoints](#endpoints)
- [Autenticação](#autenticação)
- [Erros Comuns](#erros-comuns)
- [Diagrama](#diagrama)
- [Exemplos de Uso](#exemplos-de-uso)

### Endpoints

GET/moderador: localhost:8080/moderador

GET/admin: localhost:8080/moderador 

GET/comum: localhost:8080/moderador 

GET/username: localhost:8080/moderador <br>

### Autenticação

Esta API utiliza o Jason Web Token (JWT) como chave de autenticação.

### Erros Comuns

Os erros comuns da aplicação são esses:
 -[401 Unauthorized]: Significa que a senha ou o usuário estão incorretos.
 -[403 Forbidden]: Isso acontece porque o usuário autenticado não possui a role especificada.
