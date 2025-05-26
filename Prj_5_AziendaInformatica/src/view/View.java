package view;

import model.Dipendente;
import java.util.List;

public class View {
    public static void mostraDipendenti(List<Dipendente> lista) {
        System.out.println("--- Elenco Dipendenti ---");
        for (Dipendente d : lista) {
            System.out.println(d);
        }
    }

    public static void mostraPagamenti(List<String> pagamenti) {
        System.out.println("--- Pagamento Stipendi ---");
        for (String p : pagamenti) {
            System.out.println(p);
        }
    }
}
