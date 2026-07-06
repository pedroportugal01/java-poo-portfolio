import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Aluno a = new Aluno();
        Scanner sc = new Scanner(System.in);

        System.out.print("RM: ");
        a.rm = sc.nextInt();
        System.out.print("Nome: ");
        a.nome = sc.next();
        System.out.print("Curso: ");
        a.curso = sc.next();
        System.out.print("Nota 1: ");
        a.nota1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        a.nota2 = sc.nextDouble();

        System.out.println("média = " + a.calcularMedia());
        System.out.println("situação = " + a.status());
    }
}