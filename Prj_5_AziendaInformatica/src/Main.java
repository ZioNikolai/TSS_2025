import controller.RegistroAziendale;
import model.*;
import view.View;

public class Main {
    public static void main(String[] args) {
        RegistroAziendale registro = new RegistroAziendale();

        registro.aggiungiDipendente(new Programmatore("Luca", 3));
        registro.aggiungiDipendente(new HR("Marta", 2));
        registro.aggiungiDipendente(new Segretario("Giulia", 1));
        registro.aggiungiDipendente(new Manager("Silvia", 4));

        View.mostraDipendenti(registro.getTuttiIDipendenti());
        System.out.println();

        View.mostraDipendenti(registro.getDipendentiPerRuolo("Programmatore"));
        System.out.println();

        View.mostraPagamenti(registro.pagaStipendi());
    }
}
