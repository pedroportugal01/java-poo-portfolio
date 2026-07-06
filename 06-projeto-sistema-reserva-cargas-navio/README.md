# 🚢 Exercício 06 - Sistema de Reserva de Cargas

## 📖 Descrição

Este projeto consiste em um sistema de reserva de cargas para um navio, desenvolvido em Java utilizando os conceitos da Programação Orientada a Objetos (POO).

A aplicação permite cadastrar clientes, registrar cargas destinadas ao transporte marítimo e controlar a capacidade máxima do navio, garantindo que o limite de peso não seja ultrapassado.

A interface da aplicação foi desenvolvida utilizando caixas de diálogo (`JOptionPane`), proporcionando uma interação simples e intuitiva com o usuário.

---

# 🎯 Objetivos

- Aplicar os conceitos da Programação Orientada a Objetos.
- Trabalhar com encapsulamento.
- Organizar aplicações utilizando pacotes.
- Desenvolver relacionamentos entre classes.
- Controlar regras de negócio através de métodos.
- Utilizar interface gráfica simples com `JOptionPane`.

---

# ⚙️ Funcionalidades

- Cadastro de clientes.
- Reserva de cargas.
- Geração automática do identificador da carga.
- Geração automática do peso da carga.
- Controle da capacidade máxima do navio.
- Exibição das cargas cadastradas.
- Validação da capacidade disponível antes da reserva.

---

# 🛠️ Tecnologias Utilizadas

- Java
- IntelliJ IDEA
- Git
- GitHub
- Swing (`JOptionPane`)

---

# 📁 Estrutura do Projeto

```text
src/
├── carga/
│   └── Carga.java
│
├── cliente/
│   └── Cliente.java
│
├── navio/
│   └── Navio.java
│
├── util/
│   └── Util.java
│
└── main/
    └── Main.java
```

---

# 📚 Conceitos Praticados

- Programação Orientada a Objetos
- Classes e Objetos
- Encapsulamento (`private`)
- Construtores
- Métodos Getters e Setters
- Organização em Pacotes
- Associação entre Classes
- Vetores de Objetos
- Regras de negócio
- Geração de números aleatórios (`Random`)
- Formatação de valores (`DecimalFormat`)
- Interface gráfica com `JOptionPane`

---

# ▶️ Como executar

1. Abra o projeto no IntelliJ IDEA.
2. Execute a classe `Main.java`.
3. Utilize o menu apresentado para realizar as operações disponíveis.
4. Cadastre clientes e realize reservas de cargas.
5. Consulte as cargas cadastradas quando desejar.

---

# 💻 Menu da aplicação

```text
Reserva de Cargas Boa Viagem

[1] Reservar
[2] Pesquisar
[3] Exibir
[4] Capacidade reservada
[5] Cancelar
[6] Finalizar
```

---

# 🚀 Aprendizados

Durante o desenvolvimento deste projeto foram praticados:

- Modelagem de um sistema orientado a objetos.
- Organização do código em pacotes.
- Encapsulamento dos atributos.
- Relacionamento entre Cliente, Carga e Navio.
- Controle de capacidade utilizando regras de negócio.
- Desenvolvimento de uma interface gráfica simples utilizando Swing.

---

# 👨‍💻 Autor

Pedro Henrique Portugal de Andrade

Projeto desenvolvido durante a disciplina de Programação Orientada a Objetos (POO) – FIAP.