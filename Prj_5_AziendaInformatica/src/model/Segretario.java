package model;

public class Segretario extends Dipendente {
    public Segretario(String nome, int livello) {
        super(nome, "Segretario", livello);
    }

    @Override
    public double calcolaStipendio() {
        return STIPENDIO_BASE * getLivello() * 1.05;
    }
}
