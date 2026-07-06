package exercicio02;

public class Main {
    public static void main(String[] args) {
        SenhaAtendimento s1 = new SenhaAtendimento("Selmini");
        SenhaAtendimento s2 = new SenhaAtendimento("Ana");
        SenhaAtendimento s3 = new SenhaAtendimento("Maria");

        System.out.println(s1.getDados());
        System.out.println(s2.getDados());
        System.out.println(s3.getDados());

        System.out.println("Senha atual: " + SenhaAtendimento.controle);

    }
}