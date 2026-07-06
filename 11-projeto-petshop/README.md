# 🐾 Exercício 11 - Sistema de Gerenciamento de Pet Shop

## 📖 Descrição

Este projeto consiste em um sistema de gerenciamento para um Pet Shop desenvolvido em Java utilizando os principais conceitos da Programação Orientada a Objetos (POO).

A aplicação permite cadastrar animais, registrar serviços realizados, calcular automaticamente os custos dos atendimentos e gerar relatórios de faturamento.

O sistema foi desenvolvido utilizando interface gráfica com **JOptionPane**, tornando a interação mais intuitiva para o usuário.

---

# 🎯 Objetivos

- Aplicar os principais conceitos da Programação Orientada a Objetos.
- Utilizar Classes Abstratas e Interfaces.
- Demonstrar Herança e Polimorfismo.
- Implementar Encapsulamento.
- Trabalhar com Collections (`ArrayList`).
- Aplicar regras de negócio em um sistema real.

---

# ⚙️ Funcionalidades

## Cadastro de animais

O sistema permite cadastrar diferentes tipos de animais:

- 🐶 Cachorros
- 🐱 Gatos
- 🐦 Pássaros

Cada tipo possui sua própria regra para cálculo do preço base do atendimento.

---

## Registro de serviços

É possível registrar diferentes serviços para cada animal cadastrado.

Serviços disponíveis:

- Banho Higiênico
- Consulta Veterinária

Cada serviço possui uma forma diferente de cálculo do custo.

---

## Regras de negócio

O sistema implementa regras específicas, como:

- cálculo automático do preço conforme o tipo do animal;
- cálculo do custo do serviço;
- proibição de banho para pássaros;
- cálculo do faturamento diário;
- geração de relatório completo dos atendimentos.

---

## Relatórios

O sistema permite visualizar:

- animais atendidos;
- serviço realizado;
- custo individual;
- faturamento total do dia.

---

# 🛠️ Tecnologias Utilizadas

- Java
- IntelliJ IDEA
- Git
- GitHub
- Swing (`JOptionPane`)
- Java Collections Framework (`ArrayList`)

---

# 📁 Estrutura do Projeto

```text
src/
└── petshop/
    ├── Animal.java
    ├── Cachorro.java
    ├── Gato.java
    ├── Passaro.java
    ├── Servico.java
    ├── Banho.java
    ├── Consulta.java
    ├── Calculavel.java
    ├── Relatorio.java
    └── PetShop.java
```

---

# 📚 Conceitos Praticados

- Programação Orientada a Objetos
- Classes Abstratas
- Interfaces
- Herança
- Polimorfismo
- Encapsulamento
- Sobrescrita de métodos (`@Override`)
- Métodos Abstratos
- Collections (`ArrayList`)
- Interface Gráfica (`JOptionPane`)
- Regras de Negócio
- Associação entre Objetos
- Operador `instanceof`
- Princípios de reutilização de código

---

# ▶️ Como executar

1. Abra o projeto no IntelliJ IDEA.
2. Execute a classe `PetShop.java`.
3. Utilize o menu principal para acessar as funcionalidades do sistema.
4. Cadastre animais, registre serviços e consulte os relatórios gerados.

---

# 💻 Funcionalidades do Sistema

O menu principal permite realizar as seguintes operações:

```text
Cadastrar Animal

Registrar Serviço

Calcular Conta Total

Exibir Relatório

Finalizar
```

---

# 🏗️ Estrutura da Aplicação

O projeto foi organizado seguindo uma arquitetura orientada a objetos.

### Classe Abstrata

- **Animal**
    - Define o comportamento comum de todos os animais.

### Especializações

- Cachorro
- Gato
- Passaro

Cada uma implementa sua própria regra de cálculo do preço base.

---

### Classe Abstrata

- **Servico**

Especializações:

- Banho
- Consulta

Cada serviço implementa sua própria forma de calcular o custo do atendimento.

---

### Interfaces

O sistema utiliza duas interfaces:

- **Calculavel**
    - Responsável pelo cálculo do faturamento total.

- **Relatorio**
    - Responsável pela geração do relatório diário de atendimentos.

---

# 🚀 Aprendizados

Durante o desenvolvimento deste projeto foram praticados:

- Modelagem completa utilizando Programação Orientada a Objetos.
- Criação de Classes Abstratas.
- Implementação de Interfaces.
- Aplicação de Herança e Polimorfismo.
- Encapsulamento de atributos.
- Organização de regras de negócio.
- Desenvolvimento de interface gráfica utilizando Swing.
- Manipulação de coleções com `ArrayList`.
- Geração automática de relatórios.
- Desenvolvimento de um sistema completo seguindo boas práticas de POO.

---

# 👨‍💻 Autor

Pedro Henrique Portugal de Andrade

Projeto desenvolvido durante a disciplina de Programação Orientada a Objetos (POO) – FIAP.