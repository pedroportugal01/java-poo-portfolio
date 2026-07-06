import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Veiculo> lista = new ArrayList<>();
        lista.add(new Carro("A", "Audi", 4));
        lista.add(new Moto("B", "Yamaha", 1200));
        lista.add(new Carro("C", "BMW", 2));

        for(Veiculo veiculo : lista) {
            System.out.println(veiculo); // veiculo.toString()
            System.out.println();
        }
    }
}