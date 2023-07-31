class Motocicletta extends Veicolo {
    private boolean cavalletto;

    public Motocicletta(String numeroTarga, int annoImmatricolazione, boolean cavalletto) {
        super(numeroTarga, annoImmatricolazione);
        this.cavalletto = cavalletto;
    }
}
