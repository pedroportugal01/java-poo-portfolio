public class Moto extends Veiculo {
    private int numCilindradas;

    public Moto(String placa, String marca, int numCilindradas) {
        super(placa, marca);
        this.numCilindradas = numCilindradas;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNúmero de cilindradas: " + numCilindradas;
    }

    public int getNumCilindradas() {
        return numCilindradas;
    }

    public void setNumCilindradas(int numCilindradas) {
        this.numCilindradas = numCilindradas;
    }
}