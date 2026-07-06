package petshop;

public class Gato extends Animal {
    private String tipoPelagem; // "Curto" ou "Longo"

    public Gato(String nome, double peso, String tipoPelagem) {
        super(nome, peso);
        this.tipoPelagem = tipoPelagem;
    }

    @Override
    public double calcularPrecoBase() {
        if (tipoPelagem.equalsIgnoreCase("Longo")) {
            return 65.00;
        }
        return 45.00; // Pelo curto por padrão
    }

    public String getTipoPelagem() {
        return tipoPelagem;
    }
}