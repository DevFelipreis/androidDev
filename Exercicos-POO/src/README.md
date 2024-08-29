# Atividades Práticas - Orientação a Objetos

Neste capítulo, exploramos a importância de compreender diferentes paradigmas de programação, com ênfase em Orientação a Objetos. Aprendemos sobre os pilares da orientação a objetos: **Herança, Encapsulamento, Abstração e Polimorfismo**, e suas aplicações em termos de usabilidade, eficiência, fácil manutenção, escalabilidade, e reutilização de código. As atividades práticas a seguir foram desenvolvidas para consolidar o aprendizado desse capítulo.

## 1ª Tarefa: Floresta
- **Objetivo:** Criar uma classe `Animal` com quatro atributos e quatro métodos.
- **Descrição:** Na função `main`, crie oito objetos da classe `Animal` e imprima seus atributos e métodos.
- **Dica:** Use sua criatividade para definir os atributos e métodos.

## 2ª Tarefa: Carros e seus Modelos
- **Objetivo:** Criar uma classe `Carros` com três modelos de carros, junto com os atributos e métodos definidos.
- **Descrição:**
    - Defina atributos como: consumo de gasolina, cor, tipo do motor, marca e odômetro.
    - Implemente um método `consumo()` que verifica se o carro é econômico ou de alto consumo, com base no consumo de combustível.
    - Crie no mínimo três objetos de diferentes modelos e imprima-os.
    - Informe qual carro oferece o melhor custo-benefício em Km/L.

## 3ª Tarefa: Banco Simples
- **Objetivo:** Criar uma classe `ContaBancaria` com atributos privados `saldo` e `titular`.
- **Descrição:**
    - Implemente métodos públicos para acessar e modificar o saldo de forma controlada: `get_saldo()`, `depositar(valor)` e `sacar(valor)`.
    - O método `sacar(valor)` deve verificar se há saldo suficiente e imprimir mensagens adequadas para diferentes condições.
    - Limite de depósito: R$ 10.000,00; Limite de saque: R$ 50.000,00.

## 4ª Tarefa: Loja Online
- **Objetivo:** Criar uma classe `Produto` com atributos privados `nome`, `preco` e `qtd_estoque`.
- **Descrição:**
    - Implemente métodos para acessar e modificar informações sobre os produtos.
    - Verifique se a atualização do estoque não deixará o valor negativo e imprima mensagens para diferentes condições de estoque.
    - Aplique descontos de 40% se o estoque for alto e retorne todas as informações do produto.

## 5ª Tarefa: Secretaria Escolar
- **Objetivo:** Criar uma classe `Aluno` com atributos privados `nome`, `matricula` e `notas`.
- **Descrição:**
    - Implemente métodos para acessar e modificar as informações dos alunos e calcular a média das notas.
    - Valide as notas com tratamento de exceções e imprima mensagens com base na média do aluno.

## 6ª Tarefa: Formas Geométricas
- **Objetivo:** Criar uma classe abstrata `Forma` com um método abstrato `calcular_area()`.
- **Descrição:**
    - Crie classes derivadas para `Quadrado`, `Círculo` e `Triângulo`, implementando o cálculo de área de cada forma.
    - Implemente tratamentos de exceção para entradas inválidas e verifique as condições de existência do triângulo.

## 7ª Tarefa: Meios de Transporte Polimórficos
- **Objetivo:** Criar uma classe base `MeioDeTransporte` com um método `mover()`.
- **Descrição:**
    - Crie classes derivadas para diferentes meios de transporte como `Carro`, `Avião`, `Moto`, `Jato`, `Quadriciclo` e `Bicicleta`.
    - Implemente o método `mover()` de forma específica para cada transporte.

## 8ª Tarefa: Sistema de Funcionários
- **Objetivo:** Criar uma classe `Funcionario` com atributos `nome`, `salario`, `matricula` e `cargo`.
- **Descrição:**
    - Implemente métodos para acessar e atualizar as informações dos funcionários.
    - Utilize encapsulamento para controlar o acesso e modificar os atributos de maneira segura e controlada.
    - Permita que o usuário atualize as informações do funcionário, como a matrícula e o cargo, e aplique um aumento salarial baseado em um percentual.

---


