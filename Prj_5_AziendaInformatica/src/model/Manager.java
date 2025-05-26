package model;

public class Manager extends Dipendente {
    public Manager(String nome, int livello) {
        super(nome, "Manager", livello);
    }

    @Override
    public double calcolaStipendio() {
        return STIPENDIO_BASE * getLivello() * 1.5;
    }
}
