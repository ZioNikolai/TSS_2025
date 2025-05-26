package model;

public class HR extends Dipendente {
    public HR(String nome, int livello) {
        super(nome, "HR", livello);
    }

    @Override
    public double calcolaStipendio() {
        return STIPENDIO_BASE * getLivello() * 1.1;
    }
}
