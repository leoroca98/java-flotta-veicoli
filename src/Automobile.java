class Automobile extends Veicolo {
    private int numeroPorte;

    public Automobile(String numeroTarga, int annoImmatricolazione, int numeroPorte) {
        super(numeroTarga, annoImmatricolazione);
        this.numeroPorte = numeroPorte;
    }
}
