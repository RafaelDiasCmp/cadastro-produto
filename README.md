# Product Registration System

Este projeto é um sistema de cadastro de produtos desenvolvido com Spring Boot e Java, oferecendo uma interface amigável para gerenciamento de produtos, com funcionalidades de CRUD (Create, Read, Update, Delete) completas.

## Funcionalidades

### Backend
- **Cadastro de Produtos**: Adicione novos produtos ao sistema com detalhes como nome, descrição, preço e quantidade em estoque.
- **Listagem de Produtos**: Visualize a lista de todos os produtos cadastrados no sistema.
- **Atualização de Produtos**: Edite as informações de produtos existentes, como nome, descrição, preço e quantidade.
- **Remoção de Produtos**: Exclua produtos do sistema permanentemente.
- **Busca de Produtos**: Pesquise produtos por nome ou outros critérios.
- **API RESTful**: Integração com APIs REST para facilitar a comunicação entre o frontend e backend.

### Frontend
- **Interface de Usuário Intuitiva**: Interface web desenvolvida para ser fácil de usar e navegar, com foco em experiência do usuário.
- **Formulários Responsivos**: Formulários para adicionar e editar produtos com validação de dados.
- **Listagem Dinâmica**: Exibição de produtos com opções de filtro e ordenação.
- **Notificações de Sucesso e Erro**: Feedback imediato ao usuário sobre as operações realizadas.
- **Design Responsivo**: Layout adaptável para diferentes dispositivos (desktop, tablet, mobile).

## Tecnologias Utilizadas

- **Java**: Linguagem de programação principal para o desenvolvimento do backend.
- **Spring Boot**: Framework para criar aplicações Java de maneira simples e produtiva.
- **Spring Data JPA**: Simplifica a implementação do acesso a dados persistentes.
- **H2 Database**: Banco de dados em memória utilizado para desenvolvimento e testes.
- **Thymeleaf**: Motor de templates para renderização do frontend.
- **Bootstrap**: Framework CSS para um design moderno e responsivo.
- **Maven**: Gerenciamento de dependências e automação de build.

## Como Executar o Projeto

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/usuario/product-registration-system.git
   ```

2. **Navegue até o diretório do projeto**:
   ```bash
   cd product-registration-system
   ```

3. **Execute o projeto com Maven**:
   ```bash
   mvn spring-boot:run
   ```

4. **Acesse a aplicação**:
   Abra o navegador e vá para `http://localhost:8080`.
