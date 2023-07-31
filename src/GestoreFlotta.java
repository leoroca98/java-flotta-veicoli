import java.util.ArrayList;
import java.util.List;

public class GestoreFlotta {
    private List<Veicolo> flotta;

    public GestoreFlotta() {
        flotta = new ArrayList<>();
    }

    public void aggiungiVeicolo(Veicolo veicolo) {
        flotta.add(veicolo);
    }

    public int contaVeicoliTipo(String tipo) {
        int count = 0;
        for (Veicolo veicolo : flotta) {
            if (veicolo.getTipo().equalsIgnoreCase(tipo)) {
                count++;
            }
        }
        return count;
    }

    public Veicolo trovaVeicoloPerTarga(String numeroTarga) {
        for (Veicolo veicolo : flotta) {
            if (veicolo.getNumeroTarga().equalsIgnoreCase(numeroTarga)) {
                return veicolo;
            }
        }
        return null;
    }

    public void visualizzaFlotta() {
        for (Veicolo veicolo : flotta) {
            System.out.println(veicolo);
        }
    }
}