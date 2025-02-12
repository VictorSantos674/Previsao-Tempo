# Projeto Previsão-Tempo 🌦️

Este projeto é uma API de previsão do tempo que fornece dados meteorológicos em tempo real, histórico de previsões e alertas meteorológicos. Ele foi desenvolvido utilizando **Spring Boot**, **JPA/Hibernate** e **REST API**.

---

## Funcionalidades Principais

- **Previsão do Tempo**: Obtenha a previsão do tempo atual para uma cidade específica.
- **Histórico de Previsões**: Acesse o histórico de previsões para uma cidade.
- **Alertas Meteorológicos**: Receba notificações sobre condições climáticas adversas.
- **Integração com APIs Externas**: Utiliza a API do OpenWeatherMap para obter dados meteorológicos.

---

## Tecnologias Utilizadas

- **Spring Boot**: Framework para desenvolvimento de aplicações Java.
- **JPA/Hibernate**: Persistência de dados no banco de dados.
- **REST API**: Exposição de endpoints para consumo de dados.
- **H2/MySQL/PostgreSQL**: Banco de dados para armazenamento de informações.
- **Spring Security**: Autenticação e autorização de usuários.
- **JWT**: Autenticação baseada em tokens.

---

## Como Executar o Projeto

### Pré-requisitos

- Java 17 ou superior.
- Maven instalado.
- Chave de API do OpenWeatherMap (obtenha em [OpenWeatherMap](https://openweathermap.org/api)).

### Passos

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/previsao-tempo.git
   ```

2. Configure a chave da API no arquivo `application.properties`:
   ```properties
   openweathermap.api.key=sua_chave_aqui
   ```

3. Execute o projeto:
   ```bash
   mvn spring-boot:run
   ```

4. Acesse a aplicação:
   - API: `http://localhost:8080`
   - Página estática: `http://localhost:8080/index.html`

---

## Endpoints da API

- **GET /previsao/{cidade}**: Retorna a previsão do tempo para uma cidade.
- **GET /historico/{cidade}**: Retorna o histórico de previsões para uma cidade.
- **POST /alertas**: Envia um alerta meteorológico.

---

## Testes

O projeto inclui testes unitários e de integração para garantir a qualidade do código. Para executar os testes, use o comando:
```bash
mvn test
```

---

## Contribuição

Contribuições são bem-vindas! Siga os passos abaixo:

1. Faça um fork do projeto.
2. Crie uma branch para sua feature (`git checkout -b feature/nova-feature`).
3. Commit suas mudanças (`git commit -m 'Adicionando nova feature'`).
4. Push para a branch (`git push origin feature/nova-feature`).
5. Abra um Pull Request.

---

## Licença

Este projeto está licenciado sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---

## Contato

- **Autor**: [Victor Santos](https://github.com/VictorSantos674)
- **Email**: 3.victorsouza@gmail.com
```

---

### **Explicação do README**

1. **Título e Descrição**:
   - O título é claro e descritivo, com um emoji para chamar atenção.
   - A descrição resume o propósito do projeto e as tecnologias utilizadas.

2. **Funcionalidades**:
   - Lista as principais funcionalidades de forma clara e concisa.

3. **Tecnologias**:
   - Destaca as tecnologias utilizadas, o que é útil para desenvolvedores que queiram contribuir ou entender o projeto.

4. **Como Executar**:
   - Fornece instruções passo a passo para configurar e executar o projeto.

5. **Endpoints da API**:
   - Descreve os principais endpoints disponíveis na API.

6. **Testes**:
   - Explica como executar os testes do projeto.

7. **Contribuição**:
   - Incentiva contribuições e fornece um guia simples para colaboradores.

8. **Licença**:
   - Informa sobre a licença do projeto.

9. **Contato**:
   - Fornece informações de contato para dúvidas ou sugestões.
