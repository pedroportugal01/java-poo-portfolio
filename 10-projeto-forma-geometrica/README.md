# 📐 Exercício 10 - Sistema de Formas Geométricas

## 📖 Descrição

Este projeto consiste em um sistema de representação de formas geométricas desenvolvido em Java utilizando os principais conceitos da Programação Orientada a Objetos (POO).

A aplicação permite criar diferentes tipos de formas, calcular suas áreas e, quando aplicável, calcular também seus volumes por meio da implementação de interfaces.

Além disso, o projeto demonstra o uso de listas (`List` e `LinkedList`) para armazenar diferentes objetos de forma polimórfica.

---

# 🎯 Objetivos

- Aplicar os conceitos de Herança.
- Trabalhar com Classes Abstratas.
- Implementar Interfaces.
- Demonstrar Polimorfismo.
- Utilizar Collections (`List` e `LinkedList`).
- Modelar formas geométricas utilizando composição entre classes.

---

# ⚙️ Funcionalidades

- Cadastro de círculos.
- Cadastro de cilindros.
- Cálculo da área das formas geométricas.
- Cálculo do volume dos sólidos.
- Armazenamento de diferentes objetos em uma mesma coleção.
- Impressão das informações das formas.

---

# 🛠️ Tecnologias Utilizadas

- Java
- IntelliJ IDEA
- Git
- GitHub
- Java Collections Framework (`List` e `LinkedList`)

---

# 📁 Estrutura do Projeto

```text
src/
└── br/
    └── techgeo/
        ├── forma/
        │   ├── Forma.java
        │   ├── Volume.java
        │   ├── Circulo.java
        │   └── Cilindro.java
        │
        ├── ponto/
        │   └── Ponto.java
        │
        └── main/
            └── Main.java
```

---

# 📚 Conceitos Praticados

- Programação Orientada a Objetos
- Classes Abstratas
- Interfaces
- Herança
- Polimorfismo
- Composição entre objetos
- Collections (`List`)
- `LinkedList`
- Operador `instanceof`
- Casting de interfaces
- Sobrescrita de métodos (`@Override`)
- Métodos abstratos

---

# ▶️ Como executar

1. Abra o projeto no IntelliJ IDEA.
2. Execute a classe `Main.java`.
3. Observe a criação das formas geométricas.
4. Verifique o cálculo da área de todas as formas.
5. Para os cilindros, observe também o cálculo do volume.

---

# 💻 Estrutura do Sistema

O sistema possui uma classe abstrata chamada `Forma`, responsável por definir o comportamento comum de todas as figuras geométricas.

As implementações disponíveis são:

- **Circulo**
    - Calcula apenas a área da figura.

- **Cilindro**
    - Calcula a área da superfície.
    - Implementa a interface `Volume`, permitindo calcular também o volume do sólido.

Além disso, cada forma possui um objeto da classe `Ponto`, responsável por armazenar suas coordenadas no plano cartesiano, demonstrando o conceito de composição entre objetos.

---

# 🚀 Aprendizados

Durante o desenvolvimento deste projeto foram praticados:

- Modelagem utilizando classes abstratas.
- Implementação de interfaces.
- Reutilização de código através da herança.
- Polimorfismo entre classes e interfaces.
- Armazenamento de objetos utilizando `List` e `LinkedList`.
- Utilização do operador `instanceof` para identificar objetos que implementam uma interface.
- Cálculo de áreas e volumes utilizando fórmulas matemáticas.

---

# 👨‍💻 Autor

Pedro Henrique Portugal de Andrade

Projeto desenvolvido durante a disciplina de Programação Orientada a Objetos (POO) – FIAP.