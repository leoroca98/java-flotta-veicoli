public class Automobile extends Veicolo {
    private int numeroPorte;

    public Automobile(String numeroTarga, int annoImmatricolazione, int numeroPorte) {
        super(numeroTarga, annoImmatricolazione);
        this.numeroPorte = numeroPorte;
    }

    public int getNumeroPorte() {
        return numeroPorte;
    }

    @Override
    public String getTipo() {
        return "Automobile";
    }

    @Override
    public String toString() {
        return super.toString() + ", Numero Porte: " + numeroPorte;
    }
}