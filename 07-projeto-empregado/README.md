# 👨‍💼 Exercício 07 - Sistema de Gestão de Empregados

## 📖 Descrição

Este projeto consiste em um sistema simples de gerenciamento de empregados, desenvolvido em Java utilizando os principais conceitos da Programação Orientada a Objetos (POO).

A aplicação demonstra a utilização de herança, polimorfismo, classes abstratas e coleções (`ArrayList`), permitindo calcular o salário de diferentes tipos de empregados de acordo com suas características.

---

# 🎯 Objetivos

- Aplicar os conceitos de Herança.
- Utilizar Classes Abstratas.
- Implementar Polimorfismo.
- Trabalhar com sobrescrita de métodos (`@Override`).
- Manipular coleções utilizando `ArrayList`.
- Comparar o uso de vetores e listas dinâmicas.

---

# ⚙️ Funcionalidades

- Cadastro de empregados horistas.
- Cadastro de empregados comissionados.
- Cálculo automático do salário de acordo com o tipo de empregado.
- Armazenamento de objetos em vetores.
- Armazenamento de objetos em listas (`ArrayList`).
- Impressão das informações dos empregados.
- Demonstração do polimorfismo através da chamada do método `calcularSalario()`.

---

# 🛠️ Tecnologias Utilizadas

- Java
- IntelliJ IDEA
- Git
- GitHub
- Java Collections Framework (`ArrayList`)

---

# 📁 Estrutura do Projeto

```text
src/
├── Empregado.java
├── EmpregadoComissionado.java
├── EmpregadoHorista.java
├── Main.java
└── Main2.java
```

---

# 📚 Conceitos Praticados

- Programação Orientada a Objetos
- Herança
- Polimorfismo
- Classes Abstratas
- Métodos Abstratos
- Sobrescrita de métodos (`@Override`)
- Construtores
- Vetores de Objetos
- Collections (`ArrayList`)
- Laço `for`
- Laço `for-each`

---

# ▶️ Como executar

1. Abra o projeto no IntelliJ IDEA.
2. Execute a classe `Main.java` para visualizar o funcionamento utilizando vetores.
3. Execute a classe `Main2.java` para visualizar o funcionamento utilizando `ArrayList`.
4. Observe o cálculo do salário realizado de forma polimórfica para cada tipo de empregado.

---

# 💻 Estrutura do Sistema

O sistema possui uma classe abstrata chamada `Empregado`, responsável por definir os atributos e o comportamento comum a todos os empregados.

Duas classes especializadas herdam dessa classe:

- **EmpregadoHorista**
  - Calcula o salário com base nas horas trabalhadas.

- **EmpregadoComissionado**
  - Calcula o salário com base no total de vendas e percentual de comissão.

Cada classe implementa sua própria versão do método `calcularSalario()`, demonstrando o conceito de polimorfismo.

---

# 🚀 Aprendizados

Durante o desenvolvimento deste projeto foram praticados:

- Modelagem utilizando herança.
- Reutilização de código através de classes abstratas.
- Implementação de polimorfismo.
- Sobrescrita de métodos.
- Utilização de vetores de objetos.
- Utilização do `ArrayList`.
- Percurso de coleções utilizando `for` tradicional e `for-each`.

---

# 👨‍💻 Autor

Pedro Henrique Portugal de Andrade

Projeto desenvolvido durante a disciplina de Programação Orientada a Objetos (POO) – FIAP.