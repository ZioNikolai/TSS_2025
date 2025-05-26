package model;

public class Programmatore extends Dipendente {
    public Programmatore(String nome, int livello) {
        super(nome, "Programmatore", livello);
    }

    @Override
    public double calcolaStipendio() {
        return STIPENDIO_BASE * getLivello() * 1.2;
    }
}
