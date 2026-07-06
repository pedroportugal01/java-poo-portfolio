package petshop;

public class Consulta extends Servico {

    public Consulta(int duracaoMinutos, Animal animalAtendido) {
        super("Consulta Veterinária", duracaoMinutos, animalAtendido);
    }

    @Override
    public double calcularCusto(Animal a) {
        // Fórmula: precoBase(animal) + 35.00
        return a.calcularPrecoBase() + 35.00;
    }
}