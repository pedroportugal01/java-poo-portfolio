package main;

import conta.Conta;
import corrente.ContaCorrente;
import poupanca.ContaPoupanca;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Conta> lista = new ArrayList<>();
        lista.add(new ContaPoupanca(1, 10000, 10));
        lista.add(new ContaCorrente(2, 5000, 80000));

        for(Conta conta : lista) {
            conta.depositar(2000);
            System.out.println(conta.getSaldoDisponivel());
        }

        // aplicar rendimento apenas na poupança
        for(Conta conta : lista) {
            if(conta instanceof ContaPoupanca) {
                ((ContaPoupanca) conta).aplicarRendimento();
            }
            System.out.println(conta.getSaldoDisponivel());
        }


    }
}