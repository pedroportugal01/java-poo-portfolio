package petshop;

public class Banho extends Servico {

    public Banho(int duracaoMinutos, Animal animalAtendido) {
        super("Banho Higiênico", duracaoMinutos, animalAtendido);
    }

    @Override
    public double calcularCusto(Animal a) {
        // Fórmula: precoBase(animal) + (duracaoMinutos * 0.50)
        return a.calcularPrecoBase() + (getDuracaoMinutos() * 0.50);
    }
}