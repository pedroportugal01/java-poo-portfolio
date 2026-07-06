package petshop;

public abstract class Servico {
    private String descricao;
    private int duracaoMinutos;
    private Animal animalAtendido; // Armazena qual animal recebeu o serviço para o relatório

    public Servico(String descricao, int duracaoMinutos, Animal animalAtendido) {
        this.descricao = descricao;
        this.duracaoMinutos = duracaoMinutos;
        this.animalAtendido = animalAtendido;
    }

    // Método polimórfico abstrato exigido
    public abstract double calcularCusto(Animal a);

    public String getDescricao() {
        return descricao;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public Animal getAnimalAtendido() {
        return animalAtendido;
    }
}