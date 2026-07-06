import java.util.Scanner;

public class Aluno {
    // atributos ou propriedades ou variáveis de instância (--> objeto)
    String nome;
    String curso;
    int rm;
    double nota1;
    double nota2;

    public double calcularMedia() {
        double media = (nota1 + nota2) / 2;
        return media;
    }

    public String status() {
        double media = calcularMedia();
        if(media >= 6) {
            return "Aprovado";
        }
        return "Reprovado";
    }

}