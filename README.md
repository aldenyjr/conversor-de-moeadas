# 🌐 Aplicação de Conversor de Moedas 💱

Bem-vindo ao Conversor de Moedas em Java! Esta aplicação permite converter entre diferentes moedas de forma simples e rápida. Utilizando a API do [ExchangeRate-API](https://www.exchangerate-api.com/), você terá acesso às taxas de câmbio atualizadas.

## Estrutura do Projeto 🏗️

O projeto está organizado da seguinte forma:

-   `br.com.alura.conversormoedas.principal`: Aqui você encontrará a classe `Principal`, responsável por iniciar a aplicação.
-   `br.com.alura.conversormoedas.services`: Contém a classe `ConversorMoedasService`, que realiza a conversão de moedas.
-   `br.com.alura.conversormoedas.util`: Esta pasta contém classes utilitárias, como `Menu`, `HistoricoConversoes`, `DataAtualFormatada` e `Log`.

## Funcionalidades ✨

A aplicação oferece diversas funcionalidades, incluindo:

1.  **Conversão de Moedas**: Escolha entre diferentes pares de moedas e converta valores instantaneamente.
2.  **Histórico de Conversões**: Consulte o histórico das conversões realizadas durante a sessão.
3.  **Log de Operações**: Registre todas as operações realizadas pela aplicação para futura referência.

## Classes Principais 🖥️

### `Principal.java`

Esta classe é o ponto de entrada da aplicação, onde o usuário interage com o menu e escolhe as opções desejadas.

### `ConversorMoedasService.java`

Responsável pela lógica de conversão de moedas, utilizando a API para obter as taxas de câmbio atualizadas.

### `Menu.java`

Fornece uma interface amigável para o usuário, exibindo os diferentes menus da aplicação e solicitando entradas.

### `HistoricoConversoes.java`

Mantém um registro das conversões realizadas durante a sessão, permitindo ao usuário consultar o histórico posteriormente.

### `DataAtualFormatada.java`

Utilitário para formatar a data e hora atual de acordo com o padrão especificado.

### `Log.java`

Fornece funcionalidades para registrar as operações realizadas pela aplicação em um arquivo de log.

## Uso 🚀

Para executar a aplicação, basta iniciar a classe `Principal.java` e seguir as instruções apresentadas no console.