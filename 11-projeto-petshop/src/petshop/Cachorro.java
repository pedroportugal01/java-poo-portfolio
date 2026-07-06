package petshop;

public class Cachorro extends Animal {

    public Cachorro(String nome, double peso) {
        super(nome, peso);
    }

    @Override
    public double calcularPrecoBase() {
        // Porte: pequeno (<= 10 kg) = 40, médio (<= 25 kg) = 60, grande (> 25 kg) = 85
        if (getPeso() <= 10) {
            return 40.00;
        } else if (getPeso() <= 25) {
            return 60.00;
        } else {
            return 85.00;
        }
    }
}