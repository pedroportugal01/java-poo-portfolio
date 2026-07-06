package exercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Paciente paciente = new Paciente();
        double[] alvo;

        System.out.print("Nome --> ");
        paciente.nome = sc.nextLine();
        System.out.print("Idade --> ");
        paciente.idade = sc.nextInt();
        alvo = paciente.frequenciaAlvo();

        System.out.println("Paciente: " + paciente.nome);
        System.out.println("Frequência máxima: " + paciente.frequenciaMaxima());
        System.out.println("Intervalo da frequência alvo: [" + alvo[0] + ", " + alvo[1]+"]");


    }
}