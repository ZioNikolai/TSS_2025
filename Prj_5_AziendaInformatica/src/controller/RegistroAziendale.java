package controller;

import model.Dipendente;
import java.util.ArrayList;
import java.util.List;

public class RegistroAziendale {
    private List<Dipendente> dipendenti = new ArrayList<>();

    public void aggiungiDipendente(Dipendente d) {
        dipendenti.add(d);
    }

    public List<Dipendente> getTuttiIDipendenti() {
        return dipendenti;
    }

    public List<Dipendente> getDipendentiPerRuolo(String ruolo) {
        List<Dipendente> filtrati = new ArrayList<>();
        for (Dipendente d : dipendenti) {
            if (d.getRuolo().equalsIgnoreCase(ruolo)) {
                filtrati.add(d);
            }
        }
        return filtrati;
    }

    public List<String> pagaStipendi() {
        List<String> pagamenti = new ArrayList<>();
        for (Dipendente d : dipendenti) {
            pagamenti.add(d.getNome() + ": " + d.calcolaStipendio() + " €");
        }
        return pagamenti;
    }
}
