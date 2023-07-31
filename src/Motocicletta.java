public class Motocicletta extends Veicolo {
    private boolean hasCavalletto;

    public Motocicletta(String numeroTarga, int annoImmatricolazione, boolean hasCavalletto) {
        super(numeroTarga, annoImmatricolazione);
        this.hasCavalletto = hasCavalletto;
    }

    public boolean hasCavalletto() {
        return hasCavalletto;
    }

    @Override
    public String getTipo() {
        return "Motocicletta";
    }

    @Override
    public String toString() {
        return super.toString() + ", Cavalletto: " + (hasCavalletto ? "Presente" : "Assente");
    }
}