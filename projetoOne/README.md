# Projeto de Cálculo de Emissões de Carbono

Este projeto em Kotlin é um aplicativo que calcula as emissões de carbono para diversos alimentos com base em suas quantidades e tipos. Ele lê dados de um arquivo, processa as informações e retorna as emissões de carbono calculadas.

## Funcionalidades

- Leitura de dados de alimentos e suas quantidades a partir de um arquivo de texto.
- Cálculo das emissões de carbono com base no tipo de alimento e quantidade.
- Retorno de resultados que incluem mensagens para alimentos não encontrados no banco de dados.

## Estrutura do Projeto

1. **`getCarbonEmissions`**: Define a função `getCarbonEmissions` que calcula as emissões de carbono com base no tipo e quantidade do alimento.

2. **`carbonCalculation`**: Função principal que processa o arquivo de entrada, calcula as emissões de carbono e retorna os resultados.

3. **`Main.kt`**: Ponto de entrada do aplicativo que chama a função `carbonCalculation`.

## Como Usar

### 1. Preparar o Arquivo de Entrada

Crie um arquivo de texto (`Arquivo.txt`) com a lista de alimentos e suas quantidades. O formato deve ser `NomeDoAlimento:Quantidade`, onde `Quantidade` pode ser em gramas (g) ou quilogramas (kg). Exemplo:

```
Arroz:200g, Feijão:400g, Batata:150g
```

### 2. Implementar e Executar o Código

Certifique-se de que o arquivo de texto esteja no caminho correto e execute o aplicativo. O caminho do arquivo deve ser especificado no código Kotlin.

```kotlin
val pathFile = "C:\\caminho\\para\\seu\\arquivo\\Arquivo.txt"
```

### 3. Compilar e Rodar o Aplicativo

Compile e execute o projeto usando seu ambiente de desenvolvimento Kotlin preferido, como IntelliJ IDEA.

### 4. Resultados

O programa retornará uma string contendo as emissões de carbono calculadas para cada alimento. Se um alimento não estiver no banco de dados, uma mensagem será exibida informando que o alimento ainda não consta no banco.

## Exemplo de Saída

```
Alimento: arroz, Quantidade: 200g, Emissão de carbono: 0.54 kg CO₂e
Alimento: feijão ainda não consta em nosso Banco de Dados
Alimento: batata, Quantidade: 150g, Emissão de carbono: 0.045 kg CO₂e
```

## Dependências

- Kotlin Standard Library

## Observações

- Certifique-se de que o formato do arquivo de entrada esteja correto para evitar erros de processamento.
- Atualize o banco de dados de alimentos conforme necessário para incluir novos alimentos.

## Licença

Este projeto está licenciado sob a [MIT License](LICENSE).

## Contato

Para mais informações, entre em contato com [Seu Nome](lfreis.contato@gmail.com).

```
