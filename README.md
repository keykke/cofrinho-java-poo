# 🪙 Cofrinho de Moedas - Simulador em Java

Este é um projeto console desenvolvido em Java que simula o funcionamento de um cofrinho de moedas multicâmbio. O sistema permite gerenciar diferentes tipos de moedas (Real, Dólar e Euro), realizar adições, remoções, listagem de itens e o cálculo do valor total convertido para a moeda local (Real).

Projeto desenvolvido como parte dos estudos de **Sistemas de Informação** para fixação de conceitos de Programação Orientada a Objetos (POO).

---

## 🛠️ Conceitos de POO Aplicados

O principal objetivo deste projeto foi aplicar na prática os pilares da Orientação a Objetos:

* **Abstração e Herança:** Criação da classe abstrata `Moeda` que serve como molde genérico para as classes filhas `Real`, `Dolar` e `Euro`.
* **Polimorfismo:** A classe `Cofrinho` gerencia uma lista genérica de moedas (`ArrayList<Moeda>`) e invoca os métodos `info()` e `converter()` de forma polimórfica, deixando que cada classe filha resolva sua própria lógica de conversão e exibição.
* **Encapsulamento:** Atributos protegidos e métodos públicos garantindo a segurança dos dados internos do cofre.
* **Sobrescrita de Métodos (Override):** Implementação personalizada do método `equals` na classe mãe para possibilitar a busca e remoção correta de objetos específicos dentro do `ArrayList`.
* **Tratamento de Exceções:** Uso de blocos `try-catch` capturando `InputMismatchException` para garantir a robustez do menu interativo contra entradas inválidas do usuário.

---

## 🚀 Como Executar o Projeto

### Pré-requisitos
* Java JDK 21 ou superior instalado.

### Passo a Passo
1. Clone o repositório:
   ```bash
   git clone https://github.com/keykke/cofrinho-java-poo.git
