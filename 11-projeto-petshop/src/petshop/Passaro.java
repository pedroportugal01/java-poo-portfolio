package petshop;

public class Passaro extends Animal {

    public Passaro(String nome, double peso) {
        super(nome, peso);
    }

    @Override
    public double calcularPrecoBase() {
        return 30.00; // Preço base fixo
    }
}