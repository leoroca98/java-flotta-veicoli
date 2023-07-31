public abstract class Veicolo {
    private String numeroTarga;
    private int annoImmatricolazione;

    public Veicolo(String numeroTarga, int annoImmatricolazione) {
        this.numeroTarga = numeroTarga;
        this.annoImmatricolazione = annoImmatricolazione;
    }

    public String getNumeroTarga() {
        return numeroTarga;
    }

    public int getAnnoImmatricolazione() {
        return annoImmatricolazione;
    }

    public abstract String getTipo();

    @Override
    public String toString() {
        return "Tipo: " + getTipo() + ", Numero Targa: " + numeroTarga + ", Anno Immatricolazione: " + annoImmatricolazione;
    }
}