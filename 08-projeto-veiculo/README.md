# 🚗 Exercício 08 - Sistema de Cadastro de Veículos

## 📖 Descrição

Este projeto consiste em um sistema simples de cadastro de veículos desenvolvido em Java utilizando os conceitos da Programação Orientada a Objetos (POO).

A aplicação demonstra a utilização de herança, polimorfismo, classes abstratas e sobrescrita do método `toString()`, permitindo armazenar diferentes tipos de veículos em uma única coleção.

---

# 🎯 Objetivos

- Aplicar os conceitos de Herança.
- Utilizar Classes Abstratas.
- Demonstrar Polimorfismo.
- Sobrescrever métodos utilizando `@Override`.
- Trabalhar com coleções (`ArrayList`).
- Personalizar a representação dos objetos através do método `toString()`.

---

# ⚙️ Funcionalidades

- Cadastro de carros.
- Cadastro de motocicletas.
- Armazenamento de diferentes tipos de veículos em uma única lista.
- Impressão das informações de cada veículo.
- Exibição automática das características específicas de cada tipo de veículo.

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
├── Veiculo.java
├── Carro.java
├── Moto.java
└── Main.java
```

---

# 📚 Conceitos Praticados

- Programação Orientada a Objetos
- Classes Abstratas
- Herança
- Polimorfismo
- Sobrescrita de métodos (`@Override`)
- Método `toString()`
- Encapsulamento
- Getters e Setters
- Collections (`ArrayList`)
- Laço `for-each`

---

# ▶️ Como executar

1. Abra o projeto no IntelliJ IDEA.
2. Execute a classe `Main.java`.
3. Observe a criação de diferentes tipos de veículos.
4. Verifique como o método `toString()` exibe automaticamente as informações específicas de cada objeto.

---

# 💻 Estrutura do Sistema

O sistema possui uma classe abstrata chamada `Veiculo`, responsável por armazenar as informações comuns a todos os veículos.

Duas classes especializadas herdam dessa classe:

- **Carro**
    - Armazena o número de portas.

- **Moto**
    - Armazena a quantidade de cilindradas.

Cada classe sobrescreve o método `toString()`, adicionando suas informações específicas e demonstrando o conceito de polimorfismo.

---

# 🚀 Aprendizados

Durante o desenvolvimento deste projeto foram praticados:

- Modelagem utilizando herança.
- Criação de classes abstratas.
- Reutilização de código entre classes.
- Sobrescrita do método `toString()`.
- Armazenamento de objetos em coleções (`ArrayList`).
- Impressão polimórfica de objetos.

---

# 👨‍💻 Autor

Pedro Henrique Portugal de Andrade

Projeto desenvolvido durante a disciplina de Programação Orientada a Objetos (POO) – FIAP.