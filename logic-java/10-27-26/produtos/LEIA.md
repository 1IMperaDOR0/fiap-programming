# Checkpoint 06 — Backend de Cadastro de Produtos

API REST em Spring Boot com CRUD de produtos, persistência no Oracle e autenticação JWT.

## Tecnologias

Java 21, Spring Boot 4, Spring Web, Spring Data JPA (Hibernate), Bean Validation, Spring Security com OAuth2 Resource Server (JWT HS256), Oracle Database e Maven.

## Arquitetura

O projeto segue a arquitetura em camadas vista nas aulas 17 e 18:

| Camada | Pacote | Responsabilidade |
|---|---|---|
| Controller | `controller` | Recebe as requisições HTTP e devolve as respostas |
| Service | `service` | Regras de negócio (validação do campo `ativo`, email único, criptografia de senha) |
| Repository | `repository` | Acesso ao banco com Spring Data JPA |
| Model | `model` | Entidades `Produto` e `User` mapeadas para as tabelas `TB_PRODUTOS` e `TB_USERS` |
| DTO | `dto` | Objetos de entrada e saída do login (`LoginRequest`, `LoginResponse`) |
| Config | `config` | Configuração do Spring Security e do JWT |

## Como executar

1. Abra o projeto no IntelliJ (**File → Open** → pasta que contém o `pom.xml`) e aguarde o Maven baixar as dependências.
2. Configure as variáveis de ambiente na Run Configuration da classe `ProdutosApplication`:

   | Variável | Obrigatória | Descrição |
   |---|---|---|
   | `DB_USER` | Sim | Usuário do Oracle (ex.: `rm000000`) |
   | `DB_PASS` | Sim | Senha do Oracle |
   | `DB_URL` | Não | Padrão: `jdbc:oracle:thin:@//oracle.fiap.com.br:1521/ORCL` |
   | `JWT_SECRET` | Não | Segredo em Base64 para assinar os tokens (há um valor padrão para desenvolvimento) |
   | `SERVER_PORT` | Não | Padrão: `8080` |

3. Execute a classe `ProdutosApplication`. As tabelas são criadas automaticamente (`ddl-auto=update`).

## Rotas

| Método | Rota | Autenticação | Descrição | Respostas |
|---|---|---|---|---|
| POST | `/user` | Pública | Cadastra um usuário (senha salva com BCrypt) | 201, 400, 409 |
| POST | `/auth/login` | Pública | Autentica e devolve o token JWT (válido por 2h) | 200, 401 |
| GET | `/produtos` | Token | Lista todos os produtos | 200 |
| GET | `/produtos/{id}` | Token | Busca um produto pelo id | 200, 404 |
| POST | `/produtos` | Token | Cadastra um produto | 201, 400 |
| PUT | `/produtos/{id}` | Token | Atualiza todos os campos do produto | 200, 400, 404 |
| PATCH | `/produtos/{id}` | Token | Atualiza apenas o campo `ativo` | 200, 400, 404 |
| DELETE | `/produtos/{id}` | Token | Exclui o produto | 204, 404 |

Sem token, ou com token inválido ou expirado, qualquer rota de produtos responde **401 Unauthorized**.

### Exemplo de produto

```json
{
  "nome": "Notebook Dell",
  "preco": 4500.00,
  "quantidadeEstoque": 10,
  "ativo": "Y"
}
```

Regras de validação:

- `nome` é obrigatório;
- `preco` e `quantidadeEstoque` são obrigatórios e não podem ser negativos;
- `ativo` aceita apenas `Y` ou `N` (maiúsculo ou minúsculo).

## Testando com o Postman

A coleção está em `postman/Checkpoint06-Produtos.postman_collection.json`. Para importar, use **Import** no Postman.

A coleção já vem configurada com:

- `baseUrl` = `http://localhost:8080`;
- autenticação **Bearer Token** com `{{token}}` aplicada a todas as rotas de produtos;
- **No Auth** nas rotas públicas (Criar usuário e Login);
- variável `id`, usada nas rotas `/produtos/{{id}}`.

Ordem de teste:

1. **Criar usuário** → 201
2. **Login** → 200. O script da requisição salva o token na variável `token`. Se isso não acontecer, copie o token da resposta para a variável `token` da coleção.
3. **Listar todos** → 200
4. **Cadastrar** → 201. Copie o `id` da resposta para a variável `id` da coleção.
5. **Buscar por ID** → 200
6. **Alterar (PUT)** → 200
7. **Ativar/Desativar (PATCH)** → 200
8. **Excluir** → 204
9. **Buscar por ID** → 404, confirmando a exclusão

---

## Histórico de alterações

- **Ajuste final:** a classe de teste `ProdutosApplicationTests` foi movida do pacote `br.com.fiap` para `br.com.fiap.produtos`, para que o `@SpringBootTest` encontre a classe principal da aplicação.
- **Ajuste final:** adicionados este `LEIA.md` e a coleção do Postman na pasta `postman/`.
