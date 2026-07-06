# 🏦 Exercício 09 - Sistema de Contas Bancárias

## 📖 Descrição

Este projeto consiste em um sistema simplificado de gerenciamento de contas bancárias desenvolvido em Java utilizando os conceitos da Programação Orientada a Objetos (POO).

A aplicação demonstra como diferentes tipos de contas podem compartilhar características em comum através da herança, além de implementar comportamentos específicos utilizando polimorfismo, sobrescrita de métodos e verificação de tipos em tempo de execução.

---

# 🎯 Objetivos

- Aplicar os conceitos de Herança.
- Demonstrar o Polimorfismo.
- Trabalhar com Upcasting e Downcasting.
- Utilizar o operador `instanceof`.
- Implementar sobrescrita de métodos (`@Override`).
- Manipular objetos em coleções (`ArrayList`).

---

# ⚙️ Funcionalidades

- Cadastro de contas bancárias.
- Cadastro de contas correntes.
- Cadastro de contas poupança.
- Realização de depósitos.
- Consulta do saldo disponível.
- Aplicação de rendimento em contas poupança.
- Utilização do limite disponível em contas correntes.

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
├── conta/
│   └── Conta.java
│
├── corrente/
│   └── ContaCorrente.java
│
├── poupanca/
│   └── ContaPoupanca.java
│
└── main/
    └── Main.java
```

---

# 📚 Conceitos Praticados

- Programação Orientada a Objetos
- Herança
- Polimorfismo
- Encapsulamento
- Sobrescrita de métodos (`@Override`)
- Upcasting
- Downcasting
- Operador `instanceof`
- Collections (`ArrayList`)
- Métodos específicos por tipo de objeto

---

# ▶️ Como executar

1. Abra o projeto no IntelliJ IDEA.
2. Execute a classe `Main.java`.
3. Observe a criação de diferentes tipos de contas bancárias.
4. Verifique o funcionamento dos depósitos, do saldo disponível e da aplicação de rendimento nas contas poupança.

---

# 💻 Estrutura do Sistema

O sistema possui uma classe base chamada `Conta`, responsável por armazenar os dados comuns de qualquer conta bancária.

A partir dela foram desenvolvidas duas especializações:

- **ContaCorrente**
    - Possui limite adicional disponível para utilização.
    - Sobrescreve o método `getSaldoDisponivel()` para considerar o limite da conta.

- **ContaPoupanca**
    - Possui uma taxa de rendimento.
    - Implementa um método específico para aplicar o rendimento ao saldo.

Durante a execução, o sistema utiliza o operador `instanceof` para identificar quando um objeto é do tipo `ContaPoupanca`, realizando o downcasting para aplicar o rendimento apenas às contas desse tipo.

---

# 🚀 Aprendizados

Durante o desenvolvimento deste projeto foram praticados:

- Reutilização de código através da herança.
- Especialização de comportamentos utilizando polimorfismo.
- Sobrescrita de métodos.
- Utilização de Upcasting e Downcasting.
- Identificação de objetos utilizando `instanceof`.
- Manipulação de diferentes tipos de objetos em uma mesma coleção.

---

# 👨‍💻 Autor

Pedro Henrique Portugal de Andrade

Projeto desenvolvido durante a disciplina de Programação Orientada a Objetos (POO) – FIAP.